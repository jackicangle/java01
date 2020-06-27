package review;

/**
 * 题目： 定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，
 *     计算并输出学生的平均成绩,最大值、最小值、总成绩。
 * @author 金杭云
 *	2020/4/17
 */
public class Array_score {

	public static void main(String[] args){
		int[] arr={72,89,65,58,87,91,53,82,71,93,76,68};
		int max=arr[0],min=arr[0];
		double avg=0;
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}else if(min>arr[i]){
				min = arr[i];
			}
			sum += arr[i];
			avg = sum/arr.length;
		}
		System.out.println("平均成绩："+avg+"\n最高分："+max+"\n最低分："+min+"\n总成绩："+sum);
	}
}
