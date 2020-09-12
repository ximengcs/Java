package question;

import static lib.net.mindview.util.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Q_797_17 extends JFrame {

	private JTextField login = new JTextField(10);
	private JPasswordField password = new JPasswordField(10);
	private JButton button = new JButton( "登录" );
	
	private String[] info = new String[] {
			"98259", "104029."
	};
	
	public Q_797_17() {
		button.addActionListener( new ActionListener() {
			public void actionPerformed( ActionEvent e ) {
				if( login.getText().equals( info[0] ) && 
						String.valueOf( password.getPassword() ).equals( info[1] ) ) {
					JOptionPane.showMessageDialog( null, "登录成功" );
				} else
					JOptionPane.showMessageDialog( null, "密码或用户名错误" );
			}
		} );
		setLayout( new FlowLayout() );
		add( login );
		add( password );
		add( button );
	}
	
	public static void main( String[] args ) {
		run( new Q_797_17(), 200, 200 );
	}
}
