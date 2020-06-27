package review;

/**
 * 题目：从键盘输入学生的人数 和成绩并选取最大值，为学生的成绩进行划分等级
         等级如下：①成绩与最高分差十分及以内    level=A
		  ②成绩与最高分差二十分及以内    level=B
		  ③成绩与最高分差三十分及以内    level=C
		  ④其他    level=D

 * @author 金杭云
 * 2020/4/17
 */
import java.util.Scanner;
public class ArrayGrade {

	public static void main(MainParameter parameterObject){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学生人数：");
		int num = sc.nextInt();
		
		int arr[] = new int[num+1]; 
		for(int i=1;i<=num;i++){
			System.out.print("请输入第"+i+ "个学生的成绩：");
			arr[i]=sc.nextInt();
		}
		
		int max =arr[0];
		char level=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
			for(int j=0;j<num;j++){
			if(max-arr[j]<10){
				level = 'A';
			}else if(max-arr[j]<20){
				level = 'B';
			}else if(max-arr[j]<30){
				level = 'C';
				break;
			}else{
				level = 'D';
			}
		}
			

			for(int i=1;i<=num;i++){
				System.out.println("第"+i+"个学生的成绩为："+level);
			}
		
		
	}
}
