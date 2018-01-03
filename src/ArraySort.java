import java.util.Scanner;

public class ArraySort
{
	public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        int inputNumbers[]=new int[10];
        int orderedInput[]=new int[10];
        int order;
        
        String choice;

        // ASK FOR INPUT
        System.out.println("Enter 10 numbers in any order.. .");
        
        for (int i=0;i<inputNumbers.length;i++) {
        	
            System.out.print(i+1+": ");
            inputNumbers[i] = scan.nextInt();
        }
        
        // SORT INPUT BY ASCENDING INITIALLY
        for(int a=0;a<inputNumbers.length;a++) {
           
        	int index=0;
            
        	for(int b=0;b<inputNumbers.length;b++) {
               
        		if(inputNumbers[b]>inputNumbers[b]) {
        			index++;
                }
            }

        	while (orderedInput[index] == inputNumbers[a]) {
        		index++;
        	}

        	orderedInput[index] = inputNumbers[a];
        }

        // ASK FOR SORT OPTION
        System.out.println("Sort by?");
        System.out.println("A - Ascending");
        System.out.println("D - Descending");
        System.out.print("Enter your choice: ");
        choice = scan.next();

        // DISPLAY RESULT BY CHOICE
        if(choice.equalsIgnoreCase("a")){
        	
            for(order=0;order<orderedInput.length;order++) {
            	
                System.out.print(orderedInput[order]+" ");
            }
        } else if(choice.equalsIgnoreCase("d")) {
        	
            for(order=9;order>-1;order--) {
            	
                System.out.print(orderedInput[order]+" ");
            }
        } else {
        	System.out.print("Invalid Input for Sort Order!");
        }
    }
}