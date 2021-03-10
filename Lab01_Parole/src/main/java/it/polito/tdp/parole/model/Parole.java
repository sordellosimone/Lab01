package it.polito.tdp.parole.model;


import java.util.*;

public class Parole {
	
	TreeMap<String,String> listaparole;
	
	public Parole() {
		listaparole= new TreeMap<String,String>();
	}
	
	public void addParola(String p) {
    
		listaparole.put(p, p);

	}
	
	public List<String> getElenco() {
		List<String> lista ;
		lista= new LinkedList(listaparole.values());
		
		return lista ;
	}
	
	public void reset() {
		
			
			listaparole.clear();
		
			
	}

}
