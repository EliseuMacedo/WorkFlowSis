package model.facade.ws;

import java.util.List;

import model.domain.Ticket;

public interface TicketFacade {

	List<Ticket> getTickets();

	List<Ticket> getTickets(Integer codigo);
	Ticket salvar(Ticket ticket);

	void atualizar(Ticket ticket);

	void deletarTicket(Integer ticket);

}