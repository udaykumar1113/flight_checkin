package com.uday.checkin.controller;

import com.uday.checkin.integration.ReservationRestClient;
import com.uday.checkin.integration.dto.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class checkInController {

    @Autowired
    private ReservationRestClient reservationRestClient;

    @RequestMapping(value="/showStartCheckIn")
    public String showStartCheckin(){
        return "startCheckin";
    }

    @RequestMapping(value="/startCheckIn")
    public String startCheckin(@RequestParam("reservationId") Long id, ModelMap modelMap){

        Reservation reservation=reservationRestClient.findReservation(id);
        modelMap.addAttribute("reservation",reservation);
        return "displayReservation";
    }
}
