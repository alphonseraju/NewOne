
  package StudentClass;

public class macos {
	public static class StringExample {
	    public static void main(String[] args) {
	      
	        String str1 = "Macos";
	        String str2 = "System IOS";
	        String result = str1 + " " + str2;
	        System.out.println("Concatenated String: " + result);
	        int length = result.length();
	        System.out.println("Length of the String: " + length);

	        String sub = result.substring(0, 5);
	        System.out.println("Substring: " + sub);
	        int index = result.indexOf("System IOS");
	        System.out.println("Index of 'System IOS': " + index);

	        String compareStr = "Mac os System IOS";
	        boolean isEqual = result.equals(compareStr);
	        System.out.println("Strings are equal: " + isEqual);
	    }
	}





}
