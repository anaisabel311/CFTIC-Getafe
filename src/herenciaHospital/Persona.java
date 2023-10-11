package herenciaHospital;

public abstract class Persona {

private String idPersona;
private String nomPersona;
private int edad;

// CONSTRUCTOR


public Persona(String idPersona, String nomPersona, int edad) {
	super();
	this.idPersona = idPersona;
	this.nomPersona = nomPersona;
	this.edad = edad;
}

// GETTERS AND SETTERS

public String getIdPersona() {
	return idPersona;
}

public void setIdPersona(String idPersona) {
	this.idPersona = idPersona;
}

public String getNomPersona() {
	return nomPersona;
}

public void setNomPersona(String nomPersona) {
	this.nomPersona = nomPersona;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}


//MÉTODO COMER 

public abstract void comer();

}



	

