package models;

public class Usuario {
	private int id;
	private String email;
	private String usuario;
	private String password;
	private Idioma idioma;
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String email, String usuario, String password, Idioma idioma) {
		super();
		this.id = id;
		this.email = email;
		this.usuario = usuario;
		this.password = password;
		this.idioma = idioma;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}
	
	

}

