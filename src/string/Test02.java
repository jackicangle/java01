package string;

/**
 * I am a good cat,
 * 	 1.��Сд����
 *	 2.��һ��a �����һ��a���ֵ�λ��
 *	 3.��cat����pig
 *	 4.��   abcd   ǰ�������ո�ͺ��������ո�ȡ�������ȡ��ǰ��ȡ������ַ����Ĵ�С
 *	 5.���Ĵ�������
 * @author ����
 *	2020/4/21
 */

public class Test02 {
	
	public static void main(String[] args){
		String s = "i am a good cat";
		System.out.println("��һ��a��λ�ã�"+s.indexOf('a')+"\n���һ��a��λ�ã�"+s.lastIndexOf('a'));
		System.out.println("�����Сд��������ַ�����"+s.toUpperCase());
		String s2 = s.replace("cat", "dog");
		System.out.println("�滻��"+s2);
		
		String s3 = "  abcd  ";
		System.out.println("ȡ��ǰ�ַ�����С��"+s3.length());
		System.out.println("ȡ����"+s3.trim()+"��СΪ��"+s3.trim().length());
	}

}
