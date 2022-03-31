package com.example.puckolistan.controllers;


import com.example.puckolistan.entities.PlayerObject;
import com.example.puckolistan.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hockey")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public String getPlayerObjectList (
            //@RequestParam(required = false) String name,
            Model model) {
        List<PlayerObject> playerObjectList = playerService.findPlayer("");
        model.addAttribute("playerObjectList", playerObjectList);
        //return playerObjectList;
        return "players";
    }

    @GetMapping("/{id}")
    public PlayerObject getPlayerObjectById(@PathVariable("id") int id){
        return playerService.findPlayerById(id);
    }

}
