package com.neuedu.test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author wangying
 * @since 20190806
 * @version 1.0
 * */
public class Game {
	public static void main(String[] args) {
	    System.out.println("这是一个RPG游戏: ");
	    System.out.println("1.开始游戏");
	    System.out.println("2.游戏规则 ");
	    System.out.println("3.结束游戏 ");
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("请输入您想进行的操作:(1-3)");
	    int i = scanner.nextInt();
	    if(i==1) {
	    	System.out.println("请输入您游戏角色的姓名:");
	    	String name = scanner.next();
	    	System.out.println("请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4. 矮人 5.元素)");
	    	String race = scanner.next();
	    	System.out.println("创建成功!!! ");
	    	Scanner scanner1 = new Scanner(System.in);
		    System.out.println("请输入您想进行的操作:(1-3)");
		    int n = scanner1.nextInt();
		    if(n==2) {
		    	System.out.println("游戏规则:xxxxxxxxxxxx");
		    	Scanner scanner11 = new Scanner(System.in);
			    System.out.println("请输入您想进行的操作:(1-3)");
			    int m = scanner11.nextInt();
			    if (m==3) {
			    	
			    	System.out.println("系统退出");
				}
		    }
	    }else if(i == 2){
	    	System.out.println("游戏规则:xxxxxxxxxxxx");
		}else if(i==3){
			System.out.println("系统退出");
		}else {
			System.out.println("输入有误");
		}
	}
	// 姓名
	String name;
	// 性别
	char sex;
	// 种族
	String race;
	// 职业
	String occupation;
	// 力量
	Random power = new Random(9999);
	// 敏捷	
	Random agile = new Random(9999);
	// 体力		
	Random strength = new Random(9999);
	// 智力			
	Random intellect = new Random(9999);
	// 智慧
	Random wisdom = new Random(9999);
	// 生命值	
	Random vitality = new Random(9999);
	// 魔法值
	Random MPoint = new Random(9999);
}
