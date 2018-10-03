package com.uday.checkin.integration.dto;

import com.uday.checkin.integration.ReservationRestClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ReservationRestClientImpl implements ReservationRestClient {

    private static final String RESERVATION_REST_URL="http://localhost:8080/getReservation/";

    @Override
    public Reservation findReservation(Long id) {

        RestTemplate restTemplate=new RestTemplate();
        Reservation reservation=restTemplate.getForObject(RESERVATION_REST_URL+id,Reservation.class);
        return reservation;
    }

    @Override
    public Reservation updateReservation(ReservationRequest request) {
         RestTemplate restTemplate=new RestTemplate();
         Reservation reservation=restTemplate.postForObject("http://localhost:8080/updateReservation",
                 request,Reservation.class);
        return reservation;
    }
}
