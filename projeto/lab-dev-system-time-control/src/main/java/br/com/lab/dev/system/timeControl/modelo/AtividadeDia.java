package br.com.lab.dev.system.timeControl.modelo;
// Generated Mar 8, 2017 12:14:54 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * AtividadeDia generated by hbm2java
 */
public class AtividadeDia implements java.io.Serializable {

	private Integer idAtividadeDia;
	private int diaIdDia;
	private int atividadeIdAtividade;
	private Date tempoInvestido;
	private Date dataInicio;
	private Date dataFim;

	public AtividadeDia() {
	}

	public AtividadeDia(int diaIdDia, int atividadeIdAtividade, Date tempoInvestido, Date dataInicio, Date dataFim) {
		this.diaIdDia = diaIdDia;
		this.atividadeIdAtividade = atividadeIdAtividade;
		this.tempoInvestido = tempoInvestido;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Integer getIdAtividadeDia() {
		return this.idAtividadeDia;
	}

	public void setIdAtividadeDia(Integer idAtividadeDia) {
		this.idAtividadeDia = idAtividadeDia;
	}

	public int getDiaIdDia() {
		return this.diaIdDia;
	}

	public void setDiaIdDia(int diaIdDia) {
		this.diaIdDia = diaIdDia;
	}

	public int getAtividadeIdAtividade() {
		return this.atividadeIdAtividade;
	}

	public void setAtividadeIdAtividade(int atividadeIdAtividade) {
		this.atividadeIdAtividade = atividadeIdAtividade;
	}

	public Date getTempoInvestido() {
		return this.tempoInvestido;
	}

	public void setTempoInvestido(Date tempoInvestido) {
		this.tempoInvestido = tempoInvestido;
	}

	public Date getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}