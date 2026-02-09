package javaconcepts;

public class JavaClass1 {

	public static void main(String[] args) {
		
		//data types
		int a=10;
		String s="Anvesh";
		float f=1.21f;
		double d=12212.99;
		boolean b=true;
		char c='a';

		// Arrays
		int[] nums=new int[5];
		nums[0]=6;
		nums[1]=5;
		nums[2]=4;
		nums[3]=3;
		nums[4]=2;
		
		//Arrays other way
		int[] abc= {9,8,7,6,5};
		System.out.println("integer value as "+a);
		System.out.println(abc[2]);
		
		//for loop
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		System.out.println("###############");
		for(int i=0;i<abc.length;i++) {
			System.out.println(abc[i]);
		}
		System.out.println("*****************");
		//foreach loop
		for(int single:nums) {
			System.out.println(single);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		String[] names= {"Java", "API", "selenium", "burp suire", "zap"};
		
		for(String eachname:names)
		{
			System.out.println(eachname);
		}
		System.out.println("**********************");
		//display number divisible by 2 values
		
		int[] aaa= {1,2,4,6,8,80,122,3,45,67,78,44,1299};
		for(int i=0;i<aaa.length;i++) {
			if(aaa[i]%2==0) {
				System.out.println(aaa[i]);
			}
			else {
				System.out.println(aaa[i]+" number is not divisible by 2");
			}
		}
		
		
	}

}
