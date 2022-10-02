
public class PilhaTroca {
	private	int	topo;
	private	int	tamanho;
	private	int[] itens;
	
	public	PilhaTroca(int n)	{
		itens =	new	int[n];
		tamanho = n;  
		topo = 0;
	}
	
	public void push(int numero){
		if(full()) {
			tamanho = tamanho * 2;
			int[] novoVetor = new int[tamanho];
			System.arraycopy(itens, 0, novoVetor, 0, itens.length);
			itens = novoVetor;
		}
			
		itens[topo]	= numero;  
		topo++;
	}
	
	public int top(){
		return itens[topo-1];
	}
	
	public void pop(){
		if(!empty())
			topo--;
	}
	
	public int size(){  
		return	topo;
	}
	
	public boolean empty(){  
		return (topo == 0);
	}
	
	public boolean full() {
		return	(topo == tamanho);
	}
	
	public void changeTopWithBase() {
		int itemTopo = itens[topo-1];
		int primeiroItem = itens[0];
	
		itens[topo-1] = primeiroItem;
		itens[0] = itemTopo;
	}


}
