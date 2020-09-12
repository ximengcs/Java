package tag;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
/**
 * 
 * @author Simon
 *
 */
public class Pager extends SimpleTagSupport {

	private String url;
	
	private int limit = 5;
	
	@Override
	public void doTag() throws JspException, IOException {
		PageContext context = (PageContext)getJspContext();
		ServletRequest request = context.getRequest();
		JspWriter out = context.getOut();
		
		int pageNo = (Integer)request.getAttribute("pageNo");
		int pageCount = (Integer)request.getAttribute("pageCount");
		
		printLeftButton(pageNo, pageCount, out);
		
		printPage(pageNo, pageCount, out);
		
		printRightButton(pageNo, pageCount, out);
	}

	private void printRightButton(int pageNo, int pageCount, JspWriter out) throws IOException {
		if( pageNo != pageCount ) {
			out.println( "<a href='"+url+"?pageNo="+pageCount+"'>.."+pageCount+"</a>"
					+ "<a href='"+url+"?pageNo="+(pageNo+1)+"'> > </a>" );
		}
	}

	private void printPage(int pageNo, int pageCount, JspWriter out) throws IOException {
		int startNo = 1;
		if( pageNo > limit/2 ) {
			startNo = pageNo - limit/2;
		}
		if( pageNo > pageCount-limit )
			startNo = pageCount-limit;
		
		for( int count = startNo+limit; startNo <= count; startNo++ ) {
			if( startNo == pageNo )
				out.println( startNo );
			else
				out.println( "<a href='"+url+"?pageNo="+startNo+"'>"+startNo+"</a>" );
		}
		
	}

	private void printLeftButton(int pageNo, int pageCount, JspWriter out) throws IOException {
		if( pageNo != 1 ) {
			out.println( "<a href='"+url+"?pageNo="+(pageNo-1)+"'> < </a>"
					+ "<a href=''> 1.. </a>" );
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
