package dominio;

import java.util.*;

public class Curso {

	private Integer id;
	private String materia;
	private Set<Alumno> alumnos;
	
	public Curso(Integer id, String materia) {
		this.id = id;
		this.materia = materia;
		this.alumnos=new TreeSet<Alumno>();
	}

	public Integer getId() {
		return id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public void agregarAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	
	public Set<Alumno> listarAlumnos(){
		return this.alumnos;
	}
	
//	public Boolean quitarAlumno(Integer id) throws AlumnoInexistenteExcepcion {
//		Boolean bol=false;
//		Alumno aux=buscarAlumnoPorId(id);
//		if(aux!=null) {
//			alumnos.remove(aux);
//			bol=true;
//		} else {
//			throw new AlumnoInexistenteExcepcion();
//		}
//		
//		return bol;
//	}
	
	public Boolean quitarAlumno(Integer id) throws AlumnoInexistenteExcepcion {
		Boolean bol=false;
		Boolean aux=false;
		for (Alumno alumno : alumnos) {
			if(alumno.getId().equals(id)) {
				alumnos.remove(alumno);
				bol=true;
				break;
			} else {
				aux=true;
			}
		}
		
		if(!aux) throw new AlumnoInexistenteExcepcion();
			
		
		return bol;
	}
	
	@Override
	public String toString() {
		return "Curso [id=" + id + ", materia=" + materia + ", alumnos=" + alumnos + "]";
	}

	
	
}
