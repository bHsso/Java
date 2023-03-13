package ch10;

public class MemberArrayListTest {
	
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList() ;
		
		Member memberLee = new Member(1001, "Lee");
		Member memberKim = new Member(1002, "kim");
		Member memberKang = new Member(1003, "Kang");
		Member memberHong = new Member(1004, "Hong");
		
		memberArrayList.addMmeber(memberLee );
		memberArrayList.addMmeber(memberKim);
		memberArrayList.addMmeber(memberKang);
		memberArrayList.addMmeber(memberHong );
		
		// add한 순서대로 출력 
		memberArrayList.showAllMember();
		memberArrayList.removeMemver(memberKang.getMemberId());
		System.out.println();
		memberArrayList.showAllMember();
	}

}
