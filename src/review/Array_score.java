package review;

/**
 * ��Ŀ�� ����һ���������洢12��ѧ���ĳɼ�{72,89,65,58,87,91,53,82,71,93,76,68}��
 *     ���㲢���ѧ����ƽ���ɼ�,���ֵ����Сֵ���ܳɼ���
 * @author ����
 *	2020/4/17
 */
public class Array_score {

	public static void main(String[] args){
		int[] arr={72,89,65,58,87,91,53,82,71,93,76,68};
		int max=arr[0],min=arr[0];
		double avg=0;
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}else if(min>arr[i]){
				min = arr[i];
			}
			sum += arr[i];
			avg = sum/arr.length;
		}
		System.out.println("ƽ���ɼ���"+avg+"\n��߷֣�"+max+"\n��ͷ֣�"+min+"\n�ܳɼ���"+sum);
	}
}
