package review;

interface eat{
	void goEat();
}
interface home{
	void goHome();
}
class Rstudent implements eat,home{
	public void goEat(){
		System.out.println("ѧ��ȥʳ�óԷ�");
	}
	public void goHome(){
		System.out.println("ѧ��������˯��");
	}
}
class Teacher implements eat,home{
	public void goEat(){
		System.out.println("��ʦȥ�̹�ʳ�óԷ�");
	}
	public void goHome(){
		System.out.println("��ʦ�ع�Ԣ˯��");
	}
	
}
class Parent implements eat,home{
	public void goEat(){
		System.out.println("�ҳ�ȥ�д����Է�");
	}
	public void goHome(){
		System.out.println("�ҳ����д���˯��");
	}
}
public class Test03 {

	public static void main(String[] args){
		      Rstudent stu = new Rstudent();
		      stu.goEat();
		      stu.goHome();
		      Teacher t = new Teacher();
		      t.goEat();
		      t.goHome();
		      Parent p = new Parent();
		      p.goEat();
		      p.goHome();
		    }
		}



