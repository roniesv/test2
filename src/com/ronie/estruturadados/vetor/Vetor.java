package com.ronie.estruturadados.vetor;

public class Vetor {
	
	private String[] elementos;
	int tamanho;
	
	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	
	/* public void adiciona(String elemento) { 
			for(int i = 0; i<this.elementos.length; i++) {
			   if(elementos[i]==null)
			   elementos[i] = elemento;
			   break; 
			}
	}*/	
	
	/*public void adiciona(String elemento) throws Exception {
		 if(this.tamanho <this.elementos.length) {
			 this.elementos[this.tamanho] = elemento;
			 this.tamanho++;
		 }else {
			throw new Exception("Vetor j? est? cheio, n?o ? poss?vel adicionar mais elementos"); 
		 } 
		 
	 }*/
	 
	 public boolean adiciona(String elemento)
	 {
		 if(this.tamanho <this.elementos.length) 
		 {
			 this.elementos[this.tamanho] = elemento;
			 this.tamanho++;
			 return true;	 
		 }
		 return false;
	}
}
