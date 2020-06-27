package review;

interface eat{
	void goEat();
}
interface home{
	void goHome();
}
class Rstudent implements eat,home{
	public void goEat(){
		System.out.println("学生去食堂吃饭");
	}
	public void goHome(){
		System.out.println("学生回寝室睡觉");
	}
}
class Teacher implements eat,home{
	public void goEat(){
		System.out.println("老师去教工食堂吃饭");
	}
	public void goHome(){
		System.out.println("老师回公寓睡觉");
	}
	
}
class Parent implements eat,home{
	public void goEat(){
		System.out.println("家长去招待所吃饭");
	}
	public void goHome(){
		System.out.println("家长回招待所睡觉");
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



