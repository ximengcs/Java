package jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Simple4 extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		String[] arr = { "a", "b", "c", "d", "e" };
		
		for( String var : arr ) {
			getJspContext().setAttribute( "tmp", var );
			getJspBody().invoke(null);
		}
	}
}
