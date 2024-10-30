package modelo;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
private LocalDate fechaVencimiento;
private boolean requiereRefrigeracion;
public LocalDate getFechaVencimiento() {
	return fechaVencimiento;
}
public void setFechaVencimiento(LocalDate fechaVencimiento) {
	this.fechaVencimiento = fechaVencimiento;
}
public boolean isRequiereRefrigeracion() {
	return requiereRefrigeracion;
}
public void setRequiereRefrigeracion(boolean requiereRefrigeracion) {
	this.requiereRefrigeracion = requiereRefrigeracion;
}
public ProductoPerecedero(int idProducto, int codigo, String nombre, float precio, Categoria categoria,
		int cantidadDisponible, LocalDate fechaVencimiento, boolean requiereRefrigeracion) {
	super(idProducto, codigo, nombre, precio, categoria, cantidadDisponible);
	this.fechaVencimiento = fechaVencimiento;
	this.requiereRefrigeracion = requiereRefrigeracion;
}
@Override
public boolean esNecesarioReabastecer() {
	return this.getFechaVencimiento().isBefore(LocalDate.now().plusDays(20));
}
@Override
public String toString() {
	return "\nProductoPerecedero [fechaVencimiento=" + fechaVencimiento + ", requiereRefrigeracion="
			+ requiereRefrigeracion + ", idProducto=" + idProducto + ", codigo=" + codigo + ", Nombre=" + Nombre
			+ ", Precio=" + Precio + ", categoria=" + categoria + ", CantidadDisponible=" + CantidadDisponible + "]";
}



}
