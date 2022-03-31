package com.example.puckolistan;

import com.example.puckolistan.entities.PlayerObject;
import com.example.puckolistan.repositories.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PuckoListanApplication {

    public static void main(String[] args) {
        SpringApplication.run(PuckoListanApplication.class, args);
    }

    @Bean
    CommandLineRunner init(PlayerRepository playerRepository){
        return args -> {

            PlayerObject playerObject = new PlayerObject("Isak", "Lejon", 26, 183, 75, "Goalkeeper", "Loose cannon, don't feed after midnight");
            playerRepository.save(playerObject);
            PlayerObject playerObject2 = new PlayerObject("Arvid", "Borisweden", 28, 179, 75, "Puckholder", "Likes long walks on the beach at night, walks with a limp on occasion");
            playerRepository.save(playerObject2);
        };
    }

}
