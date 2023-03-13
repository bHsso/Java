package ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<Member> treeSet ;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>( new Member() );
	}
	
	public void addMmeber(Member member ) {
		treeSet.add(member);
	}
	
	public boolean removeMemver(int memberId) {
		
		/** iterator 로 접근  **/
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId ) {
				treeSet.remove(member);
				return true ;
			}
		}
		System.out.println( memberId + " 존재 x " );
		return false ;
		/*** end iterator **/
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
