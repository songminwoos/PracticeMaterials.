package p04.catchorder;

// Runtime Exception multi catch 처리 방법
// catch 순서가 매우 중요함
// 1. catch에서 최상위 부모 class인 Exception class가 맨 처음에 나오면 뒤에 오는 catch문의 exception block은 실행이 안됨
//    이유 : 자식 Exception class는 Exception class의 자식이므로 자동형변환이 발생되어 
//          Exception안의 block( {...} )만 실행됨
// 2. 최상위 부모 class인 Exception은 multi-catch block의 맨 마지막에 넣는 것이 표준
//    의미 : 앞 부분에 나타난 Exception class의 자식인 Exception들을 처리하고, 나머지 자식 exception들이 발생하면 여기서 처리
public class CatchOrderEx {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
			int val1 = Integer.parseInt(data1);	// data1 = "10"
			int val2 = Integer.parseInt(data2); // data2 = "20"
			int result = val1 + val2;
			System.out.println(data1 + " + " + data2 + " = " + result);
			Class cls = Class.forName("java.lang.String2");
		} 
		// 
//		catch (Exception e) {	
//			
//		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("Eclipse Run-Run Configuration 메뉴에 들어가서 num1 num2 입력하세요.");
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("compile time관련 exception 에러처리");
		} 
		catch (Exception e) {	
			System.out.println("위의 catch에서 나온 Exception종류외의 나머지 exception이 발생하면 여기서 처리함");
		} 
		finally {
			System.out.println("숫자 덧셈 처리가 종료되었습니다.");
		}

	}

}









