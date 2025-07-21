package javaCore;

public class ForLoopEach {

	public static void main(String[] args) {
		int a[]= {10,12,34,11,34,46};
		for(int i:a) {
			System.out.println(i);
		}
		
		char b[]= {'a','b','c','d','e'};
		for(char j:b) 
		{
			System.out.print(j+" ");
		}
		System.out.println();
		
		String c[]= {"java","programming","learning"};
		for(String k:c)
		{
		System.out.print(k+" ");	
		}
		

	}

}
