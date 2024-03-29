package Items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import net.md_5.bungee.api.ChatColor;

public class Sword
{
	/**
	 * JavaDoc createBlafarde
	 * This methode create a common sword name "Blafarde"
	 * 
	 * @return Blafarde
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createBlafarde()
	{
		ItemStack Blafarde = new ItemStack(Material.DIAMOND_SWORD, 1, (short)1);
		ItemMeta meta = Blafarde.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.WHITE + "Bl�farde");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Sais pas");
		meta.setLore(lore);
		Blafarde.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(Blafarde);
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
     
        Blafarde = CraftItemStack.asBukkitCopy(nmsStack);
		return Blafarde;
	}
	
	/**
	 * JavaDoc createJoyeuse
	 * This methode create a uncommon sword name "Joyeuse"
	 * 
	 * @return Joyeuse
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createJoyeuse()
	{
		ItemStack Joyeuse = new ItemStack(Material.DIAMOND_SWORD, 1, (short)1);
		ItemMeta meta = Joyeuse.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.DARK_GREEN + "Joyeuse");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Sais pas");
		meta.setLore(lore);
		Joyeuse.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(Joyeuse);
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
     
        Joyeuse = CraftItemStack.asBukkitCopy(nmsStack);
		return Joyeuse;
	}
	
	/**
	 * JavaDoc createRare
	 * This methode create a rare sword name "Rare"
	 * 
	 * @return rare
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createRare()
	{
		ItemStack Rare = new ItemStack(Material.DIAMOND_SWORD, 1, (short)1);
		ItemMeta meta = Rare.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.BLUE + "Rare");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Rare");
		meta.setLore(lore);
		Rare.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(Rare);
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
     
        Rare = CraftItemStack.asBukkitCopy(nmsStack);
		return Rare;
	}
	
	/**
	 * JavaDoc createArcheus
	 * This methode create a common sword name "Archeus"
	 * 
	 * @return Archeus
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createArcheus()
	{
		ItemStack Archeus = new ItemStack(Material.DIAMOND_SWORD, 1, (short)1);
		ItemMeta meta = Archeus.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.DARK_PURPLE + "Archeus");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Ep�e du guerrie d�chu Mor'Ladim");
		meta.setLore(lore);
		Archeus.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(Archeus);
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
     
        Archeus = CraftItemStack.asBukkitCopy(nmsStack);
		return Archeus;
	}
	
	/**
	 * JavaDoc createEDMV
	 * This methode create a common sword name "Ep�e des milles v�rit�es"
	 * 
	 * @return EDMV
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createEDMV()
	{
		ItemStack EDMV = new ItemStack(Material.DIAMOND_SWORD, 1, (short)1);
		ItemMeta meta = EDMV.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.GOLD + "Ep�e des milles v�rit�es");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Pr�dite par Salzman");
		lore.add(ChatColor.YELLOW + "elle tue m�me les �tres sans vie");
		meta.setLore(lore);
		EDMV.setItemMeta(meta);
		
		net.minecraft.server.v1_10_R1.ItemStack nmsStack = org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack.asNMSCopy(EDMV);
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
     
        EDMV = CraftItemStack.asBukkitCopy(nmsStack);
		return EDMV;
	}
}
