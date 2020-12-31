package interview;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("filepath");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Selenium With Java");
		bw.write("Selenium With Python");
		bw.write("Selenium With C#");
		System.out.println("Finished!!");
		bw.close();
	}

}
