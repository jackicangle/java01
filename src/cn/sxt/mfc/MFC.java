package cn.sxt.mfc;

/**
 * ���׼�����
 * @author 86131
 * 2020/4/10
 */

import java.util.Scanner;
public class MFC {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ���������ֵ��");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("�����������ţ�");
		String s = sc.next();
		switch(s){
		case"+":
			System.out.println(a+b);
			break;
		case"-":
			System.out.println(a-b);
			break;
		case"*":
			System.out.println(a*b);
			break;
		case"/":
			System.out.println(a/b);
			break;
		}
	}
}
