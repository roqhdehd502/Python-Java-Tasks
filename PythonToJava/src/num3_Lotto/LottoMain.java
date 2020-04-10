package num3_Lotto;
import java.util.*;

/*
 -사용자의 예상번호가 정확한 순서로 복권번호와 모두 일치하면 10,000,000원의 상금을 받는다.
 -사용자의 예상번호가 순서는 다르지만 복권번호와 모두 일치하면 3,000,000원의 상금을 받는다.
 -사용자의 예상번호 중 1개 숫자만 복권번호와 순서까지 일치하면 1,000,000원의 상금을 받는다.
 */

public class LottoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int[] lt_num = new int[2]; //추첨되어서 나오는 복권번호
		int[] guess = new int[2]; //사용자가 입력 할 복권번호
		boolean[] already = new boolean[10];
		int sq_cnt, num_cnt; //sq_cnt:순서와 숫자가 맞음, num_cnt:숫자만 맞음
		
		for (int i=0; i<10; i++) {
			already[i] = false;
		}
		
		int count = 0; //0~9까지 임의 수 추첨
		while (count<2) {
			int trial = rand.nextInt(10);
			if (!already[trial]) {
				lt_num[count] = trial;
				already[trial] = true;
				count++;
			}
		}
		
		boolean finish = false;
		while (!finish) {
			sq_cnt = num_cnt = 0;
			System.out.println("0~9까지 두 정수를 입력해주세요. >>");
			for (int k=0; k<2; ++k) { //guess와 lt_num을 비교하여 순서와 번호가 맞으면 sq_cnt증가, 번호만 맞으면 num_cnt증가
				guess[k] = sc.nextInt();
				for (int j=0; j<2; ++j) {
					if (guess[k] == lt_num[j]) {
						if (k==j) sq_cnt++;
						else num_cnt++;
					}
				}
			}
			
			//
			if(sq_cnt == 2) {
				System.out.println("복권번호는 " + Arrays.toString(lt_num) + " 입니다.");
				System.out.println("순서와 숫자 모두 일치: 10,000,000원을 획득하셨습니다.");
				finish = true;
			}
			else if(num_cnt == 2) {
				System.out.println("복권번호는 " + Arrays.toString(lt_num) + " 입니다.");
				System.out.println("숫자만 모두 일치: 3,000,000원을 획득하셨습니다.");
				finish = true;
			}
			else if(sq_cnt == 1) {
				System.out.println("복권번호는 " + Arrays.toString(lt_num) + " 입니다.");
				System.out.println("한 자리 숫자 일치");
				finish = true;
			}
			else {
				System.out.println("복권번호는 " + Arrays.toString(lt_num) + " 입니다.");
				System.out.println("아쉽게도 일치하는 숫자가 없습니다.");
				finish = true;
			}
			break;
		}
		sc.close();
	}
}