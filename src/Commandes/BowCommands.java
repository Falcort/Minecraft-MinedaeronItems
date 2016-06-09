package Commandes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Items.Bow;
import net.md_5.bungee.api.ChatColor;

public class BowCommands implements CommandExecutor
{

	/**
	 * JavaDoc onCommand
	 * This methode listenned for command and do something if the command is correct
	 * 
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			if (args.length == 0)
			{
				sender.sendMessage(ChatColor.WHITE + "Zephyr");
				sender.sendMessage(ChatColor.DARK_GREEN + "Trépas de finriel");
				sender.sendMessage(ChatColor.BLUE + "Froki");
				sender.sendMessage(ChatColor.DARK_PURPLE + "Harmonnie");
				sender.sendMessage(ChatColor.GOLD + "Thori’Dal");
			}
			else if (args[0].equalsIgnoreCase("Zephyr"))
			{
				((Player) sender).getInventory().addItem(Bow.createZephyr());
			}
			else if (args[0].equalsIgnoreCase("Trépas de finriel"))
			{
				((Player) sender).getInventory().addItem(Bow.createTDF());
			}
			else if (args[0].equalsIgnoreCase("Froki"))
			{
				((Player) sender).getInventory().addItem(Bow.createFroki());
			}
			else if (args[0].equalsIgnoreCase("Harmonnie"))
			{
				((Player) sender).getInventory().addItem(Bow.createHarmonnie());
			}
			else if (args[0].equalsIgnoreCase("Thori"))
			{
				((Player) sender).getInventory().addItem(Bow.createThori());
			}
			else
			{
				sender.sendMessage(ChatColor.RED + "Aucun arcs trouvée");
				return false;
			}
		}
		return true;
	}

}
