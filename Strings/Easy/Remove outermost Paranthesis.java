public class Main {
	public static String removeOuterParentheses(String s) {
		int openCount = 0;
		int closeCount = 0;
		String result = "";
		int start = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				openCount++;
			} else if (c == ')') {
				closeCount++;
			}

			if (openCount == closeCount) {
				result += s.substring(start+1, i);
				start = i+1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// Example 1
		String s1 = "(()())(())()";
		System.out.println(removeOuterParentheses(s1)); 

		// Example 2
		String s2 = "()()(()())(()())";
		System.out.println(removeOuterParentheses(s2)); 

		// Example 3
		String s3 = "((()))(())";
		System.out.println(removeOuterParentheses(s3)); 
	}
}
