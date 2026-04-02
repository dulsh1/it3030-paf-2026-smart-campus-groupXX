package com.smartcampus.service.impl;

import com.smartcampus.entity.Booking;
import com.smartcampus.exception.ResourceNotFoundException;
import com.smartcampus.repository.BookingRepository;
import com.smartcampus.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found with id: " + id));
    }

    @Override
    public Booking create(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking update(Long id, Booking booking) {
        Booking existing = getById(id);
        existing.setUser(booking.getUser());
        existing.setResource(booking.getResource());
        existing.setStartTime(booking.getStartTime());
        existing.setEndTime(booking.getEndTime());
        existing.setStatus(booking.getStatus());
        return bookingRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        Booking existing = getById(id);
        bookingRepository.delete(existing);
    }
}
