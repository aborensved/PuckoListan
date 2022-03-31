package com.example.puckolistan.repositories;

import com.example.puckolistan.entities.PlayerObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerObject, Integer> {

    List<PlayerObject> findPlayerObjectByLastName(String name);

}
