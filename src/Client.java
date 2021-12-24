import java.util.*;
import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("채팅 클라이언트 실행합니다.");
		System.out.println("사용하실 닉네임을 입력해주세요 > ");
		String nickName = scn.nextLine();

		System.out.println("서버에 접속을 시도 합니다....");

		Socket socket = new Socket("127.0.0.1", 8977); // 접속... localhost = 자신 컴퓨터 IP

		System.out.println("서버에 접속에 성공 했습니다.");

		DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); // 출력 관련 API

		// 닉네임 전달...
		dos.writeInt(1); // command(int) = 1 닉네임 전달 , 2 메세지 전달 , 3 접속종료 전달
		dos.writeUTF(nickName);

		// 응답 쓰레드 생성 및 실행
		RecvDataThread rdt = new RecvDataThread(socket);
		rdt.start();

		// 챗 입력...
		while (true) {
			System.out.println("메세지 입력 (q=종료) > ");
			String message = scn.nextLine();

			if (message.equals("q")) {
				// 접속 종료 전달...
				dos.writeInt(3);
				break;
			}

			dos.writeInt(2);
			dos.writeUTF(message);

		}

		socket.close();
		scn.close();

		System.out.println("챗 프로그램 종료. 이용해주셔서 감사합니다.");
	}

}

class RecvDataThread extends Thread {

	private Socket socket;

	public RecvDataThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {

		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());

			while (true) {
				String message = dis.readUTF();
				System.out.println(message);
			}

		} catch (Exception e) {
			// ....
			System.out.println("리시브 쓰레드 익셉션 발생... 쓰레드 정상 종료...");
		}
	}

}