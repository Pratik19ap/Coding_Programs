//  Programmed in Java | Author: Anshuman Pratik
class Solution { 
    public boolean isValid(String s) { 
        Stack<Character> stack = new Stack<Character>(); 
        for (int i = 0 ; i < s.length() ; i++) { 
            char ch = s.charAt(i); 
            if (ch == '[' || ch == '{' || ch == '(') { 
                stack.push(ch);
            } 
            else if (!stack.empty() && ch == ')' && stack.peek() == '(') { 
                stack.pop(); 
            } 
            else if (!stack.empty() && ch == '}' && stack.peek() == '{') {
                stack.pop();
            }
            else if (!stack.empty() && ch == ']' && stack.peek() == '[') {
                stack.pop();
            }
            else { 
                return false;
            }
        }
        return stack.empty(); 
        
    } 
    
}
