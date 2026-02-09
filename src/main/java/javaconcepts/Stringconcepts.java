package javaconcepts;

public class Stringconcepts {

	public static void main(String[] args) {
		//String is an object
		//String literal(it's immutable bcoz it will create one time object and for every time ref variable pointing to same object) 
		String s="Automation Testing";
		String s1="Automation Testing";
		
		//new operator(for each and every time new object created with the help of new operator)
		String s2=new String("Manual Testing");
		String s3=new String("Manual Testing");
		
		//Split string into parts with the help of split()
		String s4 = "Rahul Shetty Academy";
		String[] stringarraysplitted=s4.split(" ");//splitted each space
		System.out.println(stringarraysplitted[0]);
		System.out.println(stringarraysplitted[1]);
		System.out.println(stringarraysplitted[2]);
		System.out.println("**************");
		String[] splittedshetty=s4.split("Shetty");//splitted with Shetty
		System.out.println(splittedshetty[0]);
		System.out.println(splittedshetty[1].trim());//removed the space before the text using trim() method
		
		String s5="Testing 1234567";
		//i want to display only words and remove digits from the above string.
		String beforesplit=s5.replaceAll("\\d", "");
		System.out.println(beforesplit);
		System.out.println(beforesplit.trim());//remove extra space after "testing "
		//i want to print each character in a string using charAt() method
		System.out.println("*****************");
		String s6="Senior Testing Engineer";
		System.out.println(s6);
		for(int i=0;i<s6.length();i++) {
			System.out.println(s6.charAt(i));
		}
		System.out.println("&&&&&&&&&&&&&&&&&");
		//i want to print the String in reverse order
		for(int i=s6.length()-1;i>=0;i--) {
			System.out.println(s6.charAt(i));
		}
		
		
		
		

	}

}
