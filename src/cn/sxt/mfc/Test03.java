package cn.sxt.mfc;

/**
 * 由键盘输入三个整数分别存入变量A1、A2、A3，从大到小输出
 * @author 86131
 * 2020/4/10
 */



import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("请输入A1:");
			int A1 = input.nextInt();
			
			System.out.print("请输入A2:");
			int A2 = input.nextInt();
			
			System.out.print("请输入A3:");
			int A3 = input.nextInt();
			
			int temp;
			
			if(A3>A1){
				
				temp = A1;
				A1 = A3;
				A3 = temp;
				
			}
				
			

			System.out.println("从大到小输出为："+A1+","+A2+","+A3);
			
			
		
	}
	
	}
