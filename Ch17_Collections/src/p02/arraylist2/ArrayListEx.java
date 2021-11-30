package p02.arraylist2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBatis");
		
		System.out.println("전체 갯수 : " + list.size());
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
