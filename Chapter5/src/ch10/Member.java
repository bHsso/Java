package ch10;

public class Member {

	private int memberId ;
	private String memberName ;
	
	public Member(int memberId , String memberName ) {// 생성자
		this.memberId = memberId ;
		this.memberName = memberName ;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName +" 회원 아이디 : " + memberId;
	}
	
}
