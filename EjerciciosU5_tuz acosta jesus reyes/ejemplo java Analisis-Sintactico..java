public class mensaje {
        
    public static void main(String[] args) {
    	double suma; int i; int cont = 0;	
    	
    	do
    		{
    			double numero1 = Math.random() * 10; double numero2 = Math.random() * 10;
    			suma = numero1 + numero2;
    			
    			System.out.println("la suma es: " + suma);
    				if(suma > 9)
    		{
    			System.out.println("El número alcanza la decena.");
    			System.out.println();
    		}else{ System.out.println("El número solo alcanza la unidad.");
    		System.out.println();}
    		
    			cont = cont + 1;	
    		}while (cont < 5);		    	
    }
}
