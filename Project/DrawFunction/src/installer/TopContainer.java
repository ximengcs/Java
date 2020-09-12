package installer;

import java.awt.Color;

import javax.swing.JPanel;

import dao.ExpressionDao;
import view.ExitButton;
import view.GetInfo;
import view.Info;

public class TopContainer extends JPanel {

	public static int HEIGHT;
	
	private ExitButton exit;
	private Info info;
	private GetInfo getInfo;
	private ExpressionDao dao;
	private Main main;
	
	public TopContainer( Main main, ExpressionDao dao ) {
		this.main = main;
		this.dao = dao;
		initField();
		initView();
		addOther();
	}
	
	private void initField() {
		exit = new ExitButton();
		HEIGHT = 200;
		info = new Info();
		getInfo = new GetInfo(info, dao, main);
	}
	
	private void initView() {
		setBounds(0, 0, Main.WIDTH, TopContainer.HEIGHT);
		setBackground(Color.gray);
	}
	
	private void addOther() {
		add(exit);
		add(info);
		add(getInfo);
	}
}
