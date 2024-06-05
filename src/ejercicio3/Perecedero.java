package ejercicio3;

public class Perecedero extends Producto{
	
	int diasACaducar = 0;

	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		
		if(diasACaducar > 0) {
			
			this.diasACaducar = diasACaducar;
		
		}
		
	}

	@Override
	public String toString() {
		
		String cad = super.toString();
		
		cad += "Caduca en " + this.diasACaducar + " dia/s\n";
		
		return cad;
		
	}
	
	@Override
	public double calcular (int cantidad) {
		
		double total = cantidad * precio;
		
		switch (diasACaducar) {
		
			case 1 -> {
			
				total /= 4;
			
			}
			case 2 -> {
				
				total /= 3;
				
			}
			case 3 -> {
				
				total /= 2;
				
			}
		}
		
		return total;
		
	}
	
}
