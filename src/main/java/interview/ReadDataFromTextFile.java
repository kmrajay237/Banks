package interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		/*FileReader fr=new FileReader("");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();*/
		
		File file=new File("filepath");
		Scanner sc=new Scanner(file);
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
	}

}
