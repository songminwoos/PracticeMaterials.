package p03.generic_method2;

public class Util {

	// p1, p2에 대하여 key값과 value값이 둘 다 같은 경우에만 true로 return하고, 하나라도 틀리면 false return
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		return keyCompare && valueCompare;
	}
}
