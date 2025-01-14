package CollectionInJava;

import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(358);
		stack.push(785);
		stack.push(987);
		stack.push(159);
		stack.push(753);
		stack.push(369);

		System.out.println(stack);

		int popout =stack.pop();
		System.out.println("The Popped out number is "+ popout);

		System.out.println(stack);

		//System.out.println(stack);

		int popout2 =stack.pop();
		System.out.println("The Popped out number is "+ popout2);

		System.out.println(stack);
	}

}
