package examen.clases;

import examen.interfaces.Volumen;

public class MandoMinicadenas extends Mando implements Volumen{

	private int volumen = 0;
	
	public MandoMinicadenas(String modelo, double altura, double anchura, int volumen) {
		super(modelo, altura, anchura);
		if(volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}
	}

	public MandoMinicadenas(String modelo, double altura, double anchura, double precio, int volumen) {
		super(modelo, altura, anchura, precio);
		if(volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}
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
		
		String cad = "";
		
		cad += "MandoMinicadenas\n";
		cad += "Modelo: " + this.modelo + "\n";
		cad += "Anchura: " + this.anchura + "\n";
		cad += "Altura: " + this.altura + "\n";
		cad += "Precio: " + this.precio + "\n";
		cad += "Volúmen: " + this.volumen + "\n";
		cad += encendido ? "ON\n" : "OFF\n";
		cad += "---------------------------------------------";
		
		return cad;
	}
}
