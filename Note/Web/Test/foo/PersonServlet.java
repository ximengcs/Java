package foo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PersonServlet extends HttpServlet {
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response )
	throws IOException, ServletException {
		foo.Person p = new foo.Person();
		p.setName( "Leelu" );
		foo.Dog d = new foo.Dog();
		d.setName( "Cylde" );
		foo.Toy t1 = new foo.Toy();
		t1.setName( "stick" );
		foo.Toy t2 = new foo.Toy();
		t2.setName( "neightbor's cat" );
		foo.Toy t3 = new foo.Toy();
		t3.setName( "Barbietm doll head" );
		d.setToys( new foo.Toy[]{ t1, t2, t3 } );
		p.setDog( d );
		request.setAttribute( "person", p );
		
		RequestDispatcher view = request.getRequestDispatcher( "test.jsp" );
		view.forward( request, response );
	}
}