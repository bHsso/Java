package ch14;

import java.util.Comparator;
import java.util.HashMap;

public class MemberHashMapTest {
	
	public static void main(String[] args) {
	
 		MemberHashMap memberHashMap = new MemberHashMap() ;
		
		Member memberHong = new Member(1003, "Hong");
		Member memberLee = new Member(1001, "Lee");
		Member memberKim = new Member(1002, "kim");
		Member memberKang = new Member(1003, "Kang");
		
		memberHashMap.addMember(memberLee );
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong );
		
		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1001, "kim");
		hashMap.put(1002, "Lee");
		hashMap.put(1003, "Park");
		hashMap.put(1004, "Hong");
		
		System.out.println(hashMap);// {1001=kim, 1002=Lee, 1003=Park, 1004=Hong}
	}

}
