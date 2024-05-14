import java.io.File;
import java.io.FileInputStream;

public class Ex1205 {

	public static void main(String[] args) {
		File file = new File("gugudan.txt");
		
		try { 
			if(!file.exists())
				file.createNewFile();
			
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			
			while ((i=fis.read()) != -1) { // EOF까지 (End of File)
				System.out.print((char)i); // 정수가 문자로 변경 
			}
			
			fis.close();
			System.out.println("\n파일 읽기 성공");
		} catch(Exception e) {
			System.out.println(e); // e.getMessage(); 와 동일
		}
	}

}
