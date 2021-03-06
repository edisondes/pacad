package com.proint1.udea.produccion.entidades;

import java.util.Date;

/**
 * TbPrdAutoresxproduccion generated by hbm2java
 */
public class TbPrdAutoresxproduccion implements java.io.Serializable {

	private static final long serialVersionUID = -2014262711877837104L;
	
	private TbPrdAutoresxproduccionId id;
	private TbPrdProduccion tbPrdProduccion;
	private TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion;
	private TbPrdAutor tbPrdAutor;
	private String vrAdtusuario;
	private Date dtAdtfecha;

	public TbPrdAutoresxproduccion() {
	}

	public TbPrdAutoresxproduccion(TbPrdAutoresxproduccionId id,
			TbPrdProduccion tbPrdProduccion, TbPrdAutor tbPrdAutor,
			String vrAdtusuario, Date dtAdtfecha) {
		this.id = id;
		this.tbPrdProduccion = tbPrdProduccion;
		this.tbPrdAutor = tbPrdAutor;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public TbPrdAutoresxproduccion(TbPrdAutoresxproduccionId id,
			TbPrdProduccion tbPrdProduccion,
			TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion,
			TbPrdAutor tbPrdAutor, String vrAdtusuario, Date dtAdtfecha) {
		this.id = id;
		this.tbPrdProduccion = tbPrdProduccion;
		this.tbPrdGrupoinvestigacion = tbPrdGrupoinvestigacion;
		this.tbPrdAutor = tbPrdAutor;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public TbPrdAutoresxproduccionId getId() {
		return this.id;
	}

	public void setId(TbPrdAutoresxproduccionId id) {
		this.id = id;
	}

	public TbPrdProduccion getTbPrdProduccion() {
		return this.tbPrdProduccion;
	}

	public void setTbPrdProduccion(TbPrdProduccion tbPrdProduccion) {
		this.tbPrdProduccion = tbPrdProduccion;
	}

	public TbPrdGrupoinvestigacion getTbPrdGrupoinvestigacion() {
		return this.tbPrdGrupoinvestigacion;
	}

	public void setTbPrdGrupoinvestigacion(
			TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion) {
		this.tbPrdGrupoinvestigacion = tbPrdGrupoinvestigacion;
	}

	public TbPrdAutor getTbPrdAutor() {
		return this.tbPrdAutor;
	}

	public void setTbPrdAutor(TbPrdAutor tbPrdAutor) {
		this.tbPrdAutor = tbPrdAutor;
	}

	public String getVrAdtusuario() {
		return this.vrAdtusuario;
	}

	public void setVrAdtusuario(String vrAdtusuario) {
		this.vrAdtusuario = vrAdtusuario;
	}

	public Date getDtAdtfecha() {
		return this.dtAdtfecha;
	}

	public void setDtAdtfecha(Date dtAdtfecha) {
		this.dtAdtfecha = dtAdtfecha;
	}

}
