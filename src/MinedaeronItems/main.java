package MinedaeronItems;

import org.bukkit.plugin.java.JavaPlugin;

import Commandes.Deuillegivre;
import Commandes.Ensanglante;

public class main extends JavaPlugin
{
	public void onEnable()
	{
		this.getCommand("Deuillegivre").setExecutor(new Deuillegivre());
		this.getCommand("Ensanglante").setExecutor(new Ensanglante());
	}
}
