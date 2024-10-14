package stack_examples;

import java.util.Scanner;

public class Wellness_Control {

	static boolean check_welness(String word) {
		Stack_Char_class obj = new Stack_Char_class();
		obj.create_Stack(word.length());
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == '{')
				obj.push('{');
			else if (word.charAt(index) == '}') {
				if (obj.is_Empty() != true) {
					char g = obj.pop();
				} else
					return false;
			}
		}
		return obj.is_Empty();
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter data:");
		String word = in.next();// read word from user
		System.out.println(word + "is balanced:" + check_welness(word));
	}
}
