package CHAPTER16_Stream.example02_StreamKind;

import java.util.Arrays;
import java.util.stream.Stream;

// 배열로부터 스트림 얻기

public class FromArrayExample {

	public static void main(String[] args) {
		String[] strArray = { "홍길동", "일지매", "조휴일" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach( a -> System.out.print(a + ", "));
	}

}
