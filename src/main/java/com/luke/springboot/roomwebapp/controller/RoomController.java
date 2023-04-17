package com.luke.springboot.roomwebapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luke.springboot.roomwebapp.models.Room;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private static final List<Room> rooms = new ArrayList<>();
    static {
        rooms.add(new Room(1, "200", "Queen", "200"));
        rooms.add(new Room(2, "201", "Queen", "201"));
        rooms.add(new Room(3, "202", "Queen", "202"));
        rooms.add(new Room(4, "203", "Queen", "203"));
        rooms.add(new Room(5, "204", "Queen", "204"));
    }

    @GetMapping
    public String getAllRoom(Model model) {
        model.addAttribute("rooms", rooms);
        return "rooms";
    }

}