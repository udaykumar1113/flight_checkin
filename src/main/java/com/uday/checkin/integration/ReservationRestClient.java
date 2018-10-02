package com.uday.checkin.integration;

import com.uday.checkin.integration.dto.Reservation;
import com.uday.checkin.integration.dto.ReservationRequest;

public interface ReservationRestClient {

    public Reservation findReservation(Long id);

    public Reservation updateReservation(ReservationRequest request);
}
