package h_2023_06;

public class 타겟_넘버 {
	static int answer = 0;
	public int solution(int[] numbers, int target) {
		dfs(numbers,target,0,0);
		System.out.println(answer);
		return answer;
	}

	public void dfs(int [] n,int t,int deepth,int sum){
		if (deepth==n.length){
			if (sum==t) answer++;
		}else {
			dfs(n,t,deepth+1,sum+n[deepth]);
			dfs(n,t,deepth+1,sum-n[deepth]);
		}
	}

	public static void main(String[] args) {
		int n[]={1,1,1,1,1};
		int t=3;
		타겟_넘버 solution=new 타겟_넘버();
		solution.solution(n,t);
	}
}
