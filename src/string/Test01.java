package string;

public class Test01 {

	public static void main(String[] args){
		String str = "abcde";
		String str2 = "hello ";
		String str3 = "world";
		String stra = str.substring(1);
		String strb = str.substring(2,4);
		String str2a = str2.concat(str3);
		String str23 = str2.concat(str3);
		System.out.println(str3);
		System.out.println(str2);
		System.out.println("�ַ������ȣ�"+str.length());
		System.out.println("str2��str3�����Ƿ���ȣ�"+str2.equals(str3));
		System.out.println("���������ַ���"+str23);
	}
}
