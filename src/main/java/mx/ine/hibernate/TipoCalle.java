package mx.ine.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "geoloc.tipo_calle")
public class TipoCalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tipo_calle_id")
	private Integer tipoCalleId;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "descripcion_corta")
	private String descripcionCorta;
	
	public TipoCalle(Integer tipoCalleId, String descripcion, String descripcionCorta) {
		super();
		this.tipoCalleId = tipoCalleId;
		this.descripcion = descripcion;
		this.descripcionCorta = descripcionCorta;
	}
	public TipoCalle() {
		super();
	}
	@Override
	public String toString() {
		return "TipoCalle [tipoCalleId=" + tipoCalleId + ", descripcion=" + descripcion + ", descripcionCorta="
				+ descripcionCorta + "]";
	}
	public Integer getTipoCalleId() {
		return tipoCalleId;
	}
	public void setTipoCalleId(Integer tipoCalleId) {
		this.tipoCalleId = tipoCalleId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcionCorta() {
		return descripcionCorta;
	}
	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	} 
}
