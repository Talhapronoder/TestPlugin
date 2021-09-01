package me.gr1den.testplugin;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        System.out.println("This is a test plugin");

        this.getCommand("send").setExecutor(new MessageToAllCommand());

        this.getCommand("gmc").setExecutor(new GameModeCommands());
        this.getCommand("gms").setExecutor(new GameModeCommands());
        this.getCommand("gmsp").setExecutor(new GameModeCommands());
        this.getCommand("gma").setExecutor(new GameModeCommands());

        this.getCommand("testgui").setExecutor(new OpenGUICommand());

        getServer().getPluginManager().registerEvents(new Events(), this);

    }

    @Override
    public void onDisable() {

        System.out.println("The test plugin has been disabled");
    }


}
