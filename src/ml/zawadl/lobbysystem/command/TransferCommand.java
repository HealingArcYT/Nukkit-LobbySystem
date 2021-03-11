package ml.zawadl.lobbysystem.command;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.PluginCommand;

import ml.zawadl.lobbysystem.LobbySystem;


public class TransferCommand extends Command {
    private final LobbySystem plugin;

    public TransferCommand(LobbySystem plugin) {
        super("ichgehauf");
        //this.setPermission("lobbysystem.server");
        this.setDescription("/ichgehauf <server> to transfer to a server");
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
