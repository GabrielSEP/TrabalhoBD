package model;

import javax.persistence.*;

@Entity
@Table(name="quarto")
public class Quarto {
	public Quarto() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idquarto;

	private Integer idquarto;
	private String classquarto;
	public Integer getIdquarto() {
		return idquarto;
	}
	public void setIdquarto(Integer idquarto) {
		this.idquarto = idquarto;
	}
	public String getidquarto() {
		return idquarto;
	}
	public void setidquarto(Integer idquarto) {
		this.idquarto = idquarto;
	}
	public String getclassquarto() {
		return classquarto;
	}
	public void setclassquarto(String classquarto) {
		this.classquarto = classquarto;
	}
	
	
	@Override
	public String toString(){
		return "quarto[idquarto=" + idquarto + ", idquarto=" + idquarto +"]";
	}
	
	
}