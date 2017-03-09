package br.com.lab.dev.system.timeControl.modelo;
// Generated Mar 9, 2017 12:01:10 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dia generated by hbm2java
 */
@Entity
@Table(name = "dia", catalog = "timeControl")
public class Dia implements java.io.Serializable {

	private Integer idDia;
	private Date dataDia;
	private Date totalHorasDia;

	public Dia() {
	}

	public Dia(Date dataDia, Date totalHorasDia) {
		this.dataDia = dataDia;
		this.totalHorasDia = totalHorasDia;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_dia", unique = true, nullable = false)
	public Integer getIdDia() {
		return this.idDia;
	}

	public void setIdDia(Integer idDia) {
		this.idDia = idDia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_dia", nullable = false, length = 19)
	public Date getDataDia() {
		return this.dataDia;
	}

	public void setDataDia(Date dataDia) {
		this.dataDia = dataDia;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "total_horas_dia", nullable = false, length = 8)
	public Date getTotalHorasDia() {
		return this.totalHorasDia;
	}

	public void setTotalHorasDia(Date totalHorasDia) {
		this.totalHorasDia = totalHorasDia;
	}

}
