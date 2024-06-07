package ejercicio4;

public class Lavadora extends Electrodomestico{

	private int carga = 5;
	
	public Lavadora() {
		
	}

	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		
		if(carga > 0) {
			
			this.carga = carga;
			
		}
		
	}

	public Lavadora(double precioBase, double peso) {
		
		super(precioBase, peso);
		
	}

	public int getCarga() {
		return carga;
	}
	
	@Override
	public void precioFinal() {
		
		super.precioFinal();
		
		if(carga >= 30) {
			
			this.precioBase += 50;
			
		}
		
	}
	
}
