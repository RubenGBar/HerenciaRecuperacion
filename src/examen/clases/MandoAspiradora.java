package examen.clases;

import examen.interfaces.Velocidad;

public class MandoAspiradora extends Mando implements Velocidad{

	private int velocidad = 0;
	
	public MandoAspiradora(String modelo, double altura, double anchura, double precio) {
		super(modelo, altura, anchura, precio);
	}

	public MandoAspiradora(String modelo, double altura, double anchura) {
		super(modelo, altura, anchura);
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	@Override
	public boolean subirVelocidad() {
		
		boolean posible = true;
		
		this.velocidad++;
		if(this.velocidad >= 3) {
			
			this.velocidad = 3;
			posible = false;
			
		}
		
		return posible;
	}

	@Override
	public boolean bajarVelocidad() {
		
		boolean posible = true;
		
		this.velocidad--;
		if(this.velocidad <= 0) {
			
			this.velocidad = 0;
			posible = false;
			
		}
		
		return posible;
	}

	@Override
	public String toString() {
		
		String cad = "";
		
		cad += "MandoAspiradora\n";
		cad += "Modelo: " + this.modelo + "\n";
		cad += "Anchura: " + this.anchura + "\n";
		cad += "Altura: " + this.altura + "\n";
		cad += "Precio: " + this.precio + "\n";
		cad += "Velocidad: " + this.velocidad + "\n";
		cad += encendido ? "ON\n" : "OFF\n";
		cad += "---------------------------------------------";
		
		return cad;
	}
	
}
