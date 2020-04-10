package num4_Circles;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CirclesGraphic extends JFrame { //원 그리기 캔버스 클래스
	private static final long serialVersionUID = 1L;
	public CirclesGraphic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setContentPane(new CirclesDraw());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CirclesGraphic();
	}
	
	class CirclesDraw extends JPanel { //원 그리기 툴 클래스
		private static final long serialVersionUID = 1L;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawArc(x1, y1, (r1/2), (r1/2), 0, 360); //이거 해결되면 완성
			g.setColor(Color.RED);
			g.drawArc(x2, y2, (r2/2), (r2/2), 0, 360);
		}
	}
}