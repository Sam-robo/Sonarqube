package Study;

public class Palindrome {
	public static void main(String[] args) {
		String s="Sameer";
		String a="madam";
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		for(int j=a.length()-1;i>=0;i--)
		{
			//charAt() method returns the character at the specified index in a string.
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		// String contains() method checks whether a particular string is a part of another string or not
		if(s.contains(s1))
		{
			System.out.println("it is palindrome");
		}
		else
			System.out.println("it is not palindrome");
		
	}

}
