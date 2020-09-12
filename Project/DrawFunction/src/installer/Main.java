package installer;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import dao.ExpressionDao;

public class Main extends JFrame {

	public static int WIDTH;
	public static int HEIGHT;
	
	private TopContainer top;
	
	private BottomContainer bottom;
	
	private ExpressionDao dao;
	
	public Main() {
		
		initField();
		
		initView();
		
		addOther();
	}
	
	private void addOther() {
		add(top);
		add(bottom);
	}
	
	private void initView() {
		setSize( WIDTH, HEIGHT );
		setLocationRelativeTo(null);
		setUndecorated(true);
		setVisible(true);
	}
	
	private void initField() {
		initSize();
		initOther();
		initContainer();
	}
	
	private void initOther() {
		dao = new ExpressionDao();
	}
	
	private void initContainer() {
		bottom = new BottomContainer(dao);
		top = new TopContainer(this, dao);
	}
	
	private void initSize() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension size = tool.getScreenSize();
		WIDTH = (int)size.getWidth();
		HEIGHT = (int)size.getHeight();
	}
	
	public static void main( String[] args ) {
		new Main();
	}
}
