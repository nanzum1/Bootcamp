package DAO;

import java.util.List;

import clase.Persona;

public class PersonaDAOImpl implements IPersonaDAO {

	@Override
	public List<Persona> listarTodos() {
		// TODO Auto-generated method stub
		System.out.println("Metodo Listar Todos");
		return null;
	}

	@Override
	public Persona leerPorId(int id) {
		// TODO Auto-generated method stub
		System.out.println("Metodo Leer por ID");
		return null;
	}

	@Override
	public void registrar(Persona d) {
		// TODO Auto-generated method stub
		System.out.println("Metodo registrar");
		
	}

	@Override
	public void actualizar(Persona d) {
		// TODO Auto-generated method stub
		System.out.println("Metodo actualizar");
		
	}

	@Override
	public void eliminar(Persona d) {
		// TODO Auto-generated method stub
		System.out.println("Metodo eliminar");
		
	}
}
