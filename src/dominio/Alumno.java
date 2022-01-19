package dominio;

public class Alumno implements Comparable<Alumno>{

	private static Integer contador=0;
	
	private Integer id;
	private String nombre;
	private String contraseña;
	
	public Alumno(String nombre, String contra) {
		this.contador++;
		this.nombre = nombre;
		this.id=contador;
		this.contraseña=contra;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	

	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public Boolean validarContraseña(String nombre, String contrseña) {
		Boolean aux=null;
		
		if(this.contraseña.equals(contraseña) && this.nombre.equals(nombre) ){
			aux=true;
		}
		
		return aux;
		
	}

	
	
	
}
