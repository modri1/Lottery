package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private List<Player> playersNames;
    private String lotteryName;
    private Random random;

    public Lottery(int playerMaxSize, String lotteryName) {
        this.playersNames = new ArrayList<>();
        this.lotteryName = lotteryName;
        this.random = new Random();
    }

    //metoda dodajaca gracza na pierwsze wolne miejsce w tablicy
    public void addPlayer(Player player){
        playersNames.add(player);

    }

    public Player getRandomWinner(){
        return playersNames.get(random.nextInt(playersNames.size()));
    }

}
