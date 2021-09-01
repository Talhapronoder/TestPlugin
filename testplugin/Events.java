package me.gr1den.testplugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {

    @EventHandler
    public void OnPlayerJoinEvent(PlayerJoinEvent e){
        Player player = e.getPlayer();
        if(player.hasPermission("testplugin.event")){
            Inventory inv = Functions.createEntranceInv();
            player.openInventory(inv);
        }

    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        if(e.getView().getTitle().equals("OpenEvent")){
            if(e.getCurrentItem() !=null && e.getCurrentItem().getType() == Material.HOPPER){

                ItemStack seed = Functions.createItem(Material.WHEAT_SEEDS, "123", 1);
                Inventory inv = Functions.createInv(seed, 2, 9,"HopperInv");
                e.getWhoClicked().openInventory(inv);
            }
        }else if(e.getView().getTitle().equals("HopperInv")){
            if(e.getCurrentItem() != null && e.getCurrentItem().getType() == Material.WHEAT_SEEDS){

                ItemStack seeds = Functions.createItem(Material.WHEAT_SEEDS, "123", 20);

                e.getWhoClicked().getInventory().addItem(seeds);
                e.setCancelled(true);
            }
        }
    }

}
