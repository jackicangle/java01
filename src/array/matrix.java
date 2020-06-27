package array;

/**
 * 螺旋数组（二维）spiral, helix 
 * @author 86131
 * 2020/4/7
 */

import java.util.Scanner;
public class matrix {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] spiral = new int[n+1][n+1];
		
		int x = 0,y = 1; //当前遍历位置
		int px = 1,py = 0;//x,y在当前循环方向的增量
		int pn = n;  //该反向上还需要多少个数字（会递减，因为顺时针往里缩）
		int sum = n;  //当前遍历方向的终点位置
		
		/** 目标输出顺时针*/
		for(int i=1;i<n;i++){
			/**   移到下一个点:
			 * 		 第一次方向：1->5,x增量为1，y增量为0;
			 * 		 第二次方向：6->9,x增量为0，y增量为1;pn减少一个
			 */
			x += px;
			y += py;
			spiral[x][y] = i;
			
			if(i == sum){     //到达该方向的最后一个点
				if(px == 1 || px == -1){
					// x增量不为0，则竖向->横向：pn = pn-1
					// 竖向变为横向的时候，该方向上的数字的个数会减少一个
					sum += pn;
					py = px;
					px = 0;
					
				}else{  // x的增量为0 ，y的增量不为0，则为：横向->竖向
					sum += pn;
					px = -py;
					px = 0;
				}
			}
		}
		
		for(int i=1;i<n;i++){
			for(int j=1;j<n;j++){
				System.out.print(spiral[j][i]+"\t");//翻转复原输出
			}
			System.out.println();
		}
		
	}
}
