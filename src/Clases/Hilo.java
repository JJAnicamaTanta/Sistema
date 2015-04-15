package Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hilo extends Thread{
	public static void main(String[] args) {
		Hilo b = new Hilo();
		b.start();
	}
	
	
	
	public void run() {
		Date a;
	SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
			while(true){
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
		
				a   = new Date();
				System.out.println(df.format(a));
				
			
			
			
		}
	}

}
