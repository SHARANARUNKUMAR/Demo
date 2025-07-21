package javaCore;
import java.util.Scanner;


public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("you are an adult");
			
		}
		else {
			System.out.println("you are not an adult");
			
		}
		

	}

}
