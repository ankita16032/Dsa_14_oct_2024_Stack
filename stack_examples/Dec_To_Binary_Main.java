package stack_examples;

import java.util.Scanner;

public class Dec_To_Binary_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = sc.nextInt();
		
		Dec_to_Binary obj = new Dec_to_Binary();
		obj.create_Stack(number);
		//obj.create_Stack(size:64);
		while(number>0)
		{
			int bit =number%2;
			number=number/2;
			obj.push(bit);
		}
		System.out.println("Binary is: ");
		while(obj.is_Empty()!=true)
			System.out.println(obj.pop());
//		for (int i = 0; i < number; i++)
//		{
//			if(number!=0)
//			{
//				int rem=number%2;
//				number=number/2;
//				obj.push(rem);
//			}
//			obj.print_Stack();
//		}
			
	}
}
