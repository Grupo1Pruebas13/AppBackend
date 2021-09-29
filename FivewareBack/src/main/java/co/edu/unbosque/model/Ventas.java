package co.edu.unbosque.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ventas {
	
	@Id
	private Long codigo_ventas;
	private Long cedula_cliente;
	private Long cedula_usuario;
	private double ivaventa;
	private double total_venta;
	private double valor_venta;
	
	public Long getCodigo_ventas() {
		return codigo_ventas;
	}
	public void setCodigo_ventas(Long codigo_ventas) {
		this.codigo_ventas = codigo_ventas;
	}
	public Long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(Long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public Long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(Long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public double getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(double ivaventa) {
		this.ivaventa = ivaventa;
	}
	public double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}
	public double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(double valor_venta) {
		this.valor_venta = valor_venta;
	}
	

}
