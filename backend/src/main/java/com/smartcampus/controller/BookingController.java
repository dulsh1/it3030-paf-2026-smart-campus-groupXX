package com.smartcampus.controller;

import com.smartcampus.entity.Booking;
import com.smartcampus.service.BookingService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<Booking> getAll() {
        return bookingService.getAll();
    }

    @GetMapping("/{id}")
    public Booking getById(@PathVariable @NonNull Long id) {
        return bookingService.getById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking create(@Valid @RequestBody @NonNull Booking booking) {
        return bookingService.create(booking);
    }

    @PutMapping("/{id}")
    public Booking update(@PathVariable @NonNull Long id, @Valid @RequestBody @NonNull Booking booking) {
        return bookingService.update(id, booking);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable @NonNull Long id) {
        bookingService.delete(id);
    }
}
