package cn.sxt.mfc;

/**
 * 
 * @author 86131
 *
 */

import java.util.Scanner;
public class CalculateArea {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入所求面积的形状：1、矩形   2、圆    3、三角形");
		int  a = sc.nextInt();
		
		double area = 0;
		
		if(a==1){
			System.out.println("请输入矩形形的长和宽：");
			double c = sc.nextDouble();
			double k = sc.nextDouble();
			area = c*k;
		}else if(a==2){
			System.out.println("请输入圆的半径：");
			double r = sc.nextDouble();
			area = 3.14*r*r;
		}else if(a==3){
			System.out.println("请输入三角形的底和高：");
			double d = sc.nextDouble();
			double h = sc.nextDouble();
			area = d*h/2;
		}else {
			System.out.println("无法计算！");
		}
		System.out.println("所求图形面积为："+area);
	}

}
