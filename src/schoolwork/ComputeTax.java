package schoolwork;

import java.util.Scanner;
public class ComputeTax {
	public static void main(String[]args){
		double income = 0.0;  //定义可能税收
		int status = 0;       //定义纳税人的情况
		double tax = 0;       //定义税额
	//提示用户输入纳税人的类型
		System.out.println("请输入纳税人的类型：0-单身，1-已婚，2-家庭");
		Scanner inStatus = new Scanner(System.in);
		if(inStatus.hasNextInt()){
			status = inStatus.nextInt();  //输入纳税人的类型
		}
		System.out.println("请输入可能税的收入：");
		Scanner in = new Scanner(System.in);
		if(in.hasNextDouble()){
			income = in.nextDouble();     //输入可能税收入
		}
		if(status==0){                    // 计算单身纳税人的缴纳税额
			 if(income<=6000){
				 tax = income*0.1;
			 }else if(income<=27950){
				 tax = 6000*0.1+(income-6000)*0.15;
			 }else if(income<=67700){
				 tax = 6000*0.1+(27950-6000)*0.15+(income - 27950)*0.27+(income-67700)*0.30;
			 }else{
				 tax = 6000*0.1+(27950-6000)*0.15+(income-27950)*0.27+(income-67700)*0.3+(income-141250)*0.35;
			 }
		}else if(status==1){           //计算已婚纳税人的缴税额度
			
		}else if(status==2){           //计算家庭纳税人的缴纳税额
			
		}else{
			System.out.println("类型输入错误！无法判断！");
		}
		System.out.println("纳税人需要缴纳的税额为"+tax+"￥");
		
	}

}
