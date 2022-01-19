package dominio;

import java.util.*;

public class Universidad {

	private String nombre;
	private List<Curso> cursos;
	private Set<Alumno> alumnos;
	
	public Universidad(String nombre) {
		
		this.nombre = nombre;
		this.cursos=new ArrayList<Curso>();
		this.alumnos=new TreeSet<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarCurso(Curso curso) {
		cursos.add(curso);
	}
	
	public List<Curso> listarCursos(){
		return cursos;
	}
	
	public void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	public Set<Alumno> listarAlumnos(){
		return this.alumnos;
	}
	
	public Boolean quitarAlumno(Integer id) throws AlumnoInexistenteExcepcion {
		Boolean bol=false;
		Alumno aux=buscarAlumnoPorId(id);
		if(aux!=null) {
			alumnos.remove(aux);
			bol=true;
		} else {
			throw new AlumnoInexistenteExcepcion();
		}
		
		return bol;
	}
	
	public Alumno buscarAlumnoPorId(Integer id) {
		
		Alumno aux=null;
		for (Alumno alumno : alumnos) {
			if(alumno.getId().equals(id)) {
				aux=alumno;
				break;
			}
		}
		
		return aux;
	}

	public Alumno buscarAlumnoPorIdContraseña(Integer idC, String contrseñaC) {

		Alumno aux=null;
		for (Alumno alumno : alumnos) {
			if(alumno.getId().equals(idC)&&alumno.getContraseña().equals(contrseñaC)) {
				aux=alumno;
				break;
			}
		}
		
		return aux;
	}
	
}
