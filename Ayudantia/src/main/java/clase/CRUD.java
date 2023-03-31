package clase;

import java.util.List;

public interface CRUD<D>{
	List<D>listarTodos();
	D leerPorId(int id);
	void registrar(D d);
	void actualizar(D d);
	void eliminar(D d);
}
