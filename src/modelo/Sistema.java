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

public boolean AgregarProductoNoPrecedero(int idProducto, int codigo, String nombre, float precio, Categoria categoria,
		int cantidadDisponible, LocalDate fechaVencimiento, boolean requiereRefrigeracio)throws Exception {
	

	boolean flag=false;

	Producto pa=traerCodigo(codigo);
	if(pa!=null) {
		flag=false;
	}
	else {
		flag=true;
		int id=1;
		if(lstProductos.size()>0) {
			id=lstProductos.get(lstProductos.size()-1).getIdProducto()+1;
		}
		lstProductos.add(new ProductoPerecedero(id ,codigo,nombre,  precio,  categoria,
				 cantidadDisponible,  fechaVencimiento,  requiereRefrigeracio));
	}

return flag;
}
}
