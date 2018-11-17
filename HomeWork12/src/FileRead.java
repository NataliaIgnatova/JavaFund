import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	public static void readFileTryCatchFinally(String str) throws IOException{
		
		//FileReader fileReader = new FileReader("C:\\Users\\TALI\\Desktop\\file.dat");
		FileReader fileReader = new FileReader(str);
		try{
			int data = fileReader.read();
			while(data!=-1){
				System.out.println((char) data);
				data= fileReader.read();
			}
		}catch(IOException ex){
			ex.getMessage();
		}finally{
			fileReader.close();
		}
	}
	
	public static void readFileTryWithResources(String str){
		try(FileReader fileReader = new FileReader(str)){
			int data = fileReader.read();
			while(data!=-1){
				System.out.println((char) data);
				data= fileReader.read();
			}
		}catch(IOException ex){
			ex.getMessage();
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readFileTryWithResources("C:\\Users\\TALI\\Desktop\\file.dat");
		readFileTryCatchFinally("C:\\Users\\TALI\\Desktop\\file.dat");
	}

}
