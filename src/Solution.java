// you can also use imports, for example:
import java.util.Arrays;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	
    	Arrays.sort(A);
    	
    	int day = 0;
    	int ctr = 0;
    	int amt = 0;
    	
    	// validate days
    	if(A.length>30) {
    		System.out.println("Invalid input");
    	}else if(A.length>21) {
    		return 25;
    	}
    		
    	for(int i=0; i<A.length;i++) {
    		
    		int currDay = A[i];

    		// first entry
    		if(i==0){ 
    			ctr++;
    			day = currDay;
    			continue;
    		}
    		
    		// skip duplicate entry
    		if(day == currDay) {
    			continue;
    		} else {
    			if(currDay == (day+1) || currDay == (day+2) ||
        				currDay == (day+3) || currDay == (day+4)) {
        			ctr++;
        		} else {
        			
        			// less than 7 days
        			if(ctr<=3) {
        				amt = amt+ (ctr * 2);
        				// reset counter
        				ctr = 0;
        			}
        		}
        		
        		// 7 days bracket
        		if(ctr>3 && ctr<8 ) {
        			amt = amt + 7;
    				// reset counter
    				ctr = 0;
        		}
        		
        		day = currDay;
    		}
    	}
    	
    	return amt;
    }
    
    public static void main(String[] args) {
    	
    	int arr[] = {2, 1, 9, 6, 4};
    	
    	int solution = solution(arr);
    	
    	System.out.println(solution);
    }
}

