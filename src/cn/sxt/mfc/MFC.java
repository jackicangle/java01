package cn.sxt.mfc;

/**
 * 简易计算器
 * @author 86131
 * 2020/4/10
 */

import java.util.Scanner;
public class MFC {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要计算的两个值：");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("请输入计算符号：");
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
