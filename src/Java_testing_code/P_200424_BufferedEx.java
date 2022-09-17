package Java_testing_code;

import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.io.BufferedReader;


public class P_200424_BufferedEx {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("ReadFile.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("Output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String str;
		Date d = new Date();
		
		long startTime = d.getTime();
		
		while((str = br.readLine()) != null) { //String str = BufferedReader(new FileReader("ReadFile.txt");
			bw.write(str);
			bw.newLine();
		}
		d = new Date();
		long endTime = d.getTime();
		bw.write("복사 시간 : "+(endTime-startTime));
		bw.flush();
		
		br.close();
		bw.close();
	}
}
