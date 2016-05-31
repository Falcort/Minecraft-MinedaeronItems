package Commandes;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Items.weapons;

public class Deuillegivre implements CommandExecutor
{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			((Player) sender).getInventory().addItem(weapons.createDeuillegivre());
		}
		return true;
	}

}
