package Java_testing_code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class P_200424_Buffered {
	public static void main(String[] args)  throws IOException{
		//BufferedReader, BufferedWriter
		/*
		 * BufferedReader : Enter만 경계로 인식. String타입으로 데이터를 입력받음
		 * 형식 : BerfferdReader bf = new BufferedReader(new InputStreamReader(System.in);
		 * 		 String a = bf.readLine(); //데이터타입 변환이 필요없이 쓰일때
		 * 		 int i = Integer.parseInt(bf.readLine()); //int형으로 쓰고자할때
		 * cf. readLine()을 이용해 입력하되, 이 메소드는 String타입으로 리턴. 예외처리 필요(try-catch 혹은 throws)
		 * 		+read된 데이터는 Line 단위로만 나눠지므로 공백단위로 데이터를 가공하기 위해선 StringTokenizer.nextToken()
		 * 		혹은 String.split()을 사용.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 자료형의 변환 없이 사용
		
		
		/*
		 * StringTokenizer(String, delimeter) 혹은 (String)
		 *  --> 문자열을 첫번째 인수로 받아서, 두번째 인수로 받은 구분자로 문자열을 여러개의 토큰으로 나눔
		 * StringTokenizer의 대표적인 메소드
		 * 1)hasNextToken() : is there any token?
		 * 2)nextToken() : return token, and that token would be deleted
		 */
		int i = Integer.parseInt(br.readLine()); // String -> int로의 자료형 변환
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		/*
		 * BufferedWriter : 많은 양에서 효율이 좋으며 버퍼를 잡아두기 때문에 끝난 뒤 반드시 flush()와 close()를 통해 뒤처리 필요
		 * cf. flush() : 저장된 스트림을 비우다.(저장되있는 데이터를 내보내다. 출력하다.) close() : 스트림을 닫다.
		 * obj.write()에는 println와 같은 자동개행기능이 없기 때문에 개행이 필요할 경우 \n를 통해 처리
		 */
				
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Hello World!!\n");
		bw.flush();
		bw.close();
	}
}
