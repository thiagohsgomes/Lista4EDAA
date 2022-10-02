import java.util.Scanner;

public class MainParOuImpar {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        PilhaTroca pilha1 = new PilhaTroca(10);
        PilhaTroca pilha2 = new PilhaTroca(10);
        
    	for(int i=0; i < 10; i++) {
			System.out.print("Digite o número: ");
			int numero = entrada.nextInt();
			
			if(numero % 2 == 0)
				pilha1.push(numero);
			else
				pilha2.push(numero);
    	}
    	
    	System.out.println();
    	System.out.println("------DESEMPILHANDO------");
    	System.out.println();
    	System.out.println("PILHA PAR");
    	
    	int tamanhoPilha1 = pilha1.size();
    	int tamanhoPilha2 = pilha2.size();
    	
    	for(int i=0; i < tamanhoPilha1; i++) {
    		System.out.println("Removendo valor: " + pilha1.top());
    		pilha1.pop();
    	}
    	
    	System.out.println("");
    	
    	System.out.println("PILHA ÍMPAR");
    	
    	for(int i=0; i < tamanhoPilha2; i++) {
    		System.out.println("Removendo valor: " + pilha2.top());
    		pilha2.pop();
    	}

    	entrada.close();
    	
	}

}
