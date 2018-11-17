import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fileReader = null;
		try{
			fileReader = new FileReader("c:\\Users\\TALI\\Desktop\\file.txt");
			int data;
			while((data=fileReader.read())!= -1){
				System.out.print((char) data);
			}
			System.out.println();
		}catch(IOException e){
			Logger.getLogger(Task1.class.getName()).log(Level.SEVERE,"Exception while reading file",e);
		}finally{
			if(fileReader!=null){
				try{
					fileReader.close();
				}catch(IOException ex){
					Logger.getLogger(Task1.class.getName()).log(Level.SEVERE,"Exception while closing file",ex);
				}
			}
		}

	}

}
