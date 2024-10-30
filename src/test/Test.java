package test;

import java.time.LocalDate;

import modelo.Categoria;
import modelo.Sistema;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sistema sistema=new Sistema();
		System.out.println(sistema.agregarCategoria("Bebidas"));
		System.out.println(sistema.agregarCategoria("Almacen"));
		System.out.println(sistema.agregarCategoria("Decoracion"));
		
		System.out.println("-----------------------");
		
		try {
			System.out.println(sistema.AgregarProductoPrecedero(1001,"Yogurt", 900f, sistema.traerCategoria("Bebidas"), 100, LocalDate.of(2024, 10, 20), true));
			System.out.println(sistema.AgregarProductoPrecedero(1002,"Agua", 1000f, sistema.traerCategoria("Bebidas"), 100, LocalDate.of(2024, 11, 20), false));
			System.out.println(sistema.AgregarProductoPrecedero(2001,"Arroz", 900f, sistema.traerCategoria("Almacen"), 100, LocalDate.of(2025, 11, 20), false));
			System.out.println(sistema.AgregarProductoPrecedero(3001,"Pegamento", 8000f, sistema.traerCategoria("Decoracion"), 100, LocalDate.of(2024, 10, 18),  false));
			System.out.println(sistema.AgregarProductoNoPrecedero(3002,"Lija", 250f,sistema.traerCategoria("Decoracion"), 100, 6,0));
			System.out.println(sistema.AgregarProductoNoPrecedero(3003,"Martillo", 600f,sistema.traerCategoria("Decoracion"), 30, 12,0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sistema.getLstProductos());
		
		try {
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(1001), LocalDate.of(2024, 10, 10), 50));
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(1002), LocalDate.of(2024, 10, 10), 30));
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(2001), LocalDate.of(2024, 10, 10), 80));
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(3001), LocalDate.of(2024, 10, 10), 40));
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(3002), LocalDate.of(2024, 10, 10), 11));
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(3003), LocalDate.of(2024, 10, 10), 40));
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(1001), LocalDate.of(2024, 10, 13), 10));
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(1002), LocalDate.of(2024, 10, 13), -4));
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(3002), LocalDate.of(2024, 10, 13), -3));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sistema.traerVentasDeproductosRefrigerados(LocalDate.of(2024, 10, 13)));
		
		System.out.println("-----------------------");
		
		System.out.println(sistema.traerProductosAReabastecer(sistema.traerCategoria("Decoracion")));
		System.out.println("-----------------------");
		try {
			System.out.println(sistema.AgregarProductoPrecedero(1001,"Yogurt", 900f, sistema.traerCategoria("Bebidas"), 100, LocalDate.of(2024, 10, 20), true));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		try {
			System.out.println(sistema.agregarMovimientoInventario(sistema.traerCodigo(3003), LocalDate.of(2024, 10, 13), -50));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
