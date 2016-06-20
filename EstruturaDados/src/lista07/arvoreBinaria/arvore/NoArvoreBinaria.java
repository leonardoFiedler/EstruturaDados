package lista07.arvoreBinaria.arvore;

public class NoArvoreBinaria <T>
{
	private T info;
	private NoArvoreBinaria<T> esquerda;
	private NoArvoreBinaria<T> direita;
	
	public NoArvoreBinaria(T info)
	{
		this.info = info;
	}
	
	public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir)
	{
		this.info = info;
		this.esquerda = esq;
		this.direita = dir;
	}
	
	public T getInfo()
	{
		return this.info;
	}
	
	public NoArvoreBinaria<T> getEsquerda()
	{
		return this.esquerda;
	}
	
	public NoArvoreBinaria<T> getDireita()
	{
		return this.direita;
	}
	
}
