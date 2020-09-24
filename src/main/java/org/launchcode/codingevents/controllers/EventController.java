package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String EventController(Model model){
       List<String> events = new ArrayList<>();
       events.add("Code with Pride");
       events.add("StrangeLoop");
       events.add("LaunchCode Event");
       model.addAttribute("events", events);
       return "events/index";
    }
}
