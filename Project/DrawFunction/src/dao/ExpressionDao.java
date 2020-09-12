package dao;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Expression;
import model.Point;

public class ExpressionDao {

	private String info;
	
	private ArrayList<Point> result;
	
	public ExpressionDao() {
		result = new ArrayList<Point>();
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo( String info ) {
		this.info = info;
	}
	
	public void run() {
		Expression exp = createExpression();
		
		result.clear();
		
		for( double i = -100; i < 100; i++ ) {
			result.add(new Point(i, exp.count(i)));
		}
		System.out.println(exp);
		System.out.println(result);
	}
	
	private Expression createExpression() {
		Expression exp = new Expression();
		sperate(exp);
		return exp;
	}
	
	private void sperate( Expression exp ) {
		
		String[] all = info.split("=");
		
		Pattern pattern = Pattern.compile("[\\+\\-\\*/]?[0-9]*[a-z]*");
		
		Matcher matcher = pattern.matcher(all[0]);
		
		boolean rc = false;
		
		while( matcher.find() ) {
			String g = matcher.group();
			if( g.equals("") )
				continue;
			if( g.matches(".*y")) {
				if( g.matches("\\-y") )
					rc = true;
				continue;
			}
			if( g.matches("\\+.+") )
				g = g.replaceAll("\\+", "-");
			else if( g.matches("[0-9]*[a-z]*") )
				g = g.replaceFirst("", "-");
			else
				g = g.replaceAll("\\-", "+");
			
			exp.addExpress(g);
		}
		
		Matcher matcher2 = pattern.matcher(all[1]);
		while( matcher2.find() ) {
			String g = matcher2.group();
			if(g.equals(""))
				continue;
			if( g.matches("[0-9]*[a-z]*") )
				g = g.replaceFirst("", "+");
			
			if( rc ) {
				g = g.replaceFirst("\\+", "-");
			}
			exp.addExpress(g);
		}
	}
	
	public ArrayList<Point> getPoints() {
		
		return result;
	}
	
	public static void main(String[] args) {
		ExpressionDao dao = new ExpressionDao();
		dao.setInfo("y=1+x*x");
		dao.run();
	}
}
