package com.uday.checkin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class checkInController {

    @RequestMapping(value="/showStartCheckIn")
    public String showStartCheckin(){
        return "startCheckin";
    }
}
