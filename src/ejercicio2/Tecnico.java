package ejercicio2;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		
		String cad = super.toString();
		
		cad += " -> Tecnico";
		
		return cad;
	}
	
}
