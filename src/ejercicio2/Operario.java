package ejercicio2;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		
		String cad = super.toString();
		
		cad += " -> Operario";
		
		return cad;
		
	}
	
}
