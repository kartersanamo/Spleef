package com.kartersanamo.spleef.game;

import java.util.List;

public class GameManager {
    List<SpleefGame> activeGames;

    public void startGame(String mapName) {
        SpleefGame game = new SpleefGame(mapName);
    }
}
