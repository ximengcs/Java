package jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Simple2 extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		getJspBody().invoke(null);
	}
}
