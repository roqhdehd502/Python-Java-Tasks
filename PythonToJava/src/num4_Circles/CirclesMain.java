package num4_Circles;

import java.util.Scanner;

public class CirclesMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CirclesGraphic cirGrp = new CirclesGraphic();
		CirclesGraphic.CirclesDraw cirDrw = cirGrp.new CirclesDraw();
		
		//두 원의 좌표 및 반지름 입력
		System.out.println("원 1에 대한 x좌표, y좌표, 반지름을 입력하세요: ");
		double x1 = Double.parseDouble(sc.nextLine());
		double y1 = Double.parseDouble(sc.nextLine());
		double r1 = Double.parseDouble(sc.nextLine());
		System.out.println("원 2에 대한 x좌표, y좌표, 반지름을 입력하세요: ");
		double x2 = Double.parseDouble(sc.nextLine());
		double y2 = Double.parseDouble(sc.nextLine());
		double r2 = Double.parseDouble(sc.nextLine());
		
		//원과 원의 관계
		double d = distance(x1, x2, y1, y2);
		if((r2+r1)>d) {
			if(d>(r2-r1)) {
				System.out.println("두 원이 두 점에서 만나 있습니다.(중첩)");
			}
		}
		else if((r2+r1)==d) {
			System.out.println("두 원이 한 점에서 외접해 있습니다.(중첩)");
		}
		else if((r2-r1)==d) {
			System.out.println("두 원이 한 점에서 내접해 있습니다.(내포)");
		}
		else if(d==0) {
			System.out.println("두 원이 동심원으로 되어있습니다.(내포)");			
		}
		else {
			System.out.println("두 원이 만나지 않습니다.");
		}
		/*
		//입력 한 두 원의 좌표 및 반지름으로 그림 출력하기
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawArc(x1, y1, (r1/2), (r1/2), 0, 360); //이거 해결되면 완성
			g.setColor(Color.RED);
			g.drawArc(x2, y2, (r2/2), (r2/2), 0, 360);
		}
		*/
		sc.close();
	}
	
	//두 원의 중점거리
	static double distance(double x1, double x2, double y1, double y2) {

		return Math.sqrt(Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2));
	}
}