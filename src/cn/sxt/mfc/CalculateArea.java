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
		System.out.println("�����������������״��1������   2��Բ    3��������");
		int  a = sc.nextInt();
		
		double area = 0;
		
		if(a==1){
			System.out.println("����������εĳ��Ϳ�");
			double c = sc.nextDouble();
			double k = sc.nextDouble();
			area = c*k;
		}else if(a==2){
			System.out.println("������Բ�İ뾶��");
			double r = sc.nextDouble();
			area = 3.14*r*r;
		}else if(a==3){
			System.out.println("�����������εĵ׺͸ߣ�");
			double d = sc.nextDouble();
			double h = sc.nextDouble();
			area = d*h/2;
		}else {
			System.out.println("�޷����㣡");
		}
		System.out.println("����ͼ�����Ϊ��"+area);
	}

}
