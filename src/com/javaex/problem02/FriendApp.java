package com.javaex.problem02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	
    	ArrayList <Friend> al = new ArrayList<Friend>();
       
    	for(int i=0; i<3; i++) {
        	String friendInfo = sc.nextLine();
        	
        	String[] friend = friendInfo.split(" ");
        	
        	Friend f = new Friend();
        	f.setName(friend[0]);
        	f.setHp(friend[1]);
        	f.setSchool(friend[2]);

       
        	al.add(f);
        }
    	
    	for(int i = 0 ; i < al.size(); i++) {
    		al.get(i).showInfo();
    	}
    	
    	
    }

}