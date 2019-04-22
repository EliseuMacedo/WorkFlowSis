package model.facade.ws;

import java.util.List;

import model.domain.Tecnico;

public interface TecnicoFacade {

	List<Tecnico> getTecnicos();

	List<Tecnico> getTecnicos(Integer codigo);

	Tecnico salvar(Tecnico tecnico);

	void atualizar(Tecnico tecnico);

	void deletarTecnico(Integer tecnico);
}