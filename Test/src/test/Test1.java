package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,54,6,7,8,1,4,2,3,4,5,1};
		
		Set<Integer> b = new HashSet<Integer>();
		List<Integer> c = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++){
			b.add(a[i]);
			c.add(a[i]);
		}
		
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(b.contains(1));
		System.out.println(b.iterator().next());
	}	

}
