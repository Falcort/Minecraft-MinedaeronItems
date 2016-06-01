package MinedaeronItems;

import org.bukkit.plugin.java.JavaPlugin;

import Commandes.AxeCommands;
import Commandes.SwordCommands;

public class main extends JavaPlugin
{
	/**
	 * JavaDoc onEnable
	 * This method is call on the loading of the plugin
	 * 
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public void onEnable()
	{
		this.getCommand("sword").setExecutor(new SwordCommands());
		this.getCommand("axe").setExecutor(new AxeCommands());
	}
}
