package schoolwork;

/**
 * 0-100��������   ż����   3�ı�����   5�ı�����
 * @author ����
 *
 */
public class TheOddAnd {
	public static void main(String[]args){
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0,sum4 = 0;
		for(int i=1;i<=100;i++){
			if(i%2!=0){
				sum1 += i;
			}else{
				sum2 += i;
			}
			if(i%3==0)
				sum3 += i;
			if(i%5==0)
				sum4 +=i;
		}
		System.out.println("������Ϊ"+sum1+"\nż����Ϊ��"+sum2);
		System.out.println("3�ı����ͣ�"+sum3+"\n5�ı����ͣ�"+sum4);
		
	}
}
