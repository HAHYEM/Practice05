package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {
	public static void main(String[] args) {

		int a;
		int b;
		int result;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print(">> ");
			String data = sc.nextLine();

			if (data.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}

			String[] array = data.split(" "); // 띄어쓰기로 나눌게
			int left = Integer.parseInt(array[0]);
			int right = Integer.parseInt(array[2]);
			String middle = array[1];

			switch (middle) {
			case "+":
				Add add = new Add();
				add.setValue(left, right);
				result = add.calculate();
				System.out.println(">> " + result);
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(left, right);
				result = sub.calculate();
				System.out.println(">> " + result);
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(left, right);
				result = mul.calculate();
				System.out.println(">> " + result);
				break;
			case "/":
				Div div = new Div();
				div.setValue(left, right);
				result = div.calculate();
				System.out.println(">> " + result);
				break;
			default:
				System.out.println("이상한 것을 넣었다!!!!!!!!!");
				break;
			}

		}

	}
}