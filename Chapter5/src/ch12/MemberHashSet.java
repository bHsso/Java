package ch12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet ;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public MemberHashSet( int size) {
		hashSet = new HashSet(size);
	}
	
	public void addMmeber(Member member ) {
		hashSet.add(member);
	}
	
	public boolean removeMemver(int memberId) {
		
		/*  get으로 접근
		 * for(int i = 0 ; i< arrayList.size() ; i++) { Member member =
		 * arrayList.get(i);
		 * 
		 * int tempId = member.getMemberId(); if(tempId == memberId ) {
		 * arrayList.remove(i); return true ; } } System.out.println(memberId + " 존재X");
		 * return false ;
		 */
		
		/** iterator 로 접근  **/
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId == memberId ) {
				hashSet.remove(member);
				return true ;
			}
		}
		System.out.println(memberId + " 존재 x ");
		return false ;
		/*** end iterator **/
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
