package Commandes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Items.Axe;
import net.md_5.bungee.api.ChatColor;

public class AxeCommands implements CommandExecutor
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
				sender.sendMessage(ChatColor.WHITE + "Okin");
				sender.sendMessage(ChatColor.DARK_GREEN + "Clavicus");
				sender.sendMessage(ChatColor.BLUE + "Feralgide");
				sender.sendMessage(ChatColor.DARK_PURPLE + "Ravageuse");
				sender.sendMessage(ChatColor.GOLD + "Ensanglante");
			}
			else if (args[0].equalsIgnoreCase("Ensanglante"))
			{
				((Player) sender).getInventory().addItem(Axe.createEnsanglante());
			}
			else if (args[0].equalsIgnoreCase("Ravageuse"))
			{
				((Player) sender).getInventory().addItem(Axe.createRavageuse());
			}
			else if (args[0].equalsIgnoreCase("Feralgide"))
			{
				((Player) sender).getInventory().addItem(Axe.createFeralgide());
			}
			else if (args[0].equalsIgnoreCase("Clavicus"))
			{
				((Player) sender).getInventory().addItem(Axe.createClavicus());
			}
			else if (args[0].equalsIgnoreCase("Okin"))
			{
				((Player) sender).getInventory().addItem(Axe.createOkin());
			}
			else
			{
				sender.sendMessage(ChatColor.RED + "Aucune haches trouvée");
				return false;
			}
		}
		return true;
	}

}
