package schoolwork;

import java.util.Scanner;
public class TestLeap {
	public static void main(String[]args){
		//System.out.println("��"+num+"�β���");
		System.out.print("��������Ҫ���ҵ���ݣ�");
		Scanner n = new Scanner(System.in);
		int year = n.nextInt();
		System.out.print("��������Ҫ���ҵ��·ݣ�");
		Scanner m = new Scanner(System.in);
		int mouth = m.nextInt();
		switch(mouth){
		case 1:
		case 3:
		case 5:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"��"+mouth+"����31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year+"��"+mouth+"����30��");
			break;
		}
		int feb;
		if (year%4==0&&(year%100!=0)||(year%400==0)){
			feb = 29;
		}else{
			feb = 28;
		}
		if(mouth==2){
			System.out.println(year+"��"+mouth+"����"+feb+"��");
		}

	}
}
