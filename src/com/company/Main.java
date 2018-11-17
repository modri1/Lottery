package com.company;


public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery(4, "Grasz o 100000000 zł");



        Player player = new Player("Damian", 30);
        Player player1 = new Player("Kacper", 35);
        Player player2 = new Player("Ilona", 28);

        lottery.addPlayer(player);
        lottery.addPlayer(player1);
        lottery.addPlayer(player2);
        lottery.addPlayer(new Player("Ktos", 10));

        System.out.println(lottery.getRandomWinner().getName());
    }
}
