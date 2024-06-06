package ejercicio3;

import java.util.Scanner;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opc = -1;
		
		do {
			
			menu();
			opc = sc.nextInt();
			
			switch(opc) {
				case 1 -> { // Añadir Producto
					
					GestionProductos.aniadirProducto();
					
				}
				case 2 -> { // Listar Productos
					
					GestionProductos.listar();
					
				}
				case 3 -> { // Eliminar Productos
					
					GestionProductos.eliminarProducto();
					
				}
				case 4 -> { // Calcular Precio
					
					GestionProductos.calcularTotal();
					
				}
				
			}
			
		}while(opc != 0);
		
		System.out.println("Saliendo del programa");
		
		sc.close();
		
	}
	
	public static void menu() {
		
		System.out.println("1. Añadir Producto");
		System.out.println("2. Listar Productos");
		System.out.println("3. Eliminar Productos");
		System.out.println("4. Calcular Precio");
		System.out.println("0. Salir");
		
	}
	
}
