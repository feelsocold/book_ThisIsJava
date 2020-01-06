package CHAPTER13_Generic.example06_wildcardtype;

public class Util {

	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();		// doubleValue() : 숫자를 double타입으로 변환한다.
		double v2 = t2.doubleValue();

		return Double.compare(v1,v2);		// Double.compare() : 첫 번째 값이 작으면 -1, 같으면 0, 크면 1을 반환한다.
	}
	
}
