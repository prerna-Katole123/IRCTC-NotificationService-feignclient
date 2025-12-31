package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Client.NotificationClient;
import com.example.demo.Entity.Ticket;
import com.example.demo.Repo.TicketRepo;
@Service
public class TicketSerImpl implements TicketService{
	@Autowired
	TicketRepo ticketRepo;
	
	@Autowired
	NotificationClient notificationClient;

	@Override
	public void saveTicketInfo(Ticket ticket) {
		ticketRepo.save(ticket);
		notificationClient.sendNotification("prernakatole@gmail.com","your ticket is booked");
		System.out.println("notification sent");
	}

	@Override
	public Ticket getTicketById(int id) {
		
		return ticketRepo.findById(id).get();
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return ticketRepo.findAll();
	}

}
