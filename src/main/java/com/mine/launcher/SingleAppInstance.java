package com.mine.launcher;

import java.net.ServerSocket;

public class SingleAppInstance {
	private static int PORT = 1234;
	
	public static void main(String[] args) { 
	      try { 
             new ServerSocket(PORT); 
	         System.out.println("BEGIN : Instance du programme unique"); 
	         Thread.sleep(30000);
	         System.out.println("END : Instance du programme unique");
	      }catch(Exception e){ 
	         System.out.println("Il y a deja une instance du programme active"); 
	         System.exit(0);
	      } 
	} 
}
