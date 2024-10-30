package modelo;

public class ProductoNoPerecedero extends Producto {
private int mesesGarantia;
private int CantidadMinima;

public int getMesesGarantia() {
	return mesesGarantia;
}
public void setMesesGarantia(int mesesGarantia) {
	this.mesesGarantia = mesesGarantia;
}
public int getCantidadMinima() {
	return CantidadMinima;
}
public void setCantidadMinima(int cantidadMinima) {
	CantidadMinima = cantidadMinima;
}
public ProductoNoPerecedero(int idProducto, int codigo, String nombre, float precio, Categoria categoria,
		int cantidadDisponible, int mesesGarantia, int cantidadMinima) {
	super(idProducto, codigo, nombre, precio, categoria, cantidadDisponible);
	this.mesesGarantia = mesesGarantia;
	CantidadMinima = cantidadMinima;
}
@Override
public boolean esNecesarioReabastecer() {
	return this.getCantidadMinima()>this.getCantidadDisponible();
}
@Override
public String toString() {
	return "\nProductoNoPerecedero [mesesGarantia=" + mesesGarantia + ", CantidadMinima=" + CantidadMinima
			+ ", idProducto=" + idProducto + ", codigo=" + codigo + ", Nombre=" + Nombre + ", Precio=" + Precio
			+ ", categoria=" + categoria + ", CantidadDisponible=" + CantidadDisponible + "]";
}





}
