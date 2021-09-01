package me.gr1den.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Functions {

    public static Inventory createEntranceInv(){
        ItemStack seed = createItem(Material.HOPPER, "HOPPER", 1);

        Inventory inv = createInv(seed, 5, 27, "OpenEvent");

        return inv;

    }


    public static Inventory createInv(ItemStack item, int slot , int size, String name){
        Inventory inv = Bukkit.createInventory(null, size, name);
        inv.setItem(slot, item);

        return inv;
    }

    public static ItemStack createItem(Material material, String name, int amount){
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;

    }

}
