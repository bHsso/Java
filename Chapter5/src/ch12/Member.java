package ch12;

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
	public boolean equals(Object obj) {
		if( obj instanceof Member ) {
			Member member = (Member)obj ;
			if( this.memberId == member.memberId ) {
				return true ;
			}else return false ;
		}
		return false ;
	}
	

	@Override
	public int hashCode() {
		// hashCode: 메모리 주소 .. 메모리 주소는 다름(물리적)/ memberId 값으로 논리적으로 동일성을 체크 
//		return super.hashCode();
		return memberId ;
	}

	@Override
	public String toString() {
		return memberName +" 회원 아이디 : " + memberId;
	}
	
}
