package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}
	
}

public class MemberTreeSetTest {
	
	public static void main(String[] args) {
		/*
 		MemberTreeSet memberTreeSet = new MemberTreeSet() ;
		
		Member memberHong = new Member(1003, "Hong");
		Member memberLee = new Member(1001, "Lee");
		Member memberKim = new Member(1002, "kim");
		Member memberKang = new Member(1003, "Kang");
		
		memberTreeSet.addMmeber(memberLee );
		memberTreeSet.addMmeber(memberKim);
		memberTreeSet.addMmeber(memberKang);
		memberTreeSet.addMmeber(memberHong );
		
		memberTreeSet.showAllMember();
		*/

		TreeSet<String> set = new TreeSet<String>( new MyCompare() );
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		
		System.out.println(set);
	}

}
