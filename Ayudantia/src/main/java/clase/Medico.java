package clase;

public class Medico {
	String idMedico;
	String nombreMedico;
	
	public Medico(){};
	
	public Medico(String idMedico, String nombreMedico){
		this.idMedico = idMedico;
		this.nombreMedico = nombreMedico;
	};
	
	
	public String getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(String id) {
		this.idMedico = id;
	}
	public String getNombreMedico() {
		return nombreMedico;
	}
	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}
	@Override
	public String toString() {
		return "Persona [id=" + idMedico + ", nombre=" + nombreMedico + "]";
	}
}
