package test;

import java.io.UnsupportedEncodingException;

public class Test10 {

	public static void main(String[] args) throws UnsupportedEncodingException
    {
       char[] strChar="".toCharArray();
       String result="";
       for(int i=0;i<strChar.length;i++){
           result +=Integer.toBinaryString(strChar[i])+ " ";
       }
       System.out.println(result);
    }
}
