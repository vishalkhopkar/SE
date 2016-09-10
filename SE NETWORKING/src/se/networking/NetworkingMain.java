package se.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NetworkingMain {
	static String[] adapterNames={"A","B","C"};
	static int ping(String ip,int noOfPackets){
		return 0;
	}
	static Adapter[] returnAdapters(){
		return null;
	}
	static String returnIP(String osname,Adapter a) throws IOException{
		Process p=Runtime.getRuntime().exec("ipconfig");
		BufferedReader t=new BufferedReader(new InputStreamReader(p.getInputStream()));
		String output=t.readLine();
		
		while(output!=null){
			if(output.contains("IPv4 Address")){
				
				return (output.substring(39));
				
			}
			else output=t.readLine();
		}
		return "127.0.0.1";
		
	}
}
