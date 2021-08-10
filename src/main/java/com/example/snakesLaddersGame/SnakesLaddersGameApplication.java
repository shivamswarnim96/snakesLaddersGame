package com.example.snakesLaddersGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SnakesLaddersGameApplication {

	public static void main(String[] args) {

		SpringApplication.run(SnakesLaddersGameApplication.class, args);

		System.out.println("Game Started );");

		List<Snake> snakes = new ArrayList<Snake>();
		snakes.add(new Snake(14, 7));

		System.out.println("No of Snakes" + snakes.size());

		List<Ladder> ladders = new ArrayList<Ladder>();
		ladders.add(new Ladder(6, 87));

		System.out.println("No of Ladders" + ladders.size());

		List<Player> players = new ArrayList<Player>();
		players.add(new Player("Player1"));

		System.out.println("No of Players" + players.size());

		SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
		snakeAndLadderService.setPlayers(players);
		snakeAndLadderService.setSnakes(snakes);
		snakeAndLadderService.setLadders(ladders);

		snakeAndLadderService.startGame();

	}

}