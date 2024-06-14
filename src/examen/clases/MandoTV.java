package examen.clases;

import examen.interfaces.Volumen;

public class MandoTV extends Mando implements Volumen{

	private int volumen = 0;
	private int canal = 1;
	
	public MandoTV(String modelo, double altura, double anchura) {
		super(modelo, altura, anchura);
	}

	public MandoTV(String modelo, double altura, double anchura, double precio) {
		super(modelo, altura, anchura, precio);
	}
	
	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}
	
	public void subirCanal() {
		this.canal++;
	}

	public void bajarCanal() {
		this.canal--;
		if(canal <= 1) {
			
			this.canal = 1;
			
		}
	}
	
	@Override
	public boolean subirVolumen() {
		
		boolean posible = true;
		
		this.volumen += 5;
		
		if(volumen >= 100) {
			
			this.volumen = 100;
			posible = false;
			
		}
		
		return posible;
	}

	@Override
	public boolean bajarVolumen() {
		
		boolean posible = true;
		
		this.volumen -= 5;
		
		if(volumen <= 0) {
			
			this.volumen = 0;
			posible = false;
			
		}
		
		return posible;
	}

	@Override
	public String toString() {
		
		String cad = "\n";
		
		cad += "MandoTV\n";
		cad += "Modelo: " + this.modelo + "\n";
		cad += "Anchura: " + this.anchura + "\n";
		cad += "Altura: " + this.altura + "\n";
		cad += "Precio: " + this.precio + "\n";
		cad += "Volumen: " + this.volumen + "\n";
		cad += "Canal: " + this.canal + "\n";
		cad += encendido ? "ON\n" : "OFF\n";
		cad += "---------------------------------------------\n";
		
		return cad;
	}
	
}
