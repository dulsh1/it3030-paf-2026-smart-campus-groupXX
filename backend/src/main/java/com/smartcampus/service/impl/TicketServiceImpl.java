package com.smartcampus.service.impl;

import com.smartcampus.entity.Ticket;
import com.smartcampus.exception.ResourceNotFoundException;
import com.smartcampus.repository.TicketRepository;
import com.smartcampus.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ticket not found with id: " + id));
    }

    @Override
    public Ticket create(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket update(Long id, Ticket ticket) {
        Ticket existing = getById(id);
        existing.setDescription(ticket.getDescription());
        existing.setPriority(ticket.getPriority());
        existing.setStatus(ticket.getStatus());
        existing.setAssignedTo(ticket.getAssignedTo());
        return ticketRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        Ticket existing = getById(id);
        ticketRepository.delete(existing);
    }
}
