package CHAPTER13_Generic.example07_inheritance;

public class ChildProduct<T, M, C>  extends Product<T, M> {
	
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	
}
