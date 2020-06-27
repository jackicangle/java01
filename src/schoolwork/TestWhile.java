package schoolwork;

public class TestWhile {
	public static void main(String[]args){
		int n = 1;
		int result = 12;
		do{
			System.out.println("第"+n+"次循环,第一次循环结果为："+result);
			n++;
			result +=2;
		}while(n<5);
	}

}
