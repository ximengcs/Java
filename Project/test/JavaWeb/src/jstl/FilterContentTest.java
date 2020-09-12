package jstl;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import filter.Filter;

public class FilterContentTest extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		StringWriter writer = new StringWriter();
		getJspBody().invoke( writer );
		String content = writer.toString();
		
		String newContent = Filter.HTMLFilter(content);
		
		out.println( newContent );
	}
}
