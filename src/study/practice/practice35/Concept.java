package study.practice.practice35;

public class Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 외부 공공데이터포탈 API 서버 <-> ApiService <-> Main <-> DAO <-> DB
		// 										(DTO)      (DTO)
		CartDTO cart = goGetDonMan(); //만두
		//만두, 돈까스
	}
	
	//돈까스, 만두
	public static CartDTO goGetDonMan() {
		
		CartDTO cart = new CartDTO();
		cart.item1 = "돈까스";
		cart.item2 = "만두";
		
		return cart;
		//return "만두";
	}
}

class CartDTO {  //포장박스
	//필드
	String item1;
	String item2;
	
	//생성자 생성 편하게
	//메소드 getter,setter
}

class FoodDAO {  //음식 DB 접근 담당 객체
	// findFoodList
	// saveFood
	// modifyFood
	// removeFood
	// findFoodByFoodId
	//     (DTO)
}

class FoodDTO { }

class ClothDAO {  //의류 담당
	// findClothList
}

class ClothDTO { } 

class HeadApiService { //본사 API서비스 접근 담당
	// API 서버 경로, 요청 변수 준비, 인증키 삽입, 요청 , json 포맷 텍스트 확보
	// json 포맷 -> 정리된 객체 형태 반환
	//             (DTO)
}