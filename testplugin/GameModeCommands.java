package me.gr1den.testplugin;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            switch (command.getName()){
                case "gmc":
                    p.setGameMode(GameMode.CREATIVE);
                    break;
                case "gms":
                    p.setGameMode(GameMode.SURVIVAL);
                    break;
                case "gmsp":
                    p.setGameMode(GameMode.SPECTATOR);
                    break;
                case "gma":
                    p.setGameMode(GameMode.ADVENTURE);
                    break;
            }



        }


        return true;
    }
}
