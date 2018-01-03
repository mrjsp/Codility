import java.util.LinkedHashMap;

public class Zen {
	
	public static String solution(String A) {
		
		String result = "";
		String[] parts = A.split(" ");
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();  
		
		for(int i=0;i<parts.length;i++) {
			
			String key = parts[i];
			
			if(!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				map.put(key,(map.get(key)+1));
			}
		}
		
		for (String key : map.keySet()) {
			result += key + "(" + map.get(key) + ") ";
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String input = "7 4 3 3 6 3 1 1 5 6 1";
    	
    	System.out.println(solution(input));
    }
}

