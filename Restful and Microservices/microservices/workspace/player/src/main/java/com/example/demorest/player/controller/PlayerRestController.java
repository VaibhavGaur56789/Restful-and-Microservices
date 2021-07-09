package com.example.demorest.player.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demorest.player.model.Player;

@RestController
public class PlayerRestController {
	
	@GetMapping("/players")
	public List<Player> getPlayers() {
		List<Player> al = new ArrayList<Player>();
		al.add(new Player(1,"Virat","Batsman","India"));
		al.add(new Player(2,"Rohit","Batsman","India"));
		al.add(new Player(3,"Pant","Wicketkeeper","India"));
		al.add(new Player(4,"Bumrah","Bowler","India"));
		al.add(new Player(5,"Ashwin","Bowler","India"));
		return al;
	}
	
	@GetMapping("/players/{id}")
	public Player getPlayerById(@PathVariable int id) {
		List<Player> li = getPlayers();
		Player p = null;
		for(Player p1:li) {
			if(p1.getPlayerNumber() == id) {
				p = p1;
			}
		}
		return p;
	}
	
	@GetMapping("/player")
	public Player getPlayerById2(@RequestParam int id) {
		List<Player> li = getPlayers();
		Player p = null;
		for(Player p1:li) {
			if(p1.getPlayerNumber() == id) {
				p = p1;
			}
		}
		return p;
	}
}
