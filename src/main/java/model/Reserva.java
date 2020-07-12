package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idreserva;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idquarto")
	private Quarto idquarto;

	public Integer getIdreserva() {
		return idreserva;
	}
	public void setIdreserva(Integer idreserva) {
		this.idreserva = idreserva;
	}
	public Quarto getIdquarto() {
		return idquarto;
	}
	public void setIdquarto(Quarto idquarto) {
		this.idquarto = idquarto;
	}
	public Date getdtreserva() {
		return dtreserva;
	}
	public void setDtreserva(Date dtreserva) {
		this.dtreserva = dtreserva;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Time getHrreserva() {
		return hrreserva;
	}
	public void setHrreserva(Time hrreserva) {
		this.hrreserva = hrreserva;
	}
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtreserva;
	
	@Override
	public String toString(){
		return "reserva [idreserva=" + idreserva + ", idreserva=" + idreserva +"]";
	}
}