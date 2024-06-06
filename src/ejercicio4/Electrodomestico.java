package ejercicio4;

public class Electrodomestico {
	
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}
	
	enum Consumo {
		A, B, C, D, E, F
	}
	
	protected double precioBase = 5;
	protected double peso = 100;
	protected Color color = Color.BLANCO;
	protected Consumo consumoEnergetico = Consumo.F;
	
	public Electrodomestico() {
		
	}

	public Electrodomestico(double precioBase, double peso) {
		
		if(precioBase > 0) {
			this.precioBase = precioBase;
		}
		
		if(peso > 0) {
			this.peso = peso;
		}
		
	}

	public Electrodomestico(double precioBase, double peso, char color, char consumoEnergetico) {
		
		this(precioBase, peso);
		
		comprobarColor(color);
		
		comprobarConsumoEnergetico(consumoEnergetico);
		
	}

	public double getPrecioBase() {
		return this.precioBase;
	}

	public double getPeso() {
		return this.peso;
	}

	public String getColor() {
		return String.valueOf(this.color);
	}

	public String getConsumoEnergetico() {
		return String.valueOf(this.consumoEnergetico);
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		
		String letraCad = String.valueOf(letra);
		
		try {
			
			this.consumoEnergetico = Consumo.valueOf(letraCad);
			
		} catch (IllegalArgumentException  e) {
			
			this.consumoEnergetico = Consumo.F;
			
		}
		
	}
	
	private void comprobarColor(char letra) {
		
		String letraCad = String.valueOf(letra);
		
		try {
			
			this.color = Color.valueOf(letraCad);
			
		} catch (IllegalArgumentException  e) {
			
			this.color = Color.BLANCO;
			
		}
		
	}
	
	 public void precioFinal() {
		 
		 switch(this.consumoEnergetico) {
		 
		 	case A -> {
		 		this.precioBase += 100;
		 	}
		 	case B -> {
		 		this.precioBase += 80;
		 	}
		 	case C -> {
		 		this.precioBase += 60;
		 	}
		 	case D -> {
		 		this.precioBase += 50;
		 	}
		 	case E -> {
		 		this.precioBase += 30;
		 	}
		 	case F -> {
		 		this.precioBase += 10;
		 	}
		 	
		 }
		 
		 if(peso >= 0 && peso <= 19) {
			 
			 this.precioBase += 10;
			 
		 } else if(peso >= 20 && peso <= 49) {
			 
			 this.precioBase += 50;
			 
		 } else if(peso >= 50 && peso <= 79) {
			 
			 this.precioBase += 80;
			 
		 } else if(peso >= 80) {
			 
			 this.precioBase += 100;
			 
		 }
		 
	 }
	
}
