package review;

/**
 * ��Ŀ���Ӽ�������ѧ�������� �ͳɼ���ѡȡ���ֵ��Ϊѧ���ĳɼ����л��ֵȼ�
         �ȼ����£��ٳɼ�����߷ֲ�ʮ�ּ�����    level=A
		  �ڳɼ�����߷ֲ��ʮ�ּ�����    level=B
		  �۳ɼ�����߷ֲ���ʮ�ּ�����    level=C
		  ������    level=D

 * @author ����
 * 2020/4/17
 */
import java.util.Scanner;
public class ArrayGrade {

	public static void main(MainParameter parameterObject){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧ��������");
		int num = sc.nextInt();
		
		int arr[] = new int[num+1]; 
		for(int i=1;i<=num;i++){
			System.out.print("�������"+i+ "��ѧ���ĳɼ���");
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
				System.out.println("��"+i+"��ѧ���ĳɼ�Ϊ��"+level);
			}
		
		
	}
}
