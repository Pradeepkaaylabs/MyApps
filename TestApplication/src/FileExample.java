import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "C:\\Users\\pradeep\\Desktop\\MySourceFolder";
		String destination="C:\\Users\\pradeep\\Desktop\\MyDestinationFolder";
		FileInputStream fin;
		FileOutputStream fout;
		BufferedInputStream bin;
		BufferedOutputStream bout;
		File folder = new File(source);
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		    if (listOfFiles[i].isFile()) {
		         if(listOfFiles[i].getName().contains(".mp3"))
		         {
		        	 //System.out.println(listOfFiles[i].getName());
		        	 try
		        	 {
		        		 fin=new FileInputStream(source+"\\"+listOfFiles[i].getName());  
		        		 fout=new FileOutputStream(destination+"\\"+listOfFiles[i].getName()); 
		        		 bin=new BufferedInputStream(fin);  
		        		 bout=new BufferedOutputStream(fout); 
		        		 int j=0;  
		        		 while((j=bin.read())!=-1){  
		        		 bout.write((byte)j);  
		        		 }  
		        		 bin.close();
		        		 fin.close();
		        		 bout.flush();
		        		 bout.close();
		        		 fout.close();
		        	 }
		        	 catch(Exception e)
		        	 {
		        		e.printStackTrace(); 
		        	 }
		         }
		      }
		    System.out.println("File wirtten sucessfully");
		   
		    }
	}

}
