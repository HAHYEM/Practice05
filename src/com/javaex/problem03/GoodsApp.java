package com.javaex.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList <Goods> garr = new ArrayList<>();
    	int total = 0;
    	System.out.println("��ǰ 3���� �Է����ּ���");
    	
    	for(int i = 0; i < 3; i++) {
    		String goodsInfo = sc.nextLine();
    		String [] goods = goodsInfo.split(" "); //�Է¹��� ������ �������� �и�
    		
    		Goods g = new Goods();
    		g.setName(goods[0]);
    		g.setPrice(Integer.parseInt(goods[1]));
    		g.setCount(Integer.parseInt(goods[2]));
    		
    		garr.add(g);
    	}
    	for(Goods g : garr) {
    		g.showInfo();
    	}
    	for(int i = 0; i < garr.size(); i++) {
    		total = total + garr.get(i).getCount();
    	}
    	System.out.println("��� ��ǰ�� ������ " + total + "���Դϴ�.");
    	
    	sc.close();
    }

}