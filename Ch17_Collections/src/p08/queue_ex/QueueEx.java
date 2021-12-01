package p08.queue_ex;

import java.util.LinkedList;
import java.util.Queue;

// Queue는 Interface, LinkedList는 Queue를 implement한 Queue의 자식클래스라고 생각해도 됨
// 1. offer method : queue에 원소 추가
// 2. poll method : queue에서 원소 뺴내는 것
//    => 원소를 꺼집어낼 떄 FIFO(First In First Out)방식으로 처리
public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendkakaotalk", "홍두께"));

//		while (!messageQueue.isEmpty()) {
//			Message message = messageQueue.poll();
//			switch (message.command) {
//			case "sendMail":
//				System.out.println(message.to + "님에게 메일을 보냅니다");
//				break;
//			case "sendSMS":
//				System.out.println(message.to + "님에게 SMS을 보냅니다");
//				break;
//			case "sendkakaotalk":
//				System.out.println(message.to + "님에게 카카오톡을 보냅니다");
//				break;
//			}
//		}

		System.out.println();

		// 항상된 for문 사용
		for (Message message : messageQueue) {
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다");
				break;
			case "sendkakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다");
				break;
			}
		}
	}

}
