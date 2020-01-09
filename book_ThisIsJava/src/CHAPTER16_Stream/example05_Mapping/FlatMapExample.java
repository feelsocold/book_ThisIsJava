package CHAPTER16_Stream.example05_Mapping;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		inputList1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
	
		System.out.println();
		
		List<String> inputList2 = Arrays.asList("1", "2", "3", "4", "5", "6");
		inputList2.stream()
			.flatMapToInt(data -> {
				String[] strArr = data.split(",");
				int[] intArr = new int[strArr.length];
				for (int i = 0; i < strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);
			})
			.forEach(number -> System.out.println(number));
		
	
	}

}
