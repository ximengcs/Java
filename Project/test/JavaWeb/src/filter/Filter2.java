package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(servletNames = { "Test15" })
public class Filter2 implements Filter {

    public Filter2() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("前面");
		
		chain.doFilter(request, response);
		
		System.out.println("后面");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
