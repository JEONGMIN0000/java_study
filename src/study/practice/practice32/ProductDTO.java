package study.practice.practice32;

public class ProductDTO {
	
	int pCode;
	String pName;
	int pPrice;
	
	public ProductDTO() {
		
	}
	
	public ProductDTO(int pCode, String pName, int pPrice) {
		super();
		this.pCode = pCode;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public int getpCode() {
		return pCode;
	}

	public void setpCode(int pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	
	

}
