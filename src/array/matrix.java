package array;

/**
 * �������飨��ά��spiral, helix 
 * @author 86131
 * 2020/4/7
 */

import java.util.Scanner;
public class matrix {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] spiral = new int[n+1][n+1];
		
		int x = 0,y = 1; //��ǰ����λ��
		int px = 1,py = 0;//x,y�ڵ�ǰѭ�����������
		int pn = n;  //�÷����ϻ���Ҫ���ٸ����֣���ݼ�����Ϊ˳ʱ����������
		int sum = n;  //��ǰ����������յ�λ��
		
		/** Ŀ�����˳ʱ��*/
		for(int i=1;i<n;i++){
			/**   �Ƶ���һ����:
			 * 		 ��һ�η���1->5,x����Ϊ1��y����Ϊ0;
			 * 		 �ڶ��η���6->9,x����Ϊ0��y����Ϊ1;pn����һ��
			 */
			x += px;
			y += py;
			spiral[x][y] = i;
			
			if(i == sum){     //����÷�������һ����
				if(px == 1 || px == -1){
					// x������Ϊ0��������->����pn = pn-1
					// �����Ϊ�����ʱ�򣬸÷����ϵ����ֵĸ��������һ��
					sum += pn;
					py = px;
					px = 0;
					
				}else{  // x������Ϊ0 ��y��������Ϊ0����Ϊ������->����
					sum += pn;
					px = -py;
					px = 0;
				}
			}
		}
		
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				System.out.print(spiral[j][i]+"\t");//��ת��ԭ���
			}
			System.out.println();
		}
		
	}
}
