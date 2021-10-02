package p2021_07_08;

// File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나
// 디렉토리 체제를 관리하는 클래스임.
import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		try {
			// File 객체 생성
			// c:/java01/temp 폴더가 생성되고, 현 위치 하위에
			// test폴더가 생성됨
			File temp = new File("C:/java01", "temp"); // 절대 경로 ///디렉토리 생성
			File tempFile = new File("test"); // 상대 경로

			// 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를
			// 반환함)
			System.out.println("create directory state : " + temp.mkdirs());
			System.out.println("create directory state : " + tempFile.mkdirs());

//	1.디렉토리 삭제	파일이 없을때
			tempFile.delete(); // test 디렉토리 삭제

//	2.비어있지 않는 디렉토리 삭제
//	    2-1. 안에 있는 파일 삭제
//	    2-2. test 디렉토리 삭제

//	 3. 자식 디렉토리 삭제
			temp.delete(); // temp 디렉토리 삭제

//	 4. 부모디렉토리 삭제		
			temp.getParentFile().delete(); // C:/java01 디렉토리삭제

			// File 클래스에서 제공하는 메소드로 파일 시스템에 대한
			// 여러가지 정보를 얻을수 있음

			System.out.println("temp canRead : " + temp.canRead()); // true
			System.out.println("temp canWrite : " + temp.canWrite()); // true
			System.out.println("temp getAbsoluteFile : " + temp.getAbsoluteFile());
			System.out.println("temp getName : " + temp.getName());
			System.out.println("temp getParent : " + temp.getParent()); // 보모 클래스 영역
			System.out.println("temp getPath : " + temp.getPath());
			System.out.println("temp isDirectory : " + temp.isDirectory()); // 디렉토리 인지 아닌지 판별 // true
			System.out.println("temp isFile : " + temp.isFile()); // 파일 여부 확인 있으면 true 없으면 false
		} catch (Exception e) {
		}
	}
}
