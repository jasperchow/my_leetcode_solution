public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i< s.length(); i ++){
            char character = s.charAt(i);
            if(character == '(' || character == '{' || character == '['){
                stack.push(character);
            }
            
            //need to check stack.empty() first(lazy check), otherwise stack.peek() will fail
            else if(!stack.empty() && character == ')' && stack.peek() == '('){
                stack.pop();
            }
            else if(!stack.empty() && character == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if (!stack.empty() && character == ']' && stack.peek() == '['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.empty();
    }
}