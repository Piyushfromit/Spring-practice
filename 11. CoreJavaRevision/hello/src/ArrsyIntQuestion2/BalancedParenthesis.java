package ArrsyIntQuestion2;

import java.util.Stack;

public class BalancedParenthesis {
	
	public static void main(String[] args) {
		
		String str= "({}[]()))";
		
		Stack<Character> stack = new Stack<>();
		
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch== '(' || ch == '{'|| ch =='[') {
				stack.add(ch);
			}
			
			if(ch== ')' || ch == '}'|| ch ==']') {
				if(stack.empty()) {
					System.out.println("Unbalanced");
					return;
				}
				char top = stack.pop();
				if( (ch== ')' && top !='(')  || ( ch== '}' && top !='{') || (ch== '[' && top !=']')  ){
					
					System.out.println("Unbalanced");
					return;
				}
			}
			
		}
		
		
		if(stack.empty()) {
			System.out.println("Balanced");
		}else {
			System.out.println("Unbalanced");
		}
	}

}
