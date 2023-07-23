
package SE_DE_serialazation;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//public class TestDesr {
//	public static void main(String[] args) throws ClassNotFoundException {
//		Student s2=new Student("Anupam","Zope",233235,"Bhusawal");
//		String fileName="E:\\PG DAC MARCH 2023\\Study Material\\CORE JAVA BY MADHURA MAM\\TestSer1.txt";
//		try {
//			
//			FileInputStream fis=new FileInputStream(fileName);
//			ObjectInputStream ois=new ObjectInputStream(fis);
//			ois.readObject();
//			
//			System.out.println(s2.getFirst_Name());
//			System.out.println(s2.getLast_Name());
//			System.out.println(s2.getRollNo());
//			System.out.println(s2.getCity());
//
//			ois.close();
//			fis.close();
//			
//		}catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//}

 import java.io.*;
    class serialization
    {
        public static void main(String[] args)
        {
            try
            {
            TestDesr object1 = new TestDesr("Hello", -7, 2.1e10);
	        FileOutputStream fos = new FileOutputStream("serial");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(object1);
	        oos.flush();
	        oos.close();
	    }
	    catch(Exception e)
            {
	        System.out.println("Serialization" + e);
                System.exit(0);
            }
	    try
            {
	        int x;
	        FileInputStream fis = new FileInputStream("serial");
	        ObjectInputStream ois = new ObjectInputStream(fis);
	        x = ois.readInt();
	        ois.close();
	        System.out.println(x);		    	
	    }
	    catch (Exception e)
            {
                System.out.print("deserialization");
	        System.exit(0);
	    }
        }
    }
    class TestDesr implements Serializable
    {
	String s;
	int i;
	double d;
	TestDesr(String s, int i, double d)
        {
	    this.d = d;
	    this.i = i;
	    this.s = s;
	}
    }