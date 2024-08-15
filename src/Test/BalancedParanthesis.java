package Test;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String s = "[{()}]";
		boolean isBalanced = checkBalanced(s);
		System.out.println(isBalanced);

	}

	private static boolean checkBalanced(String str) {
		char[] input = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < input.length; i++) {
			char curr = input[i];
			if (curr == '[' || curr == '{' || curr == '(') {
				stack.push(curr);
			}

			else {
				if (stack.isEmpty())
					return false;
				else {
					char top = stack.pop();  
					if (curr == ']' && top != '[' || curr == '}' && top != '{' || curr == ')' && top != '(') {
						return false;
					}

				}
			}
			
		}
		return stack.isEmpty();

	}

}
