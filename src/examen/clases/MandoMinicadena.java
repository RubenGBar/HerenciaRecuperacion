package examen.clases;

import examen.interfaces.Volumen;

public class MandoMinicadena extends Mando implements Volumen{

	private int volumen = 0;
	
	public MandoMinicadena(String modelo, double altura, double anchura) {
		super(modelo, altura, anchura);
	}

	public MandoMinicadena(String modelo, double altura, double anchura, double precio) {
		super(modelo, altura, anchura, precio);
	}
	
	public int getVolumen() {
		return volumen;
	}

	@Override
	public boolean subirVolumen() {
		
		boolean posible = true;
		
		this.volumen += 10;
		
		if(this.volumen >= 100) {
			
			this.volumen = 100;
			posible = false;
			
		}
		
		return posible;
	}

	@Override
	public boolean bajarVolumen() {
		
		boolean posible = true;
		
		this.volumen += 10;
		
		if(this.volumen <= 0) {
			
			this.volumen = 0;
			posible = false;
			
		}
		
		return posible;
	}

	@Override
	public String toString() {
		
		String cad = "\n";
		
		cad += "MandoMinicadenas\n";
		cad += "Modelo: " + this.modelo + "\n";
		cad += "Anchura: " + this.anchura + "\n";
		cad += "Altura: " + this.altura + "\n";
		cad += "Precio: " + this.precio + "\n";
		cad += "Vol�men: " + this.volumen + "\n";
		cad += encendido ? "ON\n" : "OFF\n";
		cad += "---------------------------------------------\n";
		
		return cad;
	}
}
