import java.util.Arrays;

public class isUnique{
	public static boolean unique(String s){
		//first we gotta convert the string to a character array
		char[] ch = new char[s.length()]; 
		for(int i = 0; i < s.length(); i++){
			ch[i] = s.charAt(i); 
		} // can use this or .toCharArray() method (might need to be imported)

		//sort the char array 
		Arrays.sort(ch); //;p 

		//loop through sorted character array and keep track 
		for(int i = 0; i < ch.length-1; i++){
			if(ch[i] == ch[i+1]){ //checks if two ajacent chars are the same
				return false; 
			}
		}
		return true; 
	}
	
	public static void main(String[] args){
		String test1 = "abcdefg"; 
		String test2 = "afbcdfh"; 

		System.out.println(unique(test1)); 
		System.out.println(unique(test2)); 
	}
}