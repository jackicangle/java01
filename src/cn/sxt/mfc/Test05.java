package cn.sxt.mfc;

/**
 * ��һ��3*3�ľ���Խ���Ԫ�صĺ�(����Ԫ�شӼ��������)�����ѣ��õ���ά���飡
 * @author 86131
 * 2020/4/11
 */

import java.util.Scanner;
public class Test05 {
	
	public static void main(String[] args){
		int[][] arr = new int[3][3];
		Scanner sc = new Scanner(System.in);
		int	sum =0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j] = sc.nextInt();
				if(i==j){
				sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
	
}
