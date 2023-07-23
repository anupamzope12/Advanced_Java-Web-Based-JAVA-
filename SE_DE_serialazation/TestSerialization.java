package SE_DE_serialazation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws IOException {
	Student s1= new Student("Anupam","Zope",233235,"bhusawal");
//		String fileName="E:\\PG DAC MARCH 2023\\Study Material\\CORE JAVA BY MADHURA MAM\\TestSer.txt";
		String fileName="E:\\PG DAC MARCH 2023\\Study Material\\CORE JAVA BY MADHURA MAM\\Testserialization.txt";
	try {
			
			FileOutputStream fos=new FileOutputStream(fileName);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			
			oos.close();
			fos.close();
			
			System.out.println("Object saved in file.");
			
		}catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
