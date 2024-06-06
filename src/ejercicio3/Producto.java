package ejercicio3;

public class Producto implements Comparable<Producto>{

	protected String nombre = "";
	protected double precio = 0;
	
	public Producto(String nombre, double precio) {
		
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
		if(precio > 0) {
			this.precio = precio;
		}
		
	}
	
	/**
	 * Constructor para realizar búsquedas mediante el nombre
	 * @param nombre Nombre del producto
	 */
	public Producto(String nombre) {
		
		if(nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double calcular(int cantidad) {
		
		double total = 0;
		
		total = precio * cantidad;
		
		return total;
	}

	@Override
	public String toString() {
		
		String cad = "";
		
		cad += "----------------------------------\n";
		cad += this.nombre + "\n";
		cad += "Precio: " + this.precio + "\n";
		
		return cad;
		
	}
	
	@Override
	public boolean equals(Object o) {
		
		boolean iguales = false;
		
		Producto p = (Producto) o;
		
		if(this.nombre.equals(p.nombre)) {
			
			iguales = true;
			
		}
		
		return iguales;
		
	}
	
	@Override
	public int compareTo(Producto o) {
		
		int pos = 0;
		
		if(this.precio > o.precio) {
			
			pos = -1;
			
		}else if (this.precio < o.precio) {
			
			pos = 1;
			
		}
		
		return pos;
	}
	
}
