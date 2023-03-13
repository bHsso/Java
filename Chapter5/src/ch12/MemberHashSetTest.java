package ch12;

public class MemberHashSetTest {
	
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet() ;
		
		Member memberLee = new Member(1001, "Lee");
		Member memberKim = new Member(1002, "kim");
		Member memberKang = new Member(1003, "Kang");
		
		memberHashSet.addMmeber(memberLee );
		memberHashSet.addMmeber(memberKim);
		memberHashSet.addMmeber(memberKang);
		
		Member memberHong = new Member(1003, "Hong");
		memberHashSet.addMmeber(memberHong );
		
		memberHashSet.showAllMember();
	}

}
