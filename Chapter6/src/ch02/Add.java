package ch02;

//Annotation : compiler 에게 정보를 전달해주는 / 사전에 오류 막아주는 역할
@FunctionalInterface 
public interface Add {
	public int add(int x , int y);
//	public int sub(int x , int y ); // 사전 오류 잡음.
}
