package filter;

public class Filter {

	public static String HTMLFilter( String content ) {
		String result = new String();
		
		// ת���ͺ�
		result = result.replaceAll( "&", "&amp;" );
		
		// ת���ո�
		result = content.replaceAll( " ", "&nbsp;" );
		
		// ת��������
		result = result.replaceAll( "<", "&lt;" );
		result = result.replaceAll( ">", "&gt;" );
		
		// ת��˫����
		result = result.replaceAll( "\"", "&quot;" );
		
		// ת��������
		result = result.replaceAll( "'", "&apos;" );
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println( Filter.HTMLFilter( "<html>   </html>" ) );
	}
}
