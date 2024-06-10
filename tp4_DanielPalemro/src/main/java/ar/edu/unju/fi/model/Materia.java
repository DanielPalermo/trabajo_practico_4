package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Materia {
	private int codigo;
	private String nombre;
	private int curso; //1ero, 2do, 3ero, (solo numeros)
	private int cant_horas;
	private Modalidad modalidad; //true= virtual | false = presencial
	@Autowired
	private Docente docente;
	@Autowired
	private Carrera carrera;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(int codigo, String nombre, int curso, int cant_horas, Modalidad modalidad, Docente docente,
			Carrera carrera) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cant_horas = cant_horas;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getCant_horas() {
		return cant_horas;
	}

	public void setCant_horas(int cant_horas) {
		this.cant_horas = cant_horas;
	}
	
	public Modalidad getModalidad() {
		return modalidad;
	}
	
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", curso=" + curso + ", cant_horas=" + cant_horas
				+ ", modalidad=" + modalidad + ", docente=" + docente + ", carrera=" + carrera + "]";
	}
	
	
	
}

