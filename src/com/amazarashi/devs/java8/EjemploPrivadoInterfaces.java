package com.amazarashi.devs.java8;

interface Bar
{
	void foo();
	//metodo demaciado grande
	default void foo(int x) 
	{
		System.out.println(x);
		foo2(x);
	}
	//Exponemos detalles de implementacion la cual deberia ser privadp
	default void foo2(int x) 
	{
		System.out.println(x);
	}
	
	static void foo3() 
	{
		
	}
	
}

public class EjemploPrivadoInterfaces {
	public static void main(String[] args) {
		
	}

}
