import java.util.Stack;

class ValidParentheses extends Solution {

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '[' || ch == '{') {
        stack.push(ch);
      } else {
        if (stack.isEmpty()) {
          return false;
        }

        char top = stack.pop();
        if (ch == ')' && top != '(') {
          return false;
        } else if (ch == ']' && top != '[') {
          return false;
        } else if (ch == '}' && top != '{') {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }
}
