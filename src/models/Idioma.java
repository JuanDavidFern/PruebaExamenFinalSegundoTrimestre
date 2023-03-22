package models;

public class Idioma {
	private int id;
	private String descipcion;
	private Pais pais;
	
	
	public Idioma() {
		super();
	}


	public Idioma(int id, String descipcion, Pais pais) {
		super();
		this.id = id;
		this.descipcion = descipcion;
		this.pais = pais;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescipcion() {
		return descipcion;
	}


	public void setDescipcion(String descipcion) {
		this.descipcion = descipcion;
	}


	public Pais getPais() {
		return pais;
	}


	public void setPais(Pais pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return descipcion;
	}

	
	
	
	
}
