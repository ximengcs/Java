package test;

import test.lib.*;
import java.util.*;

public class Test3 {
	public static <T> void f( List<T> list, T item ){
		list.add( item );
	}
	public static void main( String[] args ){
		List<Fruit> list = new ArrayList<Fruit>();
		f(list, new Fruit());
		f(list, new Apple());
		f(list, new Banana());
		
		List<Apple> list1 = new ArrayList<Apple>();
		f(list1, new Apple());
		//f(list1, new Banana());
		
	}
}
