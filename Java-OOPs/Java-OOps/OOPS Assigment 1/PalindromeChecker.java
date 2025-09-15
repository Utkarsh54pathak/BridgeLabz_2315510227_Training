// Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
// Check if the text is a palindrome.
// Display the result.
// Explanation: The PalindromeChecker class holds the text attribute. The methods operate on this attribute to verify its palindrome status and display the result.

public class PalindromeChecker {
	String text;
	
	PalindromeChecker(String text) {
		this.text=text;
		
	}
	public boolean isPalindrome() {
	String cleantext=text.replaceAll("\\s","").toLowerCase();
	
	String reverseText=new StringBuilder(cleantext).reverse().toString();
	
	return cleantext.equals(reverseText);
	}
	
	public void diplayResult() {
		if(isPalindrome()) {
			System.out.println(text+" is palindrome");
			}
		else {
			System.out.println(text+" is not Palindrome");
		}
	}
	public static void main(String[] args) {
		 PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
		 checker1.diplayResult();
		
		 PalindromeChecker checker2 = new PalindromeChecker("Hello");
		 checker2.diplayResult();
	}
}
