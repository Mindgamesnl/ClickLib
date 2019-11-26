package com.craftmend.clicklib.api.managers;

import com.craftmend.clicklib.api.menu.InventoryInteractionListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class InventoryManager {

    private static InventoryManager inventoryManager;

    public InventoryManager(JavaPlugin javaPlugin) {
        Bukkit.getServer().getPluginManager().registerEvents(new InventoryInteractionListener(), javaPlugin);
    }

    public static InventoryManager getInstance(JavaPlugin javaPlugin) {
        if (inventoryManager == null) inventoryManager = new InventoryManager(javaPlugin);
        return inventoryManager;
    }

}
