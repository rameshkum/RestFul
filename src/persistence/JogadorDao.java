package persistence;

import java.sql.SQLException;

import model.Jogador;

public interface JogadorDao extends GenericDao<Jogador> {

	Jogador pesquisaUnico(String obj) throws SQLException;
	
}
