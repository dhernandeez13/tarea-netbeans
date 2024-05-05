package CalculaEstadisticas;

import java.util.Scanner;

public class Main {
	        /**Pide al usuario un tamaño n para el vector, seguidamente pide al usuario que rellene el vector, por ultimo muestra un menú con sus
     *opciones y muestra por pantalla el resultado de la operacion que haya escogido el usuario, si el usuario introduce una opción 
     *erronea el programa se lo dirá mostrando un mensaje de error
     * @param args
     */
     
    public static void main(String[] args) {
    	        
        System.out.println("Introduzca el tamaño de su secuencia de numeros");
    	Scanner sc=new Scanner(System.in);
        
    	int n=sc.nextInt();
    	double[] vec=new double[n];
    	for(int i=0; i<n; i++){
    	   System.out.println("Introduzca un numero");
    	   sc=new Scanner(System.in);
           vec[i]=sc.nextFloat();
    	}
    	
    	System.out.println("Introduzca una operacion para realizar");
    	System.out.println("--------------------------------------");
    	System.out.println("1 - Media");
    	System.out.println("2 - Moda");
    	System.out.println("3 - Varianza");
    	System.out.println("4 - Desviacion tipica");
    	System.out.println("5 - Salir");
    	
    	sc=new Scanner(System.in);
       	int eleccion=sc.nextInt();
    	
    	switch(eleccion){
    	   case 1 -> System.out.println("La media es: " + Estadistica.media(vec));
    	   case 2 -> System.out.println("La moda es: " + Estadistica.moda(vec));
    	   case 3 -> System.out.println("La varianza es: " + Estadistica.varianza(vec));
    	   case 4 -> System.out.println("La desviacion tipica es: " + Estadistica.desviacion_tipica(vec));
    	   case 5 -> System.out.println("Adios");
    	   default -> System.err.println("Error, opción desconocida"); 
    	}
    }
      
    
}