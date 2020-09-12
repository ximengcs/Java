package filter;

public class Filter {

	public static String HTMLFilter( String content ) {
		String result = new String();
		
		// 转换和号
		result = result.replaceAll( "&", "&amp;" );
		
		// 转换空格
		result = content.replaceAll( " ", "&nbsp;" );
		
		// 转换尖括号
		result = result.replaceAll( "<", "&lt;" );
		result = result.replaceAll( ">", "&gt;" );
		
		// 转换双引号
		result = result.replaceAll( "\"", "&quot;" );
		
		// 转换单引号
		result = result.replaceAll( "'", "&apos;" );
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println( Filter.HTMLFilter( "<html>   </html>" ) );
	}
}
