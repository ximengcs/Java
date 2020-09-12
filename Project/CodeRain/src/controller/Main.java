package controller;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import model.Point;
import model.Word;

public class Main extends JFrame {

	public static int width;
	public static int height;
	
	Draw draw = null;
	
	public Main() {
		setUndecorated(true);
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension dimension = tool.getScreenSize();
		width = dimension.width;
		height = dimension.height;
		setSize(width,height);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void run() {
		draw = new Draw();
		draw.setList(createList());
		add( draw );
		addKeyListener( new Esc(this) );
		while( true ) {
			draw.nextList();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			draw.repaint();
		}
	}
	
	private int base = 40;
	private List<Word> createList() {
		List<Word> list = new ArrayList<Word>();
		Dimension size = draw.getSize();
		int width = (int)size.getWidth();
		
		int i = 0;
		while( i < width ) {
			Word word = new Word(new Point(i,0));
			word.next(0);
			list.add( word );
			i += base;
		}
		return list;
	}
	
	public static void main(String[] args) {
		Main m   = new Main();
		m.run();
	}
}
