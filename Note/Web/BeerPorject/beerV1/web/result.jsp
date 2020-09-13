<%@ page import="java.util.*" %>

<html>
<body>

<h1 align = "center">Beer Recommendations JSP</h1>
<p>
<%
	List styles = (List)resquest.getAttribute( "styles" );  //请求得到一个属性
	Iterator it = styles.iterator();
	while( it.hasNext() ) {
		out.print( "<br/>try: " + it.next() );
	}
%>
</p>

</body>
</html>