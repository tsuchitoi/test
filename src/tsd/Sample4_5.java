package tsd;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample4_5 {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();
		String st1 = "ready";
		String st2 = "set";
		String st3 = "go";
		
		mylist.add(st1);
		mylist.add(st2);
		mylist.add(st3);
		
		
//		for(String st : mylist) {
//			System.out.println(st);
//		}
//		for(int i = 0; i < mylist.size(); i++) {
//			System.out.println(mylist.get(i));
//		}
		
		String st = null;
		Iterator<String> itr = mylist.iterator();
		while(itr.hasNext()) {
			st = itr.next();
			System.out.println(st);
		}
		
		
	}

}
