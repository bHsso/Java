package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember( Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) { // int : Integer WrapperCls
		if( hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		System.out.println(" no element ");
		return false ;
	}
	
	public void showAllMember() {
		/* HashMap에서 Iterator 가져올 수 없음 */
		Iterator<Integer> ir = hashMap.keySet().iterator(); // key값에서 iterator 가져올 수 잇음.
		// Iterator는 컬렉션클래스에서 지원=> Integer || Member 를 이용해서 iterator를 가져올 수 잇음 .
		
		while( ir.hasNext() ) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
	}

}
