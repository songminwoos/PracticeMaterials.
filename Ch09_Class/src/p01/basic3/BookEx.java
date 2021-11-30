package p01.basic3;

// 일반적으로 class 사용할 때 class의 field 이름을 않함. (사용하는데 꼭 필요한 field만 알고 있으면 됨)
public class BookEx {

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		Book chunHyang = new Book("춘향전");
		
		littlePrince.printBookInformation();
		littlePrince.printBookInformation();
		littlePrince.printBookInformation();
		littlePrince.printBookInformation();
		littlePrince.printBookInformation();
		littlePrince.printBookInformation();
		littlePrince.printBookInformation();
		chunHyang.printBookInformation();
		
		littlePrince.title = "2021년어린왕자";
		littlePrince.printBookInformation();
	}

}
