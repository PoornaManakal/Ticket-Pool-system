package com.OOP.ticket_pool.repository;

import com.OOP.ticket_pool.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // Additional query methods can be defined here if needed
}
