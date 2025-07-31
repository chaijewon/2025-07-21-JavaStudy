// while 사용 
import java.io.*;
public class 제어문_3 {

	public static void main(String[] args) 
	throws Exception
	{
		// TODO Auto-generated method stub
        FileReader fr=
        	new FileReader("C:\\Users\\sist\\git\\java-study\\Chapter04_제어문(반복문-for)_3\\src\\제어문_정리.java");
        int i=0;
        while((i=fr.read())!=-1) // char => int
        {
        	// -1 : EOF
        	System.out.print((char)i);
        }
	}

}
