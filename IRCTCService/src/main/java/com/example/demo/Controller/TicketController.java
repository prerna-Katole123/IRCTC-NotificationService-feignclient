package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Ticket;
import com.example.demo.Service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@PostMapping("ticket")
	public ResponseEntity<String> saveTicketInfo(@RequestBody Ticket ticket)
	{
		ticketService.saveTicketInfo(ticket);
		return new ResponseEntity<String>("ticket data saved",HttpStatus.CREATED);
		
	}
	
	@GetMapping("ticket/{id}")
	public ResponseEntity<Ticket> getTicketById(@PathVariable int id)
	{
		Ticket ticket=ticketService.getTicketById(id);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	}
	
	@GetMapping("tickets")
	public ResponseEntity<List<Ticket>> getAllTicket()
	{
		List<Ticket> list=ticketService.getAllTickets();
		return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
	}

}
