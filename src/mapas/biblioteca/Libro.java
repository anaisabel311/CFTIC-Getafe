package mapas.biblioteca;

public class Libro {
	
	private String titulo;
	private String autor;
	private Integer numCopias;
	
	
// CONSTRUCTOR	
	
	public Libro(String titulo, String autor, Integer numCopias) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numCopias = numCopias;
	}

// GETTERS AND SETTERS
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Integer getNumCopias() {
		return numCopias;
	}


	public void setNumCopias(Integer numCopias) {
		this.numCopias = numCopias;
	}
	
	
	

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
	
	

}
