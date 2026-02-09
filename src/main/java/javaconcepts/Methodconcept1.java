package javaconcepts;

public class Methodconcept1 {

	public static void main(String[] args) {
		Methodconcept1 mc=new Methodconcept1();
		mc.getdata();//creating object for the class and using the ref var to execute that method
		getdata2();//static method call directly
		//i want to print return type output
		String returntype=mc.getdata3();
		System.out.println(returntype);
		//new object created for other class to access that methods
		Methodconcept2 mc2=new Methodconcept2();
		mc2.getdata4();
		
	}
	
	//i have created one method i.e public and non static and no return type
	public void getdata() {
		System.out.println("here i am using a public, non static and return type as void");
	}
	
	//i have created static method then we can cal directly without creating the object
	public static void getdata2() {
		System.out.println("here static method and public and return type as void");
	}
	
	//return type as string and public and non static method
	public String getdata3() {
		return "return type as String";
	}

}
