package com.csii.test;

import java.util.Scanner;

import com.sun.javadoc.Type;

/**
 * 
 * @author Youth
 *
 */
public class CharTest {
	
	public static void main(String[] args) {
		/**
		 * 	�Ʊ��
		 */
		var str = "\t";
		System.out.println("|" + str + "|");
		// ���з�
		System.out.print("---------");
		System.out.println("\t" + "\\");
		System.out.println("|\r|");
		System.out.println("\'");
		System.out.println("\"");
		System.out.println("�����й���\n��");
		System.out.println("\f");
		System.out.println("�����й���\r");
		Scanner scan = new Scanner(System.in);
		String a = null;
		/*
		 * while (scan.hasNext()) { a = scan.next(); System.out.print(a + "\r"); }
		 */
		
		// java �ṩ����������ĸ���ֵ ������� ������� ����
		System.out.println(Float.NEGATIVE_INFINITY);
		System.out.println(Float.POSITIVE_INFINITY);
		System.out.println(-8.0 / 0.0); // -Infinity
		System.out.println(Float.NEGATIVE_INFINITY / Float.POSITIVE_INFINITY);
		
		// ����������Ĭ���� double����
		float f = 0.56561321f;
		double d = 0.56561321;
		
		System.out.println(f);
		System.out.println(d);
		
		// ��������Ĭ����int����
		long l = 4545456464546546L;
		int i = 454545646;
		// Ϊ�˿��ٱ�����ֵ�λ��������֮��������»�������ʶ��java 7�����룩
		double ll = 1222_7222_9999_9999_9999_1234D;
		// �������͵�ֵ ֻ�� true �� false �������͵�ֵ���ַ��������������� booleanֵ���Զ�ת��Ϊ�ַ���
		boolean b = false;
		System.out.println(b + "Hello!"); // falseHello!
		
		byte bt = 127; // 1111111 1*2E0 + 1*2E1 + 1*2E2 + 1*2E3 + 1*2E4 + 1*2E5 + 1*2E6
		short st = 32767; // 
		
		int num = 8;
		System.out.println(num << 2);
		System.out.println(num >>> 2);
		System.out.println(num >> 2);
 		System.out.println(5 & 9);
		System.out.println(5 | 9);
		System.out.println(5 ^ 9);
		System.out.println(~5);
		
		
		
	}

}
