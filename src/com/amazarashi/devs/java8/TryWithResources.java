package com.amazarashi.devs.java8;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
	public static void main(String[] args) {
		
		
		try(InputStreamReader isr = new InputStreamReader(System.in);) {
			
		} catch (IOException e) {
			//sin acceso
//			System.out.println(isr.toString());
		}
		
		
	}

}
