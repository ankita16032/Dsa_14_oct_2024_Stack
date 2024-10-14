package stack_examples;

import java.util.Scanner;

public class Dec_to_Binary {
	private int number, tos, MaxSize, stack[];

	public void create_Stack(int size) {
		tos = -1;
		stack = new int[size];
		MaxSize = size;

	}

	void push(int e) {
		tos++;
		stack[tos] = e;
		System.out.println("Elements " + e + " Pushed: ");
	}

	boolean is_Full() {
		if (tos == MaxSize - 1)
			return true;
		else
			return false;
	}

	int pop() {
		int temp = stack[tos];
		tos--;
		return (temp);
		// return(stack([top--]);
	}

	boolean is_Empty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	int peek() {
		return (stack[tos]);
	}

	void print_Stack() {
		System.out.println("Stack has");
		for (int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

}
