package ejercicio2;

public class Oficial extends Operario{

	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		
		String cad = super.toString();
		
		cad += " -> Oficial";
		
		return cad;
		
	}
	
}
