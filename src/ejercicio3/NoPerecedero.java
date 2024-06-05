package ejercicio3;

public class NoPerecedero extends Producto{
	
	String tipo = "";

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		
		if(tipo != null && !tipo.equals("")) {
			
			this.tipo = tipo;
			
		}
		
	}
	
	@Override
	public String toString() {
		
		String cad = super.toString();
		
		cad += "Tipo de Producto: " + this.tipo;
		
		return cad;
		
	}
	
}
