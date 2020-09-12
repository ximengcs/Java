package thander;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Map extends JFrame {

	private int thanderQuantity;
	
	private JButton startGame;
	private JButton repeatStart;
	private JButton endGame;
	private JLabel gameState;
	
	private HashSet<MyPosition> thanderPosition;
	private JButton[][] map;
	private int[][] data;
	private final int heigth, 
	kidth;
	
	private Icon[] icons;
	
	private JPanel menu;
	private JPanel body;
	
	private HashMap<JButton, Integer> state;
	
	public Map() {
		heigth = 20;
		kidth = 20;
		
		data = new int[heigth][kidth];
		
		thanderPosition = new HashSet<MyPosition>();
		thanderQuantity = 66;
		
		state = new HashMap<JButton, Integer>();
		
		icons = new Icon[ 13 ];
		startGame = new JButton( "start" );
		repeatStart = new JButton( "repaeat" );
		endGame = new JButton( "exit" );
		gameState = new JLabel( "" );
		map = new JButton[ kidth ][ heigth ];
		menu = new JPanel();
		body = new JPanel();
		
		for( int i = 0; i < 10; i++ )
			icons[i] = new ImageIcon( getClass().getResource( i + ".jpg" ) );
		icons[11] = new ImageIcon( getClass().getResource( "null.jpg" ) );
		icons[12] = new ImageIcon( getClass().getResource( "10.jpg" ) );
		
		for( int i = 0; i < heigth; i++ )
			for( int j = 0; j < kidth; j++ ) {
				map[i][j] = new JButton();
				changeSize( map[i][j] );
				map[i][j].addActionListener( new MyEvent() );
			}
		
		menu.setLayout( new FlowLayout() );
		menu.add( startGame );
		menu.add( repeatStart );
		menu.add( endGame );
		menu.add( gameState );
		
		body.setLayout( new GridLayout( kidth, heigth ) );
		for( JButton[] items : map )
			for( JButton item : items )
				body.add( item );
		
		add( menu );
		add( body );
		
		setResizable( false );
		setLayout( new FlowLayout() );
		setVisible( true );
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( (kidth+1)*icons[0].getIconWidth(), (heigth+4)*icons[0].getIconHeight() );
		
		init();
	}
	
	private class MyEvent implements ActionListener {
		public void actionPerformed( ActionEvent e ) {
			MyPosition p = select((JButton)e.getSource());
			switch( data[ p.getX() ][ p.getY() ] ) {
				case -1 : 
					map[ p.getX() ][ p.getY() ].setDisabledIcon( icons[0] );
					gameOver();
					break;
				case 0 : nullIcon( p );clickNull( p );break;
				case 1 : 
				case 2 :
				case 3 :
				case 4 :
				case 5 :
				case 6 :
				case 7 :
				case 8 :
				case 9 : set( p );
			}
		}
		private void set( MyPosition po ) {
			clicked(po);
			map[ po.getX() ][ po.getY() ].setDisabledIcon( icons[data[ po.getX() ][ po.getY() ]] );
		}
		private MyPosition select( JButton button ) {
			for( int i = 0; i < heigth; i++ )
				for( int j = 0; j < kidth; j++ )
					if( button == map[i][j] )
						return new MyPosition( i, j );
			return null;
		}
		private void clicked( MyPosition po ) {
			map[ po.getX() ][ po.getY() ].setEnabled( false );
		}
		private HashSet<MyPosition> set = new HashSet<MyPosition>();
		private void nullIcon( MyPosition po ) {
			map[ po.getX() ][ po.getY() ].setDisabledIcon( icons[12] );
		}
		private void clickNull( MyPosition po ) {
			set.clear();
			clicked( po );
			clearNull( po );
		}
		private void clearNull( MyPosition po ) {
			
			if( set.contains( po ) )
				return;
			else
				set.add( po );
			if( po.getX() < 0 || po.getX() >= heigth || po.getY() < 0 || po.getY() >= kidth )
				return;
			if( data[ po.getX() ][ po.getY() ] != 0 ) {
				//set( po );
				return;
			}
			nullIcon( po );
			clicked( po );
			clearNull( new MyPosition( po.getX()-1, po.getY() ) );
			clearNull( new MyPosition( po.getX()+1, po.getY() ) );
			clearNull( new MyPosition( po.getX(), po.getY()+1 ) );
			clearNull( new MyPosition( po.getX(), po.getY()-1 ) );
		}
		private void gameOver() {
			Iterator<MyPosition> it = thanderPosition.iterator();
			while( it.hasNext() ) {
				MyPosition p = it.next();
				map[ p.getX() ][ p.getY() ].setDisabledIcon( icons[0] );
			}
			for( int i = 0; i < heigth; i++ )
				for( int j = 0; j < kidth; j++ )
					map[i][j].setEnabled( false );
			gameState.setText( "游戏结束" );
		}
	}
	private void init() {
		state.clear();
		reset();
		loadIcon();
		
	}
	
	private void loadIcon() {
		for( int i = 0; i < heigth; i++ )
			for( int j = 0; j < kidth; j++ )
				map[i][j].setIcon( icons[11] );
	}
	
	private class MyPosition {
		private int x;
		private int y;
		
		public MyPosition( int x, int y ) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals( Object obj ) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyPosition other = (MyPosition) obj;
			if (!getOuterType().equals( other.getOuterType() ))
				return false;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		private Map getOuterType() {
			return Map.this;
		}
		
		public String toString() {
			return "\nx : " + x + " y : " + y;
		}
	}
	
	private void reset() {
		Random rand = new Random();
		thanderPosition.clear();
		for( int i = 0; i < thanderQuantity; i++ ) {
			if( !thanderPosition.add( 
					new MyPosition( rand.nextInt( heigth-1 ), rand.nextInt( kidth-1 ) ) ) )
				i--;
		}
		
		Iterator<MyPosition> it = thanderPosition.iterator();
		while( it.hasNext() ) {
			MyPosition tmp = it.next();
			data[ tmp.getX() ][ tmp.getY() ] = -1;
			
		}
		
		for( int i = 0; i < data.length; i++ )
			for( int j = 0; j < data[i].length; j++ )
				for( int k = 1, cou = -1; k <= 3; k++, cou++ ) 
					for( int l = 1, co = -1; l <= 3; l++, co++ ) 
						if( i+cou < 0 || j+co < 0 || i == 0 || j == 0 || 
							i+cou >= data.length || j+co >= data[i].length
							|| data[i][j] == -1 )
							continue;
						else {
							if( data[ i+cou ][ j+co ] == -1 )
								data[i][j]++;
						}
	}
	
	private void test( int[][] a ) {
		for( int i = 0; i < heigth; i++ ) {
			for( int j = 0; j < kidth; j++ )
				System.out.format( "%2d", a[i][j] );
			System.out.println(  );
		}
	}
	
	private void changeSize( JButton button ) {
		button.setPreferredSize( new Dimension( icons[0].getIconHeight(), icons[0].getIconWidth() ) );
	}

	
	public static void main( String[] args ) {
		new Map();
	}
}
