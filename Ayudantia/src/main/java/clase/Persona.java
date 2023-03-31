package clase;

public class Persona {
	String idPersona;
	String nombrePersona;
	
	public Persona(){};
	
	public Persona(String idPersona, String nombrePersona){
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
	};
	
	
	public String getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	@Override
	public String toString() {
		return "Persona [id=" + idPersona + ", nombre=" + nombrePersona + "]";
	}
}
