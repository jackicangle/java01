package array;

public class TestScore {
	public static void main(String[] args){
		char[][] answers = {
				{'A','C','D','A','B','D','D','A','C','B'},
				{'B','C','C','A','A','B','D','D','A','C'},
				{'C','B','C','C','A','A','B','D','D','A'},
				{'D','C','B','C','C','A','A','B','D','A'},
			};
		char[] keys = {'C','B','C','C','A','A','B','D','D','B'};
		
		for(int i = 0;i<answers.length;i++){
			int answer_true = 0;
			int answer_false = 0;
			for(int j=0;j<answers[i].length;j++){
				if(answers[i][j]==keys[j]){
					answer_true++;
				}else{
					answer_false++;
				}
			}
			System.out.println("第"+i+"个学生,答对的个数为："+answer_true+";\0答错的个数为："+answer_false);
		}
	}
		
	
}
