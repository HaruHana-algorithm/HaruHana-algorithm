package h_2023_06;

public class 옹알이2 {
	public int solution(String [ ] babling){
		int cnt=0;
		for (int i=0;i<babling.length;i++){
			if (babling[i].contains("ayaaya")||babling[i].contains("mama")||babling[i].contains("woowoo")||babling[i].contains("yeye")){
				continue;
			}

			babling[i]=babling[i].replace("aya"," ");
			babling[i]=babling[i].replace("ye"," ");
			babling[i]=babling[i].replace("woo"," ");
			babling[i]=babling[i].replace("ma"," ");
			babling[i]=babling[i].replace(" ","");
			if (babling[i].length()==0){
				cnt++;
			}
		}
		return cnt;
	}
}
