package com.tastebin;

import java.util.Arrays;
import java.util.List;

public class Players {

    private final List<Player> players;
    
    public Players(Player ... players) {
        this(Arrays.asList(players));
    }
    
    public Players(List<Player> players) {
        this.players = players;
    }
    
    public Player getPlayer(int id) {
        return players.get(id);
    }
}
