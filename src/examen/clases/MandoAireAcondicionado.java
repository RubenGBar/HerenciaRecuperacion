package examen.clases;

import examen.interfaces.Velocidad;

public class MandoAireAcondicionado extends Mando implements Velocidad{

	private enum Modo {FRIO, CALOR}
	
	private int temperatura = 0;
	private int velocidad = 0;
	private Modo modo = Modo.FRIO;
	
	public MandoAireAcondicionado(String modelo, double altura, double anchura, double precio) {
		super(modelo, altura, anchura, precio);
	}
	
	public MandoAireAcondicionado(String modelo, double altura, double anchura) {
		super(modelo, altura, anchura);
	}

	private void comprobarModo(String modo) {
		
		String modoMayusculas = modo.toUpperCase();
		
		try {
			
			this.modo = Modo.valueOf(modoMayusculas);
			
		}catch(IllegalArgumentException e) {
			
			this.modo = Modo.FRIO;
			
		}
		
	}
	
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		if(temperatura >= 16 && temperatura <= 32) {
			this.temperatura = temperatura;
		}
	}

	public String getModo() {
		return String.valueOf(this.modo);
	}

	public void setModo(String modo) {
		
		comprobarModo(modo);
		
	}

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public boolean subirVelocidad() {
		
		boolean posible = true;
		
		this.velocidad += 3;
		if(this.velocidad >= 5) {
			
			this.velocidad = 5;
			posible = false;
			
		}
		
		return posible;
	}

	@Override
	public boolean bajarVelocidad() {
		
		boolean posible = true;
		
		this.velocidad -= 3;
		if(this.velocidad <= 0) {
			
			this.velocidad = 0;
			posible = false;
			
		}
		
		return posible;
	}
	
	@Override
	public String toString() {
		
		String cad = "";
		
		cad += "MandoAireAcondicionado\n";
		cad += "Modelo: " + this.modelo + "\n";
		cad += "Anchura: " + this.anchura + "\n";
		cad += "Altura: " + this.altura + "\n";
		cad += "Precio: " + this.precio + "\n";
		cad += "Temperatura: " + this.temperatura + "\n";
		cad += "Velocidad: " + this.velocidad + "\n";
		cad += "Modo: " + String.valueOf(this.modo) + "\n";
		cad += encendido ? "ON\n" : "OFF\n";
		cad += "---------------------------------------------";
		
		return cad;
	}
}
