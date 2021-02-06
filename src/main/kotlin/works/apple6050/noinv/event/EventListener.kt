package works.apple6050.noinv.event

import com.destroystokyo.paper.event.server.PaperServerListPingEvent
import net.md_5.bungee.api.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.*
import org.bukkit.event.inventory.InventoryOpenEvent
import org.bukkit.event.player.PlayerJoinEvent
import java.awt.Color
import java.util.*
import kotlin.random.Random.Default.nextInt
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.event.player.PlayerLoginEvent

class EventListener : Listener {
    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        val p = e.player
        p.sendMessage(ChatColor.DARK_GREEN.toString() + "NoInventorySurvival!")
        p.sendTitle("${ChatColor.GOLD}" + e.player.name + ", ", "${ChatColor.GREEN}" + "NoInventorySurvival!", 0, 150, 0)
    }

    @EventHandler
    fun OnPaperServerListPing(event: PaperServerListPingEvent) {
        val c = Calendar.getInstance()

        event.numPlayers = c.get(Calendar.YEAR) * 10000 + (c.get(Calendar.MONTH) + 1) * 100 + c.get(Calendar.DAY_OF_MONTH)
        event.maxPlayers = c.get(Calendar.HOUR) * 10000 + c.get(Calendar.MINUTE) * 100 + c.get(Calendar.SECOND)
        event.motd = "${ChatColor.of(Color(nextInt(0xFFFFFF)))}${ChatColor.BOLD}NoInventorySurvival!!!"
        event.playerSample.clear()
    }
	
	@EventHandler
	fun OnInventoryOpen(event: InventoryOpenEvent) {
        run {
            event.isCancelled = true
        }
	}
	
	@EventHandler
	fun OnInventoryClick(event: InventoryClickEvent) {
		run {
			event.isCancelled = true
		}
	}

    @EventHandler
    fun OnPlayerLogin(event: PlayerLoginEvent) {

    }
}
