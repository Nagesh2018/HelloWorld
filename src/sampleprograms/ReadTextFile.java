package sampleprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		readFileusingScanner();
		readFileBufferReader();
	}

	private static void readFileBufferReader() throws IOException {
		FileReader fr = new FileReader("D:\\JavaWS\\TxtFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str = br.readLine())!=null) {
			System.out.println(str);
		}
		br.close();
	}

	private static void readFileusingScanner() throws FileNotFoundException {
		File fi = new File("D:\\JavaWS\\TxtFile.txt");
		Scanner sc = new Scanner(fi);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
