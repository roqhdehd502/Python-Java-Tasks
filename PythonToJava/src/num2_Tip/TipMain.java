package num2_Tip;

import java.util.Scanner;

public class TipMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//서비스료와 팁 비율 입력
		System.out.println("서비스료를 입력하세요: ");
		double svcg = Double.parseDouble(sc.nextLine());  //svcg: Service Charge
		System.out.println("팁 비율을 입력하세요: ");
		double tr = Double.parseDouble(sc.nextLine());  //tr: Tip Ratie
		
		//팁과 총 요금 출력
		double tip = tipCalc(svcg, tr);
		double td = totalCalc(svcg, tr); //td: Total Due
		System.out.printf("팁은 %.2f이고 ", tip);
		System.out.printf("총 팁액수는 %.2f입니다.%n", td);
		sc.close();
	}
	
	//팁과 총 요금 계산
	static double tipCalc (double svcg, double tr) {

		return svcg * (tr/100);
	}
	
	static double totalCalc (double svcg, double tr) {
		double t = tipCalc(svcg, tr);
		
		return svcg + t;
	}
}