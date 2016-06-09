package Items;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import net.md_5.bungee.api.ChatColor;


public class Bow
{
	/**
	 * JavaDoc createZephyr
	 * This methode create a common sword name "Zephyr"
	 * 
	 * @return Zephyr
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createZephyr()
	{
		ItemStack Zephyr = new ItemStack(Material.BOW, 1, (short)1);
		ItemMeta meta = Zephyr.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.WHITE + "Zephyr");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Sais pas");
		meta.setLore(lore);
		Zephyr.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(Zephyr);
        net.minecraft.server.v1_10_R1.NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new net.minecraft.server.v1_10_R1.NBTTagCompound();
        net.minecraft.server.v1_10_R1.NBTTagList NBTTags = new net.minecraft.server.v1_10_R1.NBTTagList();
        
        net.minecraft.server.v1_10_R1.NBTTagCompound speed = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        speed.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        speed.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        speed.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        speed.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        speed.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(speed);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound damage = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        damage.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        damage.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        damage.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        damage.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        damage.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(damage);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound health = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        health.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        health.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        health.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        health.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        health.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(health);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound armor = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        armor.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        armor.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        armor.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        armor.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        armor.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(armor);
        
        nbt.set("AttributeModifiers", NBTTags);
        nmsStack.setTag(nbt);
     
        Zephyr = CraftItemStack.asBukkitCopy(nmsStack);
		return Zephyr;
	}
	
	/**
	 * JavaDoc createTDF
	 * This methode create a uncommon sword name "TDF"
	 * 
	 * @return TDF
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createTDF()
	{
		ItemStack TDF = new ItemStack(Material.BOW, 1, (short)1);
		ItemMeta meta = TDF.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.DARK_GREEN + "Trépas de finriel");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Sais pas");
		meta.setLore(lore);
		TDF.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(TDF);
        net.minecraft.server.v1_10_R1.NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new net.minecraft.server.v1_10_R1.NBTTagCompound();
        net.minecraft.server.v1_10_R1.NBTTagList NBTTags = new net.minecraft.server.v1_10_R1.NBTTagList();
        
        net.minecraft.server.v1_10_R1.NBTTagCompound speed = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        speed.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        speed.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        speed.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        speed.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        speed.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(speed);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound damage = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        damage.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        damage.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        damage.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        damage.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        damage.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(damage);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound health = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        health.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        health.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        health.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        health.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        health.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(health);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound armor = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        armor.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        armor.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        armor.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        armor.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        armor.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(armor);
        
        nbt.set("AttributeModifiers", NBTTags);
        nmsStack.setTag(nbt);
     
        TDF = CraftItemStack.asBukkitCopy(nmsStack);
		return TDF;
	}
	
	/**
	 * JavaDoc createFroki
	 * This methode create a rare sword name "Froki"
	 * 
	 * @return rare
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createFroki()
	{
		ItemStack Froki = new ItemStack(Material.BOW, 1, (short)1);
		ItemMeta meta = Froki.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.BLUE + "Froki");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Froki");
		meta.setLore(lore);
		Froki.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(Froki);
        net.minecraft.server.v1_10_R1.NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new net.minecraft.server.v1_10_R1.NBTTagCompound();
        net.minecraft.server.v1_10_R1.NBTTagList NBTTags = new net.minecraft.server.v1_10_R1.NBTTagList();
        
        net.minecraft.server.v1_10_R1.NBTTagCompound speed = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        speed.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        speed.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        speed.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        speed.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        speed.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(speed);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound damage = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        damage.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        damage.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        damage.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        damage.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        damage.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(damage);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound health = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        health.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        health.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        health.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        health.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        health.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(health);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound armor = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        armor.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        armor.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        armor.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        armor.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        armor.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(armor);
        
        nbt.set("AttributeModifiers", NBTTags);
        nmsStack.setTag(nbt);
     
        Froki = CraftItemStack.asBukkitCopy(nmsStack);
		return Froki;
	}
	
	/**
	 * JavaDoc createHarmonnie
	 * This methode create a common sword name "Harmonnie"
	 * 
	 * @return Harmonnie
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createHarmonnie()
	{
		ItemStack Harmonnie = new ItemStack(Material.BOW, 1, (short)1);
		ItemMeta meta = Harmonnie.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.DARK_PURPLE + "Harmonnie");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Epée du guerrie déchu Mor'Ladim");
		meta.setLore(lore);
		Harmonnie.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(Harmonnie);
        net.minecraft.server.v1_10_R1.NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new net.minecraft.server.v1_10_R1.NBTTagCompound();
        net.minecraft.server.v1_10_R1.NBTTagList NBTTags = new net.minecraft.server.v1_10_R1.NBTTagList();
        
        net.minecraft.server.v1_10_R1.NBTTagCompound speed = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        speed.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        speed.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        speed.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        speed.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        speed.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(speed);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound damage = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        damage.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        damage.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        damage.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        damage.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        damage.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(damage);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound health = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        health.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        health.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        health.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        health.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        health.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(health);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound armor = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        armor.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(7));
        armor.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        armor.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        armor.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        armor.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(armor);
        
        nbt.set("AttributeModifiers", NBTTags);
        nmsStack.setTag(nbt);
     
        Harmonnie = CraftItemStack.asBukkitCopy(nmsStack);
		return Harmonnie;
	}
	
	/**
	 * JavaDoc createThori
	 * This methode create a common sword name "Epée des milles véritées"
	 * 
	 * @return Thori
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createThori()
	{
		ItemStack Thori = new ItemStack(Material.BOW, 1, (short)1);
		ItemMeta meta = Thori.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.GOLD + "Thori’Dal");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Née de la tristesse et le sable");
		lore.add(ChatColor.YELLOW + "portée par de grands héros");
		meta.setLore(lore);
		Thori.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(Thori);
        net.minecraft.server.v1_10_R1.NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new net.minecraft.server.v1_10_R1.NBTTagCompound();
        net.minecraft.server.v1_10_R1.NBTTagList NBTTags = new net.minecraft.server.v1_10_R1.NBTTagList();
        
        net.minecraft.server.v1_10_R1.NBTTagCompound speed = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        speed.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(10));
        speed.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        speed.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        speed.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        speed.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(speed);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound damage = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        damage.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.attackDamage"));
        damage.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(10));
        damage.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        damage.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        damage.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        damage.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(damage);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound health = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        health.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.maxHealth"));
        health.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(10));
        health.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        health.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        health.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        health.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(health);
        
        net.minecraft.server.v1_10_R1.NBTTagCompound armor = new net.minecraft.server.v1_10_R1.NBTTagCompound();
        armor.set("AttributeName", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Name", new net.minecraft.server.v1_10_R1.NBTTagString("generic.armor"));
        armor.set("Amount", new net.minecraft.server.v1_10_R1.NBTTagDouble(10));
        armor.set("Operation", new net.minecraft.server.v1_10_R1.NBTTagInt(0));
        armor.set("UUIDLeast", new net.minecraft.server.v1_10_R1.NBTTagInt(894654));
        armor.set("UUIDMost", new net.minecraft.server.v1_10_R1.NBTTagInt(2872));
        armor.set("Slot", new net.minecraft.server.v1_10_R1.NBTTagString("mainhand"));
        NBTTags.add(armor);
        
        nbt.set("AttributeModifiers", NBTTags);
        nmsStack.setTag(nbt);
     
        Thori = CraftItemStack.asBukkitCopy(nmsStack);
		return Thori;
	}
}
