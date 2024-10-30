package modelo;

import java.time.LocalDate;

public class MovimientoInventario {
private int movimientoInventario;
private Producto producto;
private LocalDate fecha;
private int cantidad;
public int getMovimientoInventario() {
	return movimientoInventario;
}
public void setMovimientoInventario(int movimientoInventario) {
	this.movimientoInventario = movimientoInventario;
}
public Producto getProducto() {
	return producto;
}
public void setProducto(Producto producto) {
	this.producto = producto;
}
public LocalDate getFecha() {
	return fecha;
}
public void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public MovimientoInventario(int movimientoInventario, Producto producto, LocalDate fecha, int cantidad) {
	super();
	this.movimientoInventario = movimientoInventario;
	this.producto = producto;
	this.fecha = fecha;
	this.cantidad = cantidad;
}




}
