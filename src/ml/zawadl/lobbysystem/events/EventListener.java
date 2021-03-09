package ml.zawadl.lobbysystem.events;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import ml.zawadl.lobbysystem.LobbySystem;

public class EventListener implements Listener {
    private final LobbySystem plugin;

    public EventListener(LobbySystem plugin) {
        this.plugin = plugin;
    }

    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().getInventory().clearAll();
    }
}
