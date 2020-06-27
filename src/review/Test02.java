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
		 name = "江西软件职业技术大学";
		 students = 30000;
	 }
	 void show(){
		 System.out.println("学校是："+name+"\n学生有"+students+"人");
	 }
 }
 class totalStudent extends School{
	 String classa, name;
	 int man,woman;
	 public totalStudent(){
		 name = "J-king";
		 classa = "软件七班";
		 man = 20000;
		 woman = 10000;
	 }
	 void show1(){
		 System.out.println(name+"所在班级："+classa+"\n学校的男生有："+man+"人\n女生有："+woman+"人");
	 }
 }
