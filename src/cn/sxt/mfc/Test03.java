package cn.sxt.mfc;

/**
 * �ɼ����������������ֱ�������A1��A2��A3���Ӵ�С���
 * @author 86131
 * 2020/4/10
 */



import java.util.Scanner;

public class Test03 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("������A1:");
			int A1 = input.nextInt();
			
			System.out.print("������A2:");
			int A2 = input.nextInt();
			
			System.out.print("������A3:");
			int A3 = input.nextInt();
			
			int temp;
			
			if(A3>A1){
				
				temp = A1;
				A1 = A3;
				A3 = temp;
				
			}
				
			

			System.out.println("�Ӵ�С���Ϊ��"+A1+","+A2+","+A3);
			
			
		
	}
	
	}
