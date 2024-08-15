package Test;

import java.util.Stack;

public class bracketsbalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isParanthesesMatching("[()]{}{[()()]()}"));

	}

	public static boolean isParanthesesMatching(String input) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) 
		{
			char curr = input.charAt(i);

			if (input.charAt(i) == '(' ||  input.charAt(i) == '{'
					|| input.charAt(i) == '[' ) {

				stack.push(curr);

			} 
			else {
				if (stack.isEmpty())
					return false;

				else if (!isMatching((char) stack.peek(), curr)) {

					return false;
				} else
					stack.pop();

			}

		}
		return stack.isEmpty();
	}

	static boolean isMatching(char a, char b) {
		return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');

	}

}
