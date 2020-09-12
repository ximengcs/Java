<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@ page import = "java.sql.*" %>

<%!
String str = "";
private void tree( Connection conn, int id, int level ) {
	Statement stmt = null;
	ResultSet rs = null;
	
	String preStr = null;
	for( int i = 0; i < level; i++ ) {
		preStr += "----";
	}
	
	try {
		stmt = conn.createStatement();
		String sql = "select * from article where pid = " + id;
		rs = stmt.executeQuery( sql );
		while( rs.next() ) {
			str += "<tr><td>" + rs.getInt( "id") + "</td><td>" + preStr + rs.getString( "cont" ) + "</td></tr>";
			if( rs.getInt( "isLeaf" ) != 0 ) {
				tree( conn, rs.getInt("id"), level+1 );
			}
		}
	} catch ( SQLException e ) {
		e.printStackTrace();
	} finally {
		try {
			if( rs != null )
				rs.close();
			if( stmt != null )
				stmt.close();
		} catch( SQLException e ) {
			e.printStackTrace();
		}
	}
}
%>

<%
Class.forName( "com.mysql.jdbc.Driver" );
String url = "jdbc:mysql://localhost/bbs";
String user = "root";
String pswd = "982599829";
Connection conn = DriverManager.getConnection( url, user, pswd );

Statement sta = conn.createStatement();
ResultSet rs = sta.executeQuery( "select * from article where pid = 0" );

while( rs.next() ) {
	str += "<tr><td>" + rs.getInt( "id") + "</td><td>" + rs.getString( "cont" ) + "</td></tr>";
	if( rs.getInt("isLeaf") != 0 ) {
		tree( conn, rs.getInt( "id"), 1 );
	}
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>

<table border = "1">
<%= str %>
</table>
</body>
<%
rs.close();
sta.close();
conn.close();
%>
</html>