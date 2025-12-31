package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Ticket;

public interface TicketService {
	
	public void saveTicketInfo(Ticket ticket);
	public Ticket getTicketById(int id);
	public List<Ticket> getAllTickets();

}
