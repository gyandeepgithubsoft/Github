package doubtProgrames;

public class StringReversal {
	
	    public static void main(String[] args) {
	        String str = "Gyandeep";
	        String reversedStr = reverseString(str);
	        System.out.println("Original string: " + str);
	        System.out.println("Reversed string: " + reversedStr);
	    }
	    
	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.reverse();
	        return sb.toString();
	    }
	}

	
	
	


