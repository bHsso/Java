package ch04;

public class MyArray {
	
	int[] intArr ;// int array
	int count ; //개수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM= -9999999;
	
	
	public MyArray() {
		count = 0 ;
		ARRAY_SIZE = 10 ;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count = 0 ;
		ARRAY_SIZE = size ;
		intArr = new int[size];
		
	}
	
	public void addElement(int num ) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return ;
		}
		intArr[count++]=num ;
	}
	
	public void insertElement(int position , int num ) {
		int i ;
		
		if(count >= ARRAY_SIZE) { // 꽉 찬 경우 
			System.out.println("not enough memory");
			return ;
		}
		
		if( position < 0 || position > count) {
			System.out.println("insert Err");
			return ;
		}
		
		for( i = count-1 ; i >= position ; i--) {
			intArr[i+1] = intArr[i];
		}
		
		intArr[position] = num ;
		count++;
	}
	
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		
		if( isEmpty() ) {
			System.out.println("There is no element");
			return ret ;
		}
		
		if(position < 0 || position >=count) {
			System.out.println("remove Err");
			return ret ;
		}
		
		ret = intArr[position];
		
		for(int i = position ; i < count -1 ; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret ;
	}
	
	public int getSize() {
		return count ;
	}
	
	public boolean isEmpty() {
		if(count==0) {
			return true ;
		}else return false ;
	}
	
//	public boolean isFull() {
//		if(count == ARRAY_SIZE) {
//			return true ;
//		}
//		else return false ;
//	}
	
	public  int getElement(int position ) {
		if(position < 0 || position > count -1 ) {
			System.out.println("검색 위치 오류 . 현재 리스트 개수 : "+ count );
			return ERROR_NUM ;
		}
		return intArr[position];
	}
	
	public void printAll() {
		if(count == 0 ){
			System.out.println("출력할 내용 없음");
			return ;
		}
		
		for(int i = 0 ; i< count ; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void removeAll() {
		for(int i = 0 ; i< count ; i++) {
			intArr[i] = 0 ;
		}
		count = 0;
	}
	
	
}
