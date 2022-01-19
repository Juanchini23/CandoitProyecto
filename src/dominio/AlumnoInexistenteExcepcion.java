package dominio;

public class AlumnoInexistenteExcepcion extends Exception {
	
	public AlumnoInexistenteExcepcion() {
		super("Alumno inexistente en este curso");
	}

}
