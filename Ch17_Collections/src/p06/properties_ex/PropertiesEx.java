package p06.properties_ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// Properties class : Map에 속한 class (key, value)
// 1. 파일 extension이 properties인 별도 파일로 관리됨
// 2. 파일내에 key=value의 형태로 저장이 되고 있음
//   - 예로, driver=oracle.jdbc.OracleDriver 에서, key는 driver, value는 oracle.jdbc.OracleDriver
// 3. 용도 : 프로그램 외부에서 프로그램 내부에 필요한 환경설정 정보를 관리하는 목적
//   - 예를 들면, database.properties 실습용 파일에 Oracle DBMS에 환경정보를 넣고 있는데, 
//     MySQL 등 다른 DBMS에 대한 환경정보로 변경할 수 있음
//   - 실제 Web 프로그램에서는 DBMS가 Oracle에서 MYSQL로 변경되더라도 소스코드를 수정할 필요 없음
public class PropertiesEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));

		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String userName = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("userNmae : " + userName);
		System.out.println("password : " + password);

	}

}
