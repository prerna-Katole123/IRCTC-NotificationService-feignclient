package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
