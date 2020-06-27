package cn.sxt.mfc;

/**
 * 求一个3*3的矩阵对角线元素的和(矩阵元素从键盘上输出)。提醒：用到二维数组！
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
