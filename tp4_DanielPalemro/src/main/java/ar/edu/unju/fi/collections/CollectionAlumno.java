package ar.edu.unju.fi.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Alumno;

@Component
public class CollectionAlumno {
	private static List<Alumno> alumnos = new ArrayList<>();
	
	public static List<Alumno> getAlumno(){
		if(alumnos.isEmpty()) {
			alumnos.add(new Alumno(111,"Daniel","Palermo","danipalermo@outlook.com",111111111,LocalDate.of(2004, 1, 22), 111));
			alumnos.add(new Alumno(222,"Ignacio", "Martin", "fibias@gmail.com", 222222222, LocalDate.of(2004, 5, 22), 222));
			alumnos.add(new Alumno(333,"Gabriel", "Chauque", "gabochau@gmail.com", 333333333, LocalDate.of(2004, 6, 19), 333));
		}
		return alumnos;
	}
	
	public static boolean agregarAlumno(Alumno alumno) {
		return alumnos.add(alumno) ? true : false;
	}
	
	public static void eliminarAlumno(int lu) {
		Iterator<Alumno> iterator = alumnos.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getLu()==lu) {
				iterator.remove();
			}
		}
	}
	
	public static void modificarAlumno(Alumno alumno) throws Exception{
		boolean encontrado = false;
		try {
			for(Alumno a: alumnos) {
				if(a.getLu() == alumno.getLu()) {
					a.setDni(alumno.getDni());
					a.setNombre(alumno.getNombre());
					a.setApellido(alumno.getApellido());
					a.setEmail(alumno.getApellido());
					a.setTelefono(alumno.getTelefono());
					a.setFechaNac(a.getFechaNac());
					a.setLu(alumno.getLu());
				}
			}
			if(!encontrado) {
				throw new Exception("El alumno con libreta " + alumno.getLu() + " no existe");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	public static Alumno buscarAlumno(int LU) {
		Predicate<Alumno> filterLU = l -> l.getLu() == LU;
		Optional<Alumno> alumno = alumnos.stream().filter(filterLU).findFirst();
		if(alumno.isPresent()) {
			return alumno.get();
		}else {
			return null;
		}
	}
}
