package CHAPTER15_CollectionFramework.example03_Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// 아이디와 비밀번호 검사하
public class HashTableExample {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("winter", "today");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.print("비밀번호 : ");
			String pwd = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다. \n");
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다. \n");
			}
			
		}
		
	}

}
