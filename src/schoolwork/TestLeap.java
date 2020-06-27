package schoolwork;

import java.util.Scanner;
public class TestLeap {
	public static void main(String[]args){
		//System.out.println("第"+num+"次查找");
		System.out.print("请输入您要查找的年份：");
		Scanner n = new Scanner(System.in);
		int year = n.nextInt();
		System.out.print("请输入您要查找的月份：");
		Scanner m = new Scanner(System.in);
		int mouth = m.nextInt();
		switch(mouth){
		case 1:
		case 3:
		case 5:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"年"+mouth+"月有31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year+"年"+mouth+"月有30天");
			break;
		}
		int feb;
		if (year%4==0&&(year%100!=0)||(year%400==0)){
			feb = 29;
		}else{
			feb = 28;
		}
		if(mouth==2){
			System.out.println(year+"年"+mouth+"月有"+feb+"天");
		}

	}
}
