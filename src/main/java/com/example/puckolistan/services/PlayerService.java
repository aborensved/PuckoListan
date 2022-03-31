package com.example.puckolistan.services;

import com.example.puckolistan.entities.PlayerObject;
import com.example.puckolistan.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<PlayerObject> findPlayer(String name){
        //Kolla upp detta, det ställer till det.
        if (name != null)
            return playerRepository.findPlayerObjectByLastName(name);
            return playerRepository.findAll();
    }

    public PlayerObject findPlayerById(int id) {
        return playerRepository.findById(id).orElseThrow();
    }

    public PlayerObject save(PlayerObject playerObject){
        return playerRepository.save(playerObject);
    }

    public void deleteById(int id){
        playerRepository.deleteById(id);
    }
}
