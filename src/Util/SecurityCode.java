package Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Random;

public class SecurityCode {

	public static String sendGet(String aim,String text) throws IOException{

    		
    	String num = makeNum();
    	System.out.println(num);
		return num; 
    }

	private static String makeNum() {
	
	    Random r = new Random();
	    String num = r.nextInt(9999) + "";
	    StringBuffer sb = new StringBuffer();
	    for (int i=0;i<4-num.length();i++){
	        sb.append("0");        //不够四位的用“0”补充
	    }
	
	    num = sb.toString()+num;    //字符串合并
	
	    return num;
	}
	
}