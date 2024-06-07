package ejercicio4;

public class Television extends Electrodomestico{

	private double pulgadas = 20;
	
	private boolean sintonizadorTDT = false;
	
	public Television() {
		
	}

	public Television(double precioBase, double peso, String color, char consumoEnergetico, double pulgadas, boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergetico);
		
		if(pulgadas > 0) {
			this.pulgadas = pulgadas;
		}
		
		if(sintonizadorTDT) {
			
			this.sintonizadorTDT = sintonizadorTDT;
			
		}
		
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	@Override
	public void precioFinal() {
		
		super.precioFinal();
		
		if(this.pulgadas >= 40) {
			
			this.precioBase += this.precioBase * 0.30;
			
		}
		
		if(this.sintonizadorTDT) {
			
			this.precioBase += 50;
			
		}
		
	}
	
	
}
