package review;

/**
 * 例4.使用二维数组存储班上五个学生三门功课的考试成绩，
 *     要求输出每一个学生的总分、  平均分、最高分、最低分--------->使用就按盘录入的方式录入数据；
 * @author 86131
 *
 */

import java.util.Scanner;
public class ArrayAnd {
	
	public static void main(String[] args){
		int arr[][] = new int[5][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print("请输入第"+(i+1)+"个学生的第"+(j+1)+"个分数：");
				arr[i][j] = sc.nextInt();
			}
		}
		int max = arr[0][0];
		int min = arr[0][0];
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]>max){
					max = arr[i][j];
				}
				if(arr[i][j]<min){
					min = arr[i][j];
				}
			}
		}
		double avg = sum/arr.length;
		System.out.println("最高分是："+max+"\n最低分是："+min+"\n平均分是："+avg);
	}
	

}
