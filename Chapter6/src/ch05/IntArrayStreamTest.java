package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println();
		Arrays.stream(arr).forEach( n -> System.out.println(n) );
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n -> System.out.println(n) );// 연산 수행 후 스트림 소모됨 다시 생성한 후 사용가능.
		
		// 또 다른 수행을 위해서는 다시 생성을 해야 함.
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
	}

}
