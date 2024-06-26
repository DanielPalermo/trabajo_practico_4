package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.Modalidad;

@Component
public class CollectionMateria {
	private static List<Materia> materias = new ArrayList<Materia>();
	
	public static List <Materia> getMateria(){
		if(materias.isEmpty()) {
			materias.add(new Materia(0, "LSO II", 2, 56,new Docente(0, "Marcelo", "Perez Ibarra", "PerezIb@gmail.com", 388415727),new Carrera(0, "APU", 3, true),Modalidad.VIRTUAL));
			materias.add(new Materia(1, "MATEMATICA DISCRETA", 1, 40,new Docente(1, "Juan Carlos", "Gutierrez", "jc2023@gmail.com", 388423423),new Carrera(1, "INFORMÁTICA", 5, true), Modalidad.VIRTUAL));
			materias.add(new Materia(2, "ROCAS I", 2, 70,new Docente(2, "Maria", "Battezzati", "Mbatt@gmail.com", 388419237), new Carrera(2, "QUÍMICA", 5, false),Modalidad.VIRTUAL));
		}
		return materias;
	}
	
	public static void agregarMateria(Materia materia) {
		materias.add(materia);
	}
	
	public static void modificarMateria(Materia materia) {
		for(Materia m: materias) {
			if(m.getCodigo() == materia.getCodigo()) {
				m.setCarrera(materia.getCarrera());
				m.setCurso(materia.getCurso());
				m.setDocente(m.getDocente());
				m.setHoras(materia.getHoras());
				m.setModalidad(materia.getModalidad());
				m.setNombre(materia.getNombre());
			}
		}
	}
	
	public static void eliminarMateria(int codigo) {
		Iterator<Materia> iterator = materias.iterator();
		while(iterator.hasNext()) {
			if(iterator.next().getCodigo()==codigo) {
				iterator.remove();
			}
		}
	}
	
	public static Materia buscarMateria(int codigo) {
		 Predicate<Materia> filterCodigo = c -> c.getCodigo() == codigo;
		 Optional <Materia> materia = materias.stream().filter(filterCodigo).findFirst();
		 if(materia.isPresent()) {
			 return materia.get();
		 }else {
			 return null;
		 }
	}
	
	
}
