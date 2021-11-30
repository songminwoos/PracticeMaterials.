package p04.type_max_min_value;

// integer variable을 byte variable로 강제 형변환(casting)
// 강제형변환(casting)할 때 프로그래밍 팁
// 1. casting이 가능한지, MIN_VALUE와 MAX_VALUE를 check하는 프로그램 로직을 코딩할 것
public class ByteTypeMinMaxCheckEx {

	public static void main(String[] args) {
		int num = 128;
		
		if ( (num < Byte.MIN_VALUE) || (num > Byte.MAX_VALUE) ) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		} else {
			byte bNum = (byte) num;
			System.out.println("bNum = " + bNum);
		}

	}

}
