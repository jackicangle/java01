package review;

public class Test02 {
	public static void main(){
		School sch = new School();
		sch.show();
		
		totalStudent stu = new totalStudent();
		stu.show();
		stu.show1();
	}
}

 class School{
	 String name;
	 int students;
	 public School(){
		 name = "�������ְҵ������ѧ";
		 students = 30000;
	 }
	 void show(){
		 System.out.println("ѧУ�ǣ�"+name+"\nѧ����"+students+"��");
	 }
 }
 class totalStudent extends School{
	 String classa, name;
	 int man,woman;
	 public totalStudent(){
		 name = "J-king";
		 classa = "����߰�";
		 man = 20000;
		 woman = 10000;
	 }
	 void show1(){
		 System.out.println(name+"���ڰ༶��"+classa+"\nѧУ�������У�"+man+"��\nŮ���У�"+woman+"��");
	 }
 }
