package ch10;

public class PasswordException extends Exception { //IllegalAccessError : 런타임exception => 사용해도 되나, 컴파일러에서 걸러지지 않을 수도 있음.

	public PasswordException(String message) {
		super(message);
	}
}
