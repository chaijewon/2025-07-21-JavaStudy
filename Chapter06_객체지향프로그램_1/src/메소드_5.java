// 암호화 => encoding => decoding
// 시저스암호화 => 3칸 이동 ABC => DEF => ed4559 rsa 
/*
 *   https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyDggAEEUYORhDGIAEGIoFMgYIARBFGDsyBggCEEUYOzIGCAMQRRg7MgcIBBAAGIAEMg0IBRAAGIMBGLEDGIAEMgoIBhAAGLEDGIAEMg0IBxAAGIMBGLEDGIAEMgoICBAAGLEDGIAEMgwICRAAGEMYgAQYigXSAQkzMjE4ajBqMTWoAgCwAgA&sourceid=chrome&ie=UTF-8
 */
// %EC%9E%90%EB%B0%94
import java.net.*;
public class 메소드_5 {
    static String encoder(String s) throws Exception
    {
    	return URLEncoder.encode(s, "UTF-8");
    }
    static String decoder(String s) throws Exception
    {
    	return URLDecoder.decode(s, "UTF-8");
    }
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//        String s="자바";
//        String en=URLEncoder.encode(s, "UTF-8");
//        System.out.println(en);
//        String ko=URLEncoder.encode(s, "UTF-8");
//        System.out.println(ko);
		
	}

}
