package kh.lcalssIo1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileIo {

	public void testFile() throws IOException {
//		File f1 = new File("D:/data1/aaa.txt");
//		f1.mkdir();
		String path = "D:/data2/test";
		String filename = "aaa.txt";
		new File(path).mkdirs(); // 디렉토리 생성

		File f2 = new File(path, filename);

		FileWriter Fw = null;
		try {
			f2.createNewFile();// 파일생성

			Fw = new FileWriter(f2);
			Fw.write("abcdefgsssss");
			Fw.flush();
			return;
		} catch (IOException e) {
			System.out.println("file 생성을 못함");
			e.printStackTrace();

		} finally {
			try {
				if (Fw != null) Fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}