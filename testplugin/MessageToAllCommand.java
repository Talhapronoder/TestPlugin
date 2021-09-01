package me.gr1den.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MessageToAllCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player player = (Player) sender;
            if(player.hasPermission("testplugin.command")){

                for(Player everyPlayer : Bukkit.getOnlinePlayers()){
                    if (everyPlayer != player){
                        everyPlayer.sendMessage(ChatColor.RED + "this is a test message");
                    }
                }

            }
        }

        return true;
    }
}
