package com.neuedu.test;

import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
	//	System.out.print("��������");
		// ��������
		int[] arrays = {98,34,22,10,-8};
		Arrays.sort(arrays);
		System.out.println(Arrays.toString(arrays));
		// �õ�1970-01-01 00��00��00->���ڵĺ���ֵ
		long currentTimeMillis = System.currentTimeMillis();
		System.out.print(currentTimeMillis);
		// ��ǰСʱ
		// int���ֵ long
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		// �����
		Random random = new Random();
		for(int i=0;i<50;i++) {
			int nextInt = random.nextInt(50);
			System.out.println(nextInt);
		}
	}
}
