package schoolwork;

/**
 * �ӿ� ��interface��port��connector)
 * @author 86131
 * 2020/3/28
 */


interface USB{
	void open();
	void close();
}

class Mouse implements USB{
	public void open(){
		System.out.println("��꿪��");
	}
	public void close(){
		System.out.println("���ر�");
	}
}

class KeyBoard implements USB{
	public void open(){
		System.out.println("���̴�");
		}
	public void close(){
		System.out.println("���̹ر�");
	}
}

class NoteBook{
	public void run(){
		System.out.println("���������");
	}
	public void useUSB(USB usb){
		if(usb != null){
			usb.open();
			usb.close();
		}
	}
	public void shutDown(){
		System.out.println("�ʼǱ��ر�");
	}
}

public class D {
	public static void main (String[] args){
		NoteBook nb = new NoteBook();
		nb.run();
		Mouse m = new Mouse();
		nb.useUSB(m);
		KeyBoard kb = new KeyBoard();
		nb.useUSB(kb);
		nb.shutDown();
		System.out.println("*******************");
		Per a = new Per();
		String b,c;
		b = a.getType();
		c = a.getName();
		System.out.println(b+":"+c);
		System.out.println("*******************");
		System.out.println("33");
		System.out.println("*******************");
		System.out.println("base static");
		System.out.println("test static");
		System.out.println("base constructor");
		System.out.println("test constructor");
		
	}
}
 
class Per{
	public static String getType(){
		return "����";
	}
	public static String getName(){
		return "J-king";
	}
}








