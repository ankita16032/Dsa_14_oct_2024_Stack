package stack_examples;

public class Stack_Char_class {

	private char stack[];
	private int MaxSize,tos;
	
	public void create_Stack(int size)
	{
		tos=-1;
		stack=new char[size];
		MaxSize=size;
		
	}
		void push(char  e)
		{
			tos++;
			stack[tos]=e;
			System.out.println("Elements "+e+ " Pushed: ");
		}
		
	boolean is_Full()
	{
		if(tos==MaxSize-1)
			return true;
		else
			return false;
	}
	
	char pop()
	{
		char  temp=stack[tos];
		tos--;
		return(temp);
		//return(stack([top--]);
	}
	boolean is_Empty()
	{
		if(tos==-1)
			return true;
		else
			return false;
	}
	char peek()
	{
		return(stack[tos]);
	}
	
	void print_Stack()
	{
		System.out.println("Stack has");
		for (int i = tos; i >= 0; i--) 
		{
			System.out.println(stack[i]);
		}
	}
}
