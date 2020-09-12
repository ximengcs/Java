package jstl;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ThenTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		IfTag parent = (IfTag)getParent();
		if( parent.isFlag() )
			getJspBody().invoke(null);
	}
}
