package CalculaEstadisticas;


public class Estadistica {
	
	public static double media(double[] v){
	   double res=0;
	   for(int i=0; i<v.length; i++){
	   	res+=v[i];
	   }
	   
	   return res/v.length;
	}
	
	public static double moda(double[] v){
		int cont=0;
		double numero=0;
		for(int i=0; i<v.length; i++){
		   int aux=0;	
		   for(int j=0; j<v.length; j++){
		      if(v[i]==v[j]) aux++;
		   }
		   if(aux>=cont){
		   	cont=aux;
		   	numero=v[i];
		   } 
		 }
		return numero;
	}

        
	public static double desviacion_tipica(double[] v){
		double res=Math.sqrt(varianza(v));
		return res;
	}

        
	public static double varianza(double[] v){
	   double m=media(v);
	   double sum=0;
	   for(int i=0; i<v.length; i++){
	      sum+=Math.pow(v[i],2.0);
	   }
	   
	   return sum/v.length-Math.pow(m,2.0);	
	}
     
    
}