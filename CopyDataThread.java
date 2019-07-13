package lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread{

	
	@Override
	public void run() {
		try {
			FileReader fr=new FileReader("C:\\Users\\divyshet\\Desktop\\Assignment\\src\\source.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("C:\\Users\\divyshet\\Desktop\\Assignment\\src\\target.txt");
			int s;
			int count=0;
			while((s=br.read()) !=-1) {
				if(count==10) {
					System.out.println("Ten characters copied");
					
					count=0;
					sleep(5000);
				}
				char c=(char) s;
				fw.write(c);
				count++;
			}
			fw.flush();
			fw.close();
			fw.close();
			System.out.println("File copied");
			}
		catch(IOException ie) {
			ie.printStackTrace();
			
		}
		catch(InterruptedException it) {
			it.printStackTrace();
		}
		
	}

	

}
