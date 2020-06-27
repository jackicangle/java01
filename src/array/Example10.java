package array;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Example10 {

	public static void main(String[] args){
		
		Frame f = new Frame("GridLayout");   //����һ����ΪGridLayout�Ĵ���
		f.setLayout(new GridLayout(3,3));    //���øô���Ϊ3*3������
		f.setSize(300,300);					 //���ô����С
		f.setLocation(400,300);
		
		//����Ĵ�����ѭ�����9����ť�� GriLayout��
		for(int i=1;i<9;i++){ 
			Button btn = new Button("bnt"+i);
			f.add(btn);          //��������Ӱ�ť
		}
		f.setVisible(true);
		
		//�رմ���
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0){
				super.windowClosing(arg0);
				System.exit(0);
			}
		});
	}
}
