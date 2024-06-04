package ejercicio2;

public class Empleado {
	
	private String nombre = "";
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre) {
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		
		String cad = "";
		
		cad += "Empleado " + this.nombre;
		
		return cad;
		
	}

	
}
