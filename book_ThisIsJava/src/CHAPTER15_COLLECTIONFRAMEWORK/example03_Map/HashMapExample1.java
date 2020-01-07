package CHAPTER15_COLLECTIONFRAMEWORK.example03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {

		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("이보한", 95);
		map.put("조휴일", 90);
		map.put("황재석", 80);
		map.put("김동현", 85);
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println();
		
		// 객체 찾기
		System.out.println("조휴일 : " + map.get("조휴일"));
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		// 객체 삭제
		map.remove("김동현");
		System.out.println("총 Entry 수 : " + map.size());
		
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entreyIterator = entrySet.iterator();
		
		while(entreyIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entreyIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);			
		}
		
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
