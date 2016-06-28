package co.edu.usbcali.scm;

public class NumerosPrimosImpl implements NumerosPrimos {

	public boolean primo(int numero) {
		
		boolean p = false;
		
		if(numero < 4){
			p = true;
		}else{
			if(numero %2 == 0)
				p= false;
			else{
				int contador = 0;
				int i =1;
				int limite = (numero-1)/2;
				if(limite %2 == 0)
					limite--;
				
				while (i<= limite) {
					
					if (numero % i == 0) contador++;
                    	i += 2;
                    if (contador == 2) i = limite + 1;
					
				}
				
				if (contador == 1) 
					p = true;           	
			}
		}
		
		return p;
	}

	public int contarDig(int numeroEnt) {
		
		int divisionEntera = numeroEnt;
		 
        int contador=0;

        while (divisionEntera != 0)
    {
        divisionEntera = divisionEntera / 10;
        contador++;
    }
		return contador;
	}

	public void getDevuelveNumerosPrimos(int numDigitos) {
		int ndigitos=0;
		 for(int i = 1; i <= 99999; i++ )
	        {
	            ndigitos=contarDig(i);
	            if(ndigitos==numDigitos)
	                if (primo(i) == true) 
	                    System.out.println(i);    
	        }
           

	}


}
