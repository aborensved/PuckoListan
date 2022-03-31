package com.example.puckolistan.controllers;


import com.example.puckolistan.entities.PlayerObject;
import com.example.puckolistan.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hockey")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<PlayerObject> getPlayerObjectList (@RequestParam(required = false) String name) {


        List<PlayerObject> playerObjectList = playerService.findPlayer(name);
        return playerObjectList;
    }

}
