package Interfaz;

import java.util.*;

import dominio.*;

public class PruebaMain {

	public static void main(String[] args) {

//		Universidad uni = new Universidad("UNLaM");
//		Curso curso = new Curso(123, "Programacion");
//		uni.agregarCurso(curso);
//		Curso curso2 = new Curso(456, "Matematica");
//		uni.agregarCurso(curso2);
//		curso.agregarAlumno(new Alumno("Juan","5465456465456"));
//		curso.agregarAlumno(new Alumno("Alan","564654564654"));
//		curso.agregarAlumno(new Alumno("Mari","5645645611"));
//		curso.agregarAlumno(new Alumno("Nacho","5456456465465"));
//
//		Set<Alumno> alumno = curso.listarAlumnos();
//
//		for (Alumno a : alumno) {
//			System.out.println(a.toString());
//		}
//		
//		try {
//			curso.quitarAlumno(4);
//			System.out.println("Se quito correctamente");
//		} catch (AlumnoInexistenteExcepcion e) {
//			System.out.println(e.getMessage());
//		}
//
//		
//		List<Curso> cursos =uni.listarCursos();	
//		
//		for (Curso c : cursos) {
//			System.out.println(c.toString());
//		}
//		
//
//		Set<Alumno> alumno2 = curso.listarAlumnos();
//
//		for (Alumno a : alumno2) {
//			System.out.println(a.toString());
//		}
	
		Scanner teclado = new Scanner(System.in);
		Integer opcion=0;
		Universidad uni=new Universidad("UNLaM");
		
		do {
			System.out.println("*** Hola ***");
			System.out.println("*** Ingrese 1 para iniciar sesion ***");
			System.out.println("*** Ingrese 2 para registrarse ***");
			System.out.println("*** Ingrese 0 para salir ***");
			opcion = teclado.nextInt();
			
			switch(opcion) {
				
			case 1:
				System.out.println("Ingrese su id");
				Integer idC=teclado.nextInt();
				System.out.println("Ingrese su contraseña");
				String contrseñaC=teclado.next();
				Alumno alumno = uni.buscarAlumnoPorIdContraseña(idC,contrseñaC);
				Integer o =0;
				if(alumno!=null) {
					do {
						Alumno alumno2=alumno;
						System.out.println("Ingrese 1 para inscrbirse a un curso");
						System.out.println("Ingrese 2 para darse de baja de un curso");
						System.out.println("Ingrese 0 para salir");
						o= teclado.nextInt();
						Curso matematica = new Curso(1,"Matematica");
						Curso programacion = new Curso(2,"Programacion");
						switch(o) {
						case 1:
							Integer op=0;
							System.out.println("Ingrese 1 para inscribirse al curso de matematica");
							System.out.println("Ingrese 2 para inscribirse al curso de programacion");
							op=teclado.nextInt();
							switch(op) {
							
							case 1:
								matematica.agregarAlumno(alumno2);
								break;
								
							case 2:
								programacion.agregarAlumno(alumno2);
								break;
								
							case 0:
								break;
								
							default: System.out.println("Opcion incorrecta, vuelva a intentarlo");
							}
							break;
						
						case 2:
							Integer opc=0;
							System.out.println("Ingrese 1 para salir del curso de matematica");
							System.out.println("Ingrese 2 para salir del curso de programacion");
							opc=teclado.nextInt();
							switch(opc) {
							
							case 1:
								
								try {
									matematica.quitarAlumno(alumno.getId());
								} catch (AlumnoInexistenteExcepcion e) {
									System.out.println(e.getMessage());
								}
								break;
								
							case 2:
								
								try {
									programacion.quitarAlumno(alumno.getId());
								} catch (AlumnoInexistenteExcepcion e) {
									System.out.println(e.getMessage());
								}
								break;
								
							case 0:
								break;
								
							default: System.out.println("Opcion incorrecta, vuelva a intentarlo");
							}
							break;
							
						case 0:
							break;
							
						default: System.out.println("Opcion incorrecta, vuelva a intentarlo");
						}
					}while(o!=0);
					

					
				} else {
					System.out.println("Validacion incorrecta");
				}
				break;
			
			case 2:
				Alumno persona=null;
				System.out.println("Ingrese su nombre");
				String nombre=teclado.next();
				System.out.println("Ingrese su contraseña");
				String contraseña=teclado.next();
				if(contraseña.length()>8) {
					persona = new Alumno(nombre,contraseña);
					uni.agregarAlumno(persona);
				} else {
					System.out.println("La contrseña debe tener mas de 8 caracteres");
					break;
				}
				System.out.println("Su id es:" + persona.getId());
				break;
			
			case 0:
				break;
			
			default: 
				System.out.println("Ingrese nuevamente una opcion");
			
			}
			

		}while(opcion!=0);
		
		
		
	
	}
}
