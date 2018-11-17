import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream input = null;
		InputStream nInput = null;
		OutputStream os = null;
		try{
			input = new FileInputStream("c:\\Users\\TALI\\Desktop\\file.txt");
			nInput = new FileInputStream("c:\\Users\\TALI\\Desktop\\file2.txt");
			os = new FileOutputStream("c:\\Users\\TALI\\Desktop\\output.txt");
			int data;
			int nData;
			while((data=input.read())!=-1){
				os.write(data);	
			}
			while((nData= nInput.read())!=-1){
				os.write(nData);
			}
		}catch(IOException e){
			Logger.getLogger(Task1.class.getName()).log(Level.SEVERE,"Exception while reading file",e);
		}finally{
			if(input!=null){
				try{
					input.close();
				}catch(IOException ex){
					Logger.getLogger(Task2.class.getName()).log(Level.SEVERE,"Exception while closing file",ex);
				}
			}
			if(nInput != null){
				try{
					nInput.close();
				}catch(IOException exc){
					Logger.getLogger(Task2.class.getName()).log(Level.SEVERE,"Exception while closing file2",exc);
				}
			}
			if(os!=null){
				try{
					os.close();
				}catch(IOException ex){
					Logger.getLogger(Task2.class.getName()).log(Level.SEVERE,"Exception while closing output file",ex);
				}
			}
		}
	}

}
