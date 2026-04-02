package com.smartcampus.service;

import com.smartcampus.entity.Booking;
import org.springframework.lang.NonNull;

import java.util.List;

public interface BookingService {

    List<Booking> getAll();

    Booking getById(@NonNull Long id);

    Booking create(@NonNull Booking booking);

    Booking update(@NonNull Long id, @NonNull Booking booking);

    void delete(@NonNull Long id);
}
