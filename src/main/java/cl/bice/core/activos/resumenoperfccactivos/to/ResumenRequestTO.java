package cl.bice.core.activos.resumenoperfccactivos.to;

import java.io.Serializable;

public class ResumenRequestTO implements Serializable {
    
	private static final long serialVersionUID = 1L;
	
	private String rut;

	private String tipoProducto;
	
	private int desde;
	
	private int hasta;
	
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}	

	public int getDesde() {
		return desde;
	}

	public void setDesde(int desde) {
		this.desde = desde;
	}

	public int getHasta() {
		return hasta;
	}

	public void setHasta(int hasta) {
		this.hasta = hasta;
	}

	
}
