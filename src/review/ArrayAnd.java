package review;

/**
 * ��4.ʹ�ö�ά����洢�������ѧ�����Ź��εĿ��Գɼ���
 *     Ҫ�����ÿһ��ѧ�����ܷ֡�  ƽ���֡���߷֡���ͷ�--------->ʹ�þͰ���¼��ķ�ʽ¼�����ݣ�
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
				System.out.print("�������"+(i+1)+"��ѧ���ĵ�"+(j+1)+"��������");
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
		System.out.println("��߷��ǣ�"+max+"\n��ͷ��ǣ�"+min+"\nƽ�����ǣ�"+avg);
	}
	

}
