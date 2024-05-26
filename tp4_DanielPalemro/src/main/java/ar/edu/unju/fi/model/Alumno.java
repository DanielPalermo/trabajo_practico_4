package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {
	int dni;
	String nombre;
	String apellido;
	String email;
	int telefono;
	LocalDate fechaNac;
	int LU;
	
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}


	public Alumno(int dni, String nombre, String apellido, String email, int telefono, LocalDate fechaNac, int lU) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		LU = lU;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public LocalDate getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}


	public int getLU() {
		return LU;
	}


	public void setLU(int lU) {
		LU = lU;
	}


	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + ", fechaNac=" + fechaNac + ", LU=" + LU + ", getDni()=" + getDni()
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getEmail()=" + getEmail()
				+ ", getTelefono()=" + getTelefono() + ", getFechaNac()=" + getFechaNac() + ", getLU()=" + getLU()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
