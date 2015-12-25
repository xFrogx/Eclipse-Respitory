package me.xfrogx.kitpvp;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener
{
	public void onEnable() {
		getLogger().info("FrogKitPvP - Main Class Enabled!");
	}
	public void onDisable() {
		getLogger().info("FrogKitPvP - Main Class Disabled");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	  {
	    if ((sender instanceof Player))
	    {
	      Player p = (Player)sender;
	      if (args.length >= 1)
	      {
	        String kit = args[0];
	        if (kit.equalsIgnoreCase("frog"))
	        {
	        	p.sendMessage(ChatColor.LIGHT_PURPLE + "KITS > " + ChatColor.AQUA + "Kit Frog equipted!");
	        	p.getInventory().addItem(Material.DIAMOND_SWORD);
	          return false;
	        }
	        if (kit.equalsIgnoreCase("fighter"))
	        {
	        	p.sendMessage(ChatColor.LIGHT_PURPLE + "KITS > " + ChatColor.AQUA + "Kit Fighter equipted!");
	        }
	    }
	      p.sendMessage(ChatColor.LIGHT_PURPLE + "KITS > " + ChatColor.AQUA + "Frog - Fighter - Tank");
	  }
		return false;
	 }
}