package com.kartersanamo.spleef.game;

import com.kartersanamo.spleef.api.enums.GameState;

import java.util.List;

public class SpleefGame {

    public GameState state = GameState.WAITING;
    public List<SpleefPlayer> players = List.of();
    public List<SpleefPlayer> spectators = List.of();
    public final String mapName;

    public SpleefGame(String mapName) {
        this.mapName = mapName;
    }

    public void beginStart() {
        state = GameState.STARTING;
    }

    public void cancelStart() {
        state = GameState.WAITING;
    }

    public void forceStart() {
        state = GameState.IN_PROGRESS;
    }

    public List<SpleefPlayer> getPlayers() { return players; }
    public List<SpleefPlayer> getSpectators() { return spectators; }
    public String getMapName() { return mapName; }
}
