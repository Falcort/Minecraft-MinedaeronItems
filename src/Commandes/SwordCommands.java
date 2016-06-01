package Commandes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Items.Sword;
import net.md_5.bungee.api.ChatColor;

public class SwordCommands implements CommandExecutor
{
	/**
	 * JavaDoc onCommand
	 * This methode listenned for command and do something if the command is correct
	 * 
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			if (args.length == 0)
			{
				sender.sendMessage(ChatColor.WHITE + "Blâfarde");
				sender.sendMessage(ChatColor.DARK_GREEN + "Joyeuse");
				sender.sendMessage(ChatColor.BLUE + "Rare");
				sender.sendMessage(ChatColor.DARK_PURPLE + "Archeus");
				sender.sendMessage(ChatColor.GOLD + "Epée des milles véritées");
			}
			else if (args[0].equalsIgnoreCase("EPDMV"))
			{
				((Player) sender).getInventory().addItem(Sword.createEDMV());
			}
			else if (args[0].equalsIgnoreCase("Archeus"))
			{
				((Player) sender).getInventory().addItem(Sword.createArcheus());
			}
			else if (args[0].equalsIgnoreCase("Rare"))
			{
				((Player) sender).getInventory().addItem(Sword.createRare());
			}
			else if (args[0].equalsIgnoreCase("Joyeuse"))
			{
				((Player) sender).getInventory().addItem(Sword.createJoyeuse());
			}
			else if (args[0].equalsIgnoreCase("Blafarde"))
			{
				((Player) sender).getInventory().addItem(Sword.createBlafarde());
			}
			else
			{
				sender.sendMessage(ChatColor.RED + "Aucune épées trouvée");
				return false;
			}
		}
		return true;
	}
}
