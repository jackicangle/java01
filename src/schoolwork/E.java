package schoolwork;

/**
 * Êý×éarray
 * @author 86131
 * 2020/3/31
 */


public class E {
	
	public static void main(String[] args){
		
		int [] arr = new int[]{12,23,34,45,56,67,67,43,32,1};
		int max = arr[0];
		int min = arr[0];
		int sum = 0,avg = 0;
		int i,temp=arr[0];
		for(i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
			sum += arr[i];
			avg = sum / arr.length;
			if(max<arr[i]){
				max = arr[i];
			}else if(min>arr[i]){
				min = arr[i];
			}
		}
		int j;
		for(i=0;i<arr.length-1;i++){
			for( j=0;j<i-arr.length+1;j++){
				if(arr[i]<temp){
					temp = arr[i];
					arr[i] = arr[i+1];
					temp = arr[i];
							
				}
				
			}
			
		}
		
		System.out.println("--------------------");
		System.out.println("max = "+max);
		System.out.println("min = "+min);
		System.out.println("--------------------");
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
		System.out.println("--------------------");
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
