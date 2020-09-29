package kun.minecraft_plugin.everywhere_on_earth;

import org.bukkit.plugin.java.JavaPlugin;

public final class Everywhere_on_earth extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(this),this);
        getLogger().info("読み込み完了...");
    }
    
}
