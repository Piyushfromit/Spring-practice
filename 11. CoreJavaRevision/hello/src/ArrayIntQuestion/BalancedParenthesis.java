package ArrayIntQuestion;

import java.util.*;

public class BalancedParenthesis {
	
	public static void main(String[] args) {
		
		String str = "{(([])[])[]}";
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			
			if(c == '(' || c == '[' || c == '{') {
				stack.add(c);
				
			}
			else if( c==')' ||  c=='}' ||  c==']') {
				
				if(stack.empty()) {
					
					System.out.println(" Unbalanced");
					return;
				}
				
				char top = stack.pop();
				
				if( c== ')' && top !='(' ||  c== '}' && top !='{' || c== ']' && top !='[' ) {
						System.out.println(" Unbalanced");
						return;
				}
			}
		}
		
		if(stack.empty()) {
			System.out.println(" balanced");
		}else {
			System.out.println(" Unbalanced");
		}
		
		
	}

}


































//1rd approach

//public static void main(String [] args){
//    
//    String oldstr = "{(([])[])[]}";
//    
//    String newstr= oldstr.replaceAll("[a-z,A-Z,0-9]", "");
//    
//    System.out.println(isBalanced(newstr));
//        
//}
//public static boolean isBalanced(String str) {
//    Stack<Character> stack = new Stack<>();
//    for (int i = 0; i < str.length(); i++) {
//        
//    	char c = str.charAt(i);
//        
//    	if (c == '(' || c == '[' || c == '{') {
//            stack.push(c);
//        } 
//    	else if (c == ')' || c == ']' || c == '}') {
//            
//    		if (stack.isEmpty()) {
//                return false;
//            }
//            char top = stack.pop();
//            if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
//                return false;
//            }
//            
//        }
//    }
//    return stack.isEmpty();
//}

// 2rd approach 

//import java.util.Stack;
//
//public class BalancedParenthesis {
//    public static void main(String[] args) {
//        String str = "(()()()())"; // Replace with your string to check
//        
//        // Create a new stack
//        Stack<Character> stack = new Stack<Character>();
//        
//        // Loop through each character in the string
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            
//            // If the character is an opening parenthesis, push it onto the stack
//            if (c == '(') {
//                stack.push(c);
//            }
//            // If the character is a closing parenthesis, check if the stack is empty
//            else if (c == ')') {
//                if (stack.isEmpty()) {
//                    System.out.println("Unbalanced");
//                    return;
//                }
//                
//                // If the stack is not empty, pop the top element and check if it matches
//                char top = stack.pop();
//                if (top != '(') {
//                    System.out.println("Unbalanced");
//                    return;
//                }
//            }
//        }
//        
//        // If the stack is not empty, there are unclosed opening parentheses
//        if (!stack.isEmpty()) {
//            System.out.println("Unbalanced");
//        }
//        else {
//            System.out.println("Balanced");
//        }
//    }
//}


