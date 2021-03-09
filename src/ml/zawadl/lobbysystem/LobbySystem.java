package ml.zawadl.lobbysystem;

import alemiz.sgu.nukkit.StarGateUniverse;
import cn.nukkit.plugin.PluginBase;
import ml.zawadl.lobbysystem.command.TransferCommand;
import ml.zawadl.lobbysystem.events.EventListener;

public class LobbySystem extends PluginBase {
    public StarGateUniverse sgu;

    public LobbySystem() {
    }

    public void onEnable() {
        this.getLogger().info("LobbySystem is working");
        this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
        this.getServer().getCommandMap().register("server", new TransferCommand(this));
        this.sgu = StarGateUniverse.getInstance();
    }
}