package 문제풀이3일차;

import java.util.*;
// 미완료
public class 문자열압축해제 {
	public String solution(String s) {
		String answer = "";

		Stack<String> stack = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		String stackPut = "";
		String stackPut2 = "";
		int stackNum = 0;

		for (String str : s.split("")) {
			stack.push(str);
		}
		
		for (int i = 0; i < stack.size(); i++) {
			stack2.push(stack.pop());
		
			if (stack.pop().equals("(")) {
				stackNum = Integer.parseInt(stack.pop());
				for (String str2 : stack2) {
					stackPut = stackPut + str2;
					stack2.pop();
					if (str2.equals(")")) {
						break;
					}
				}
				for (int j = 0; j < stackNum; j++) {
					stackPut2 = stackPut2 + stackPut;
				}
				
			}
		}

//		for (int i = 0; i < stack.size(); i++) {
//			if(stack.pop().equals(")")) {
//			
////				stackPut = stackPut + stack.pop();
//			}else if(stack.pop().equals("(")){
//				stackPut = stack2.pop();
//				stackNum = Integer.parseInt(stack.pop());
//				for (int j = 0; j < stackNum; j++) {
//					stack2.push(stackPut);					
//				}
//			}else {
//				stack2.push(stack.pop());
//				
//			}
//		}
		return answer;
	}

	public static void main(String[] args) {
		문자열압축해제 T = new 문자열압축해제();
		System.out.println(T.solution("3(a2(b))ef"));
		System.out.println(T.solution("2(ab)k3(bc)"));
		System.out.println(T.solution("2(ab3((cd)))"));
		System.out.println(T.solution("2(2(ab)3(2(ac)))"));
		System.out.println(T.solution("3(ab2(sg))"));
	}
}
