package it.polito.tdp.parole.model;


import java.util.*;

public class Parole {
	
	TreeMap<String,String> listaparole;
	LinkedList<String> listap= new LinkedList<String>();
	public Parole() {
		listaparole= new TreeMap<String,String>();
	}
	
	public void addParola(String p) {
    
		listaparole.put(p, p);
		listap.add(p);

	}
	
	public List<String> getElenco() {
		List<String> lista ;
		lista= new LinkedList(listaparole.values());
		
		return lista ;
	}
	
	public void reset() {
		
			
			listaparole.clear();
		
			
	}
	
	public void cancella() {
		String pp= listap.getLast();
			listaparole.remove(pp);
		}
		
		
	
		


}
