package ml.zawadl.lobbysystem.command;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.PluginCommand;
import ml.zawadl.lobbysystem.LobbySystem;

public class TransferCommand extends PluginCommand<LobbySystem> {
    private final LobbySystem plugin;

    public TransferCommand(LobbySystem plugin) {
        super("/server", plugin);
        this.setPermission("lobbysystem.server");
        this.plugin = plugin;
    }

    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        if (sender.isPlayer()) {
            Player player = (Player)sender;
            this.plugin.sgu.transferPlayer(player, args[0]);
        }

        return true;
    }
}
