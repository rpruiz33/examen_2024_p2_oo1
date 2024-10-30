package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
private List <Producto> lstProductos;
private List <Categoria>lstCategorias;
private List<MovimientoInventario>lstMovientos;
public List<Producto> getLstProductos() {
	return lstProductos;
}
public void setLstProductos(List<Producto> lstProductos) {
	this.lstProductos = lstProductos;
}
public List<Categoria> getLstCategorias() {
	return lstCategorias;
}
public void setLstCategorias(List<Categoria> lstCategorias) {
	this.lstCategorias = lstCategorias;
}
public List<MovimientoInventario> getLstMovientos() {
	return lstMovientos;
}
public void setLstMovientos(List<MovimientoInventario> lstMovientos) {
	this.lstMovientos = lstMovientos;
}
public Sistema() {
	super();
	this.lstProductos = new ArrayList<Producto>();
	this.lstCategorias = new ArrayList<Categoria>();
	this.lstMovientos = new ArrayList<MovimientoInventario>();;
}

public Categoria traerCategoria(String Nombre) {
	Categoria ca=null;
	int i=0;
	while(i<lstCategorias.size()&& ca==null) {
		if(lstCategorias.get(i).getNombre().equalsIgnoreCase(Nombre)) {
			ca=lstCategorias.get(i);
		}
		i++;
	}
			
		return ca;	
			
}

public boolean agregarCategoria(String Nombre) {
	boolean flag=false;
	Categoria ca=traerCategoria(Nombre);
	if(ca!=null) {
		flag=false;
	}
	else{
		lstCategorias.add(new Categoria(Nombre));
		flag=true;
	}
	return flag; 
}

public Producto traerCodigo(int codigo) {
	Producto p=null;
	int i=0;
	while(i<lstProductos.size()&& p==null) {
		if(lstProductos.get(i).getCodigo()==codigo) {
			p=lstProductos.get(i);
		}
		i++;
	}
	return p;
}


public boolean AgregarProductoPrecedero (int codigo, String nombre, float precio, Categoria categoria,
int cantidadDisponible, LocalDate fechaVencimiento, boolean requiereRefrigeracion)throws Exception {
	

	boolean flag=false;

	Producto pa=traerCodigo(codigo);
	if(pa!=null) {
		throw new Exception("mismo codigo");
	}
	else {
		flag=true;
		int id=1;
		if(lstProductos.size()>0) {
			id=lstProductos.get(lstProductos.size()-1).getIdProducto()+1;
		}
		lstProductos.add(new ProductoPerecedero(id,codigo,  nombre,  precio,  categoria,
				 cantidadDisponible, fechaVencimiento, requiereRefrigeracion));
	}

return flag;
}
public boolean AgregarProductoNoPrecedero(  int codigo, String nombre, float precio, Categoria categoria,
int cantidadDisponible, int mesesGarantia, int cantidadMinima)throws Exception {
	

	boolean flag=false;

	Producto pa=traerCodigo(codigo);
	if(pa!=null) {
		throw new Exception("mismo codigo");
	}
	else {
		flag=true;
		int id=1;
		if(lstProductos.size()>0) {
			id=lstProductos.get(lstProductos.size()-1).getIdProducto()+1;
		}
		lstProductos.add(new ProductoNoPerecedero(id, codigo,  nombre, precio, categoria,
				cantidadDisponible,  mesesGarantia, cantidadMinima));
	}

return flag;
}
public boolean agregarMovimientoInventario(Producto producto , LocalDate fecha, int cantidad)throws Exception {
	if(producto.getCantidadDisponible()+cantidad<0) {
		throw new Exception("la cantidad es menor");
	}
	int cant=producto.getCantidadDisponible()-cantidad;
	int id=1;
	if(lstMovientos.size()>0) {
		id=lstMovientos.get(lstMovientos.size()-1).getMovimientoInventario()+1;
	}
	
	
	return lstMovientos.add(new MovimientoInventario(id,producto ,  fecha,  cant));
}
public List<MovimientoInventario> traerVentas(LocalDate fechaDesde,LocalDate fechaHasta) {
	List<MovimientoInventario> aux = new ArrayList<MovimientoInventario>();
	for (int i=0;i<aux.size();i++) {
		if(lstMovientos.get(i).getFecha().isEqual(fechaHasta)||lstMovientos.get(i).getFecha().isEqual(fechaDesde)||lstMovientos.get(i).getFecha().isBefore(fechaHasta)
				&&lstMovientos.get(i).getFecha().isAfter(fechaHasta)) {
			aux.add(lstMovientos.get(i));
			
		}
	}
	return aux;
}

public List<MovimientoInventario> traerVentasDeproductosRefrigerados(LocalDate fecha) {
	List<MovimientoInventario> aux = new ArrayList<MovimientoInventario>();
	for (int i=0;i<lstMovientos.size();i++) {
		if(lstMovientos.get(i).getFecha().isEqual(fecha)) {
			aux.add(lstMovientos.get(i));
			
		}
	}
	return aux;
}

public List <Producto> traerProductosAReabastecer(Categoria categoria) {
	List<Producto> aux = new ArrayList<Producto>();
	for (int i=0;i<lstProductos.size();i++) {
		if(lstProductos.get(i).getCategoria().equals(categoria)) {
			aux.add(lstProductos.get(i));
			
		}
	}
	return aux;
}
}
