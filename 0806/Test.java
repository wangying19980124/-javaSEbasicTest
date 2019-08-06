package com.neuedu.test;

import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
	//	System.out.print("垃圾分类");
		// 创建数组
		int[] arrays = {98,34,22,10,-8};
		Arrays.sort(arrays);
		System.out.println(Arrays.toString(arrays));
		// 拿到1970-01-01 00：00：00->现在的毫秒值
		long currentTimeMillis = System.currentTimeMillis();
		System.out.print(currentTimeMillis);
		// 当前小时
		// int最大值 long
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		// 随机数
		Random random = new Random();
		for(int i=0;i<50;i++) {
			int nextInt = random.nextInt(50);
			System.out.println(nextInt);
		}
	}
}
