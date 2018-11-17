import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader fileReader = null;
		BufferedWriter fileWriter = null;
		
		Map<String,Integer> words = new HashMap<>();
		try{
			fileReader = new BufferedReader(new FileReader("c:\\Users\\TALI\\Desktop\\input.txt"));
			fileWriter = new BufferedWriter(new FileWriter("c:\\Users\\TALI\\Desktop\\out1.txt"));
			String data = fileReader.readLine() ;
			while(data!=null){
				if(words.containsKey(data)){
					int value = words.get(data)+1;
					words.put(data,value);
				}else{
					words.put(data,1);
				}
				data = fileReader.readLine() ;
			}
			System.out.println("....");
			for(String key:words.keySet()){
				int value = words.get(key);
				fileWriter.write(key);
				fileWriter.write("-");
				fileWriter.write((int) value);
				System.out.println(key+"-"+value);
			}
			
		}catch(IOException e){
			Logger.getLogger(Task3.class.getName()).log(Level.SEVERE,"Exception while closing file",e);
		}finally{
			if(fileReader!=null){
				try{
					fileReader.close();
				}catch(IOException ex){
					Logger.getLogger(Task3.class.getName()).log(Level.SEVERE,"Exception while closing file",ex);
				}
			}
			if(fileWriter != null){
				try{
					fileWriter.close();
				}catch(IOException ex){
					Logger.getLogger(Task3.class.getName()).log(Level.SEVERE,"Exception while closing file",ex);
				}
			}
		}
	}

}
