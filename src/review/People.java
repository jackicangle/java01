package review;

/**
 * 1���ö�̬�Ա�̣�
 *		  ��1������һ��People�࣬�������������������䡢��ϵ�绰�ȱ�Ҫ�ĳ�Ա������
 *			  ʵ���������������䡢��ϵ�绰�ͻ�ȡ���������䡢��ϵ�绰�ȱ�Ҫ�ķ�������ʵ����ʾPeople������Ϣ�ķ�����
 * 		  ��2������People������Student����������Ҫ��ӱ�Ҫ�ĳ�Ա���������Է������ǵķ�ʽ����ʾѧ����Ϣ��
 * 		  ��3��ʵ����һ��ѧ��������ɶ�ѧ����Ϣ�����ú���ʾ��
 * @author 86131
 * 2020/4/17
 */


public class People {
	private static String name;
	private static int telephone;
	private static int age;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getTelephone(int telephone){
		return telephone;
	}
	public void setTelephone(){
		this.telephone=telephone;
	}
	public int getAge(int age){
		return age;
	}
	public void setAge(){
		this.age = age;
	}
	public People(String name,int telephone,int age){
		super();
		this.name = name;
		this.telephone = telephone;
		this.age = age;
	}
	public static void main(String[] args){
		
		People a = new People(name,age,telephone);
		a.name = "J-king";
		a.age = 5;
		a.telephone = 1101011;
		System.out.println("������"+name+"\n���䣺"+age+"\n�绰���룺"+telephone);
	}
}

