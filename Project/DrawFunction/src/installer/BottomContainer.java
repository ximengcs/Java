package installer;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Iterator;

import javax.swing.JPanel;

import dao.ExpressionDao;
import model.Point;

public class BottomContainer extends JPanel {

	private ExpressionDao dao;

	public BottomContainer(ExpressionDao dao) {
		this.dao = dao;
		initView();
	}

	private void initView() {
		setBackground(Color.white);
		setBounds(0, TopContainer.HEIGHT, Main.WIDTH, Main.HEIGHT - TopContainer.HEIGHT);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Iterator<Point> it = dao.getPoints().iterator();

		Point pre = null;

		if (it.hasNext())
			pre = it.next();

		if (pre != null)
			while (it.hasNext()) {
				Point current = it.next();

				
				g.setColor(Color.RED);
				
				g.drawLine((int) current.getX()+500, (int) current.getY()+400, (int) pre.getX()+500, (int) pre.getY()+400);
				System.out.println("current:"+current+" pre:"+pre);
				pre = current;
				
			}
	}
}
