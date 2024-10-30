package modelo;

public abstract class Producto {
protected int idProducto;
protected int codigo;
protected String Nombre;
protected float  Precio;
protected Categoria categoria;
protected int CantidadDisponible;
public int getIdProducto() {
	return idProducto;
}
public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}


public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public float getPrecio() {
	return Precio;
}
public void setPrecio(float precio) {
	Precio = precio;
}
public Categoria getCategoria() {
	return categoria;
}
public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}
public int getCantidadDisponible() {
	return CantidadDisponible;
}
public void setCantidadDisponible(int cantidadDisponible) {
	CantidadDisponible = cantidadDisponible;
}
public Producto(int idProducto, int codigo, String nombre, float precio, Categoria categoria,
		int cantidadDisponible) {
	super();
	this.idProducto = idProducto;
	this.codigo = codigo;
	Nombre = nombre;
	Precio = precio;
	this.categoria = categoria;
	CantidadDisponible = cantidadDisponible;
}

public abstract  boolean esNecesarioReabastecer();

}
