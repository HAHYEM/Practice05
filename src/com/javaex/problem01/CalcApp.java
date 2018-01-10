package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("사칙 연산 계산기 프로그램을 실행합니다.");
    	System.out.println("구분자로 공백한칸을 사용 합니다.");
    	System.out.println("계산 할 식을 넣어주세요. 예)a + b");
    	while(true) {
    		System.out.print("식 입력>> ");
    		String get = sc.nextLine();
    		
    		//받아온 식을 공백을 구분자로 사용하여 배열로 만든다.
    		String[] getSplit = get.split(" ");
			
    		
    		if(getSplit.length==3) { //1. 위 getSplit 의 배열 크기가 3이라면 제대로식을 받아왔다고 가정하고 실행 될 수 있도록 한다.
    			int numA;
    			int numB;
    			try {
    				numA = Integer.parseInt(getSplit[0]);
    				numB = Integer.parseInt(getSplit[2]);
    				if(getSplit[0].equals("/q")) {
    	    			break;
    	    		}else if(getSplit[1].equals("+")) {
    	    			Add a = new Add();
    	    			a.setValue(numA,numB);
    	    			System.out.println(a.calculate());
    	    		}else if(getSplit[1].equals("-")) {
    	    			Sub s = new Sub();
    	    			s.setValue(numA,numB);
    	    			System.out.println(s.calculate());
    	    		}else if(getSplit[1].equals("*")) {
    	    			Mul m = new Mul();
    	    			m.setValue(numA,numB);
    	    			System.out.println(m.calculate());
    	    		}else if(getSplit[1].equals("/")) {
    	    			Div d = new Div();
    	    			d.setValue(numA,numB);
    	    			System.out.println(d.calculate());
    	    		}else { 
    	    			System.out.println("알 수 없는 연산자 입니다.");
    	    			System.out.println("입력된 연산자 : " + getSplit[1]);
    	    		}
    			} catch (NumberFormatException e) { 
    				System.out.println("피연산자가 잘못 입력 되었습니다.");
    				System.out.println("입력된 피연산자 a : " + getSplit[0] + " 피연산자 b : " + getSplit[2]);
    				continue;
    			}
			}else if(get.equals("/q")) { 
				break;
			}else{
				System.out.println("피연산자 2개와 연산자 1개를 정확히 입력해주십시오.");
				continue;
			}		
    		
    	}
    	
    	System.out.println("계산기가 종료되었습니다..");
    	
    	
    }
}