/*
훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

        String str2 = br.readLine();

        if(Integer.parseInt(str2) < 60) {
            H++;
            M = 60 - M;
            if(H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else {
			System.out.println(H + " " + (M - 45));
		}
    }
}

