package string;

/**
 * ���Ĵ� (Palindromic Substring)
 * @author 86131
 * 2020/4/21
 */

import java.util.Scanner;
public class Test03 {
	

	public static void main(String[] args){
		System.out.print("������һ���ַ�����");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int low = 0;
		int high = str.length()-1;
		boolean c = true;
		while(low<high){
			if(str.charAt(low)!= str.charAt(high))
				c=false;
			low++;
			high--;
		}
		if(c==false){
			System.out.println("���ǻ��Ĵ�");
		}else{
			System.out.println("�ǻ��Ĵ�");
		}
	}
}
