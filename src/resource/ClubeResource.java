package resource;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import controller.ClubeCtrl;
import model.Clube;

/**
 * Classe que possui os metodos de um clube a serem consumidos pelo JSON.
 * @author hury
 *
 */
@Path("/clube")
public class ClubeResource {

	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public List<Clube> listarTodos() throws SQLException{
		return new ClubeCtrl().listaTodos();
	}
	
	@GET
	@Path("/listaPorNome/{nome}")
	@Produces("application/json")
	public List<Clube> listaPorNome(@PathParam("nome") String nome) throws SQLException{
		return new ClubeCtrl().listaPorNome(nome);
	}
	
	@GET
	@Path("/listaPorId/{id}")
	@Produces("application/json")
	public Clube listaPorId(@PathParam("id") int id) throws SQLException{
		return new ClubeCtrl().listaPorId(id);
	}
	
}
