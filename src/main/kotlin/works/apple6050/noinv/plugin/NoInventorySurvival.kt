package works.apple6050.noinv.plugin

import works.apple6050.noinv.event.EventListener
import org.bukkit.Bukkit
import org.bukkit.GameRule
import org.bukkit.plugin.java.JavaPlugin

/**
 * @author Apple6050
 */
class Main : JavaPlugin() {
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(EventListener(), this)
        for (world in Bukkit.getWorlds()) {
            world.setGameRule(GameRule.KEEP_INVENTORY, false)
        }
    }

    override fun onDisable() {
        println("See You Next Time!")
    }
}