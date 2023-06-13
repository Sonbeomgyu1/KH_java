package kh.lcalssIo1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileIo {
	public void testRamda() throws UserException {
		int[] arr = {2,3,4};
		int[] arr2 =new int[] {2,3,4};
		for( int i = 0; i <arr.length; i ++) {
			System.out.println(arr[i]);
		}
		if(arr.length > 2) {
			throw new UserException();
		}
	}
	public void testFileRead3() {
		String filepath = "D:/data2/test/aaa.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filepath));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null ) br.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void testFileRead2() {
		// 보조 스트림
		String filepath = "D:/data2/test/aaa.txt";
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			// 생성 순서 : 기반스트림 --> 보조스트림
			fis = new FileInputStream(filepath); // 기반
			isr = new InputStreamReader(fis);
			
			new BufferedReader(isr);
			// 보조
//			isr = new InputStreamReader(new FileInputStream(filepath));  
//			br = new BufferedReader(new InputStreamReader(new FileInputStream(filepath)));
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 해제 순서(생성반대순서) : 보조스트림 --> 기반스트림
				if(br !=null)br.close();
				if (fis !=null)fis.close(); // 보조 먼저 close 그다음 기반 close
				if (isr !=null)isr.close();

					fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	public void testFileRead() {
		String filepath = "D:/data2/test/aaa.txt";
		// fr cannot be resolved
		FileReader fr = null;
		try {
			try {
				fr = new FileReader(filepath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // (file과 java 프로그램의 resource 통로)
			try {
				// Unhandled exception type IOException
				// 사용불가 for(int i = 0; i < fr.)

				// 방법1
//				int a = -1;
//				while ((a = fr.read()) > -1) {	
//					System.out.println((char)a);
//				}

//				방법2,3
				int cntPerRead = 50;
				char[] readCharArr = new char[20];
				for (int i = 0; i < readCharArr.length / cntPerRead; i++) {

					int readCnt = fr.read(readCharArr, i * cntPerRead, cntPerRead);
					System.out.println(readCnt); // 50 : 문자 4개 읽었음.
					if (readCnt < cntPerRead) {
						break;
					}
				}
				System.out.println(readCharArr);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("파일을 찾을 수 없습니다. 경로를 확인해주세요.");
		} finally {
			// Unhandled exception type IOException
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println(" == testFileRead 끝 ==");
	}

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

			Fw = new FileWriter(f2); // file에 문자 형태 전송이 거눙헌 outputStream( file과 java 프로그램 통로)
			Fw.write("한글"); // 전송하고자 하는 문자
			Fw.flush(); // 전송한 문자가 담긴 버퍼(통로)를 꺠끗하게 밀어내기
			return; //
		} catch (IOException e) {
			System.out.println("file 생성을 못함");
			e.printStackTrace();

		} finally { // return 전에 반드시 실행하고 넘어가는 문구
			try {
				if (Fw != null)
					Fw.close(); // 통로를 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}