package com.smartcampus.service;

import com.smartcampus.entity.Ticket;
import org.springframework.lang.NonNull;

import java.util.List;

public interface TicketService {

    List<Ticket> getAll();

    Ticket getById(@NonNull Long id);

    Ticket create(@NonNull Ticket ticket);

    Ticket update(@NonNull Long id, @NonNull Ticket ticket);

    void delete(@NonNull Long id);
}
