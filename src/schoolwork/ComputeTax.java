package schoolwork;

import java.util.Scanner;
public class ComputeTax {
	public static void main(String[]args){
		double income = 0.0;  //�������˰��
		int status = 0;       //������˰�˵����
		double tax = 0;       //����˰��
	//��ʾ�û�������˰�˵�����
		System.out.println("��������˰�˵����ͣ�0-����1-�ѻ飬2-��ͥ");
		Scanner inStatus = new Scanner(System.in);
		if(inStatus.hasNextInt()){
			status = inStatus.nextInt();  //������˰�˵�����
		}
		System.out.println("���������˰�����룺");
		Scanner in = new Scanner(System.in);
		if(in.hasNextDouble()){
			income = in.nextDouble();     //�������˰����
		}
		if(status==0){                    // ���㵥����˰�˵Ľ���˰��
			 if(income<=6000){
				 tax = income*0.1;
			 }else if(income<=27950){
				 tax = 6000*0.1+(income-6000)*0.15;
			 }else if(income<=67700){
				 tax = 6000*0.1+(27950-6000)*0.15+(income - 27950)*0.27+(income-67700)*0.30;
			 }else{
				 tax = 6000*0.1+(27950-6000)*0.15+(income-27950)*0.27+(income-67700)*0.3+(income-141250)*0.35;
			 }
		}else if(status==1){           //�����ѻ���˰�˵Ľ�˰���
			
		}else if(status==2){           //�����ͥ��˰�˵Ľ���˰��
			
		}else{
			System.out.println("������������޷��жϣ�");
		}
		System.out.println("��˰����Ҫ���ɵ�˰��Ϊ"+tax+"��");
		
	}

}
