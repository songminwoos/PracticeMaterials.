package p09.practice2;
/*
 모든 class의 최상위 부모(조상) class는 Object임
 Object[] obj = {new Tiger(), new Chicken(), new Orange(), new Apple()};
  => Tiger, Chicken, Apple class를 부모인 Object class로 자동 형변환(promotion)
 if(obj[i] instanceof Edible)
  => Object class의 인스턴스를 Edible로 강제형변환(casting) 
 */
public class TestEdible {

	public static void main(String[] args) {
		// promotion Tiger, Chicken, Apple class를 부모인 Object class로 자동 형변환(promotion)
		Object[] obj = {new Tiger(), new Chicken(), new Orange(), new Apple()};

		for (int i = 0; i < obj.length; i++) {
			//
			if(obj[i] instanceof Edible) {
				Edible e = (Edible) obj[i];
				System.out.println( e.howToEat() );
				// 위의 2개와 같음
				//System.out.println( ((Edible) obj[i]).howToEat() );
			}
			if(obj[i] instanceof Animal ) {
				Animal a = (Animal) obj[i];
				System.out.println(a.sound());
			}
		}

	}

}
