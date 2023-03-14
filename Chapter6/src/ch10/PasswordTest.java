package ch10;

public class PasswordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException {
		
		if(password == null) {
			throw new PasswordException("비밀번호 null err");
		}else if(password.length() < 5) {
			throw new PasswordException("5이상");
		}else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("문자 , 숫자|특수문자 포함");
		}
		this.password = password;
	}
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		
		String password = null;
		
		try {
			test.setPassword(password);
			System.out.println("오류없음");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		password = "abc";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		password = "abc1!";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음");
		} catch (PasswordException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
