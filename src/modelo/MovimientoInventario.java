package modelo;

import java.time.LocalDate;

public class MovimientoInventario {
private int idmovimientoInventario;
private Producto producto;
private LocalDate fecha;
private int cantidad;
public int getMovimientoInventario() {
	return idmovimientoInventario;
}
public void setMovimientoInventario(int idmovimientoInventario) {
	this.idmovimientoInventario = idmovimientoInventario;
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
public MovimientoInventario(int idmovimientoInventario, Producto producto, LocalDate fecha, int cantidad) {
	super();
	this.idmovimientoInventario = idmovimientoInventario;
	this.producto = producto;
	this.fecha = fecha;
	this.cantidad = cantidad;
}
@Override
public String toString() {
	return "\nMovimientoInventario [idmovimientoInventario=" + idmovimientoInventario + ", producto=" + producto
			+ ", fecha=" + fecha + ", cantidad=" + cantidad + ", getMovimientoInventario()=" + getMovimientoInventario()
			+ ", getProducto()=" + getProducto() + ", getFecha()=" + getFecha() + ", getCantidad()=" + getCantidad()
			+ "]";
}




}
