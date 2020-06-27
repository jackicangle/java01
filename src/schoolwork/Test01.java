package schoolwork;

import java.awt.*;
public class Test01 {
	
	public static void main(String[] args){
		
		Frame f = new Frame("GridBagLayout");   //创建一个名为GridBagLayout的窗体
	
 }
}

class GridBagLayout{
	
}

class GridBagConstraints{

	public static final String BOTH = null;
	public String fill;
	
}
class Layout extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Layout(String title){
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints q = new GridBagConstraints();
		this.setLayout((LayoutManager) layout);
		q.fill = GridBagConstraints.BOTH;
		
	}
}
