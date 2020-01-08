package CHAPTER14_Lambda.example03_FunctionalInterface;

public class Member2 {
	private String name;
	private String id;
	
	public Member2() {
		System.out.println( "Member2() 실행" );
	}
	
	public Member2(String id) {
		System.out.println("Member(String id) 실행");
		this.id = id;
	}
	
	public Member2(String name, String id) {
		System.out.println("Member(String name, String id)");
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
