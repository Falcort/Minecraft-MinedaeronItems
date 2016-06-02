package Items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_9_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_9_R1.NBTTagCompound;
import net.minecraft.server.v1_9_R1.NBTTagDouble;
import net.minecraft.server.v1_9_R1.NBTTagInt;
import net.minecraft.server.v1_9_R1.NBTTagList;
import net.minecraft.server.v1_9_R1.NBTTagString;

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
		meta.setDisplayName(ChatColor.WHITE + "Blâfarde");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Sais pas");
		meta.setLore(lore);
		Blafarde.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Blafarde);
        NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new NBTTagCompound();
        NBTTagList nbtTags = new NBTTagList();
        
        NBTTagCompound speed = new NBTTagCompound();
        speed.set("AttributeName", new NBTTagString("generic.attackSpeed"));
        speed.set("Name", new NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new NBTTagDouble(7));
        speed.set("Operation", new NBTTagInt(0));
        speed.set("UUIDLeast", new NBTTagInt(894654));
        speed.set("UUIDMost", new NBTTagInt(2872));
        speed.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(speed);
        
        NBTTagCompound damage = new NBTTagCompound();
        damage.set("AttributeName", new NBTTagString("generic.attackDamage"));
        damage.set("Name", new NBTTagString("generic.attackDamage"));
        damage.set("Amount", new NBTTagDouble(7));
        damage.set("Operation", new NBTTagInt(0));
        damage.set("UUIDLeast", new NBTTagInt(894654));
        damage.set("UUIDMost", new NBTTagInt(2872));
        damage.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(damage);
        
        NBTTagCompound health = new NBTTagCompound();
        health.set("AttributeName", new NBTTagString("generic.maxHealth"));
        health.set("Name", new NBTTagString("generic.maxHealth"));
        health.set("Amount", new NBTTagDouble(7));
        health.set("Operation", new NBTTagInt(0));
        health.set("UUIDLeast", new NBTTagInt(894654));
        health.set("UUIDMost", new NBTTagInt(2872));
        health.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(health);
        
        NBTTagCompound armor = new NBTTagCompound();
        armor.set("AttributeName", new NBTTagString("generic.armor"));
        armor.set("Name", new NBTTagString("generic.armor"));
        armor.set("Amount", new NBTTagDouble(7));
        armor.set("Operation", new NBTTagInt(0));
        armor.set("UUIDLeast", new NBTTagInt(894654));
        armor.set("UUIDMost", new NBTTagInt(2872));
        armor.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(armor);
        
        nbt.set("AttributeModifiers", nbtTags);
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
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Joyeuse);
        NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new NBTTagCompound();
        NBTTagList nbtTags = new NBTTagList();
        
        NBTTagCompound speed = new NBTTagCompound();
        speed.set("AttributeName", new NBTTagString("generic.attackSpeed"));
        speed.set("Name", new NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new NBTTagDouble(7));
        speed.set("Operation", new NBTTagInt(0));
        speed.set("UUIDLeast", new NBTTagInt(894654));
        speed.set("UUIDMost", new NBTTagInt(2872));
        speed.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(speed);
        
        NBTTagCompound damage = new NBTTagCompound();
        damage.set("AttributeName", new NBTTagString("generic.attackDamage"));
        damage.set("Name", new NBTTagString("generic.attackDamage"));
        damage.set("Amount", new NBTTagDouble(7));
        damage.set("Operation", new NBTTagInt(0));
        damage.set("UUIDLeast", new NBTTagInt(894654));
        damage.set("UUIDMost", new NBTTagInt(2872));
        damage.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(damage);
        
        NBTTagCompound health = new NBTTagCompound();
        health.set("AttributeName", new NBTTagString("generic.maxHealth"));
        health.set("Name", new NBTTagString("generic.maxHealth"));
        health.set("Amount", new NBTTagDouble(7));
        health.set("Operation", new NBTTagInt(0));
        health.set("UUIDLeast", new NBTTagInt(894654));
        health.set("UUIDMost", new NBTTagInt(2872));
        health.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(health);
        
        NBTTagCompound armor = new NBTTagCompound();
        armor.set("AttributeName", new NBTTagString("generic.armor"));
        armor.set("Name", new NBTTagString("generic.armor"));
        armor.set("Amount", new NBTTagDouble(7));
        armor.set("Operation", new NBTTagInt(0));
        armor.set("UUIDLeast", new NBTTagInt(894654));
        armor.set("UUIDMost", new NBTTagInt(2872));
        armor.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(armor);
        
        nbt.set("AttributeModifiers", nbtTags);
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
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Rare);
        NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new NBTTagCompound();
        NBTTagList nbtTags = new NBTTagList();
        
        NBTTagCompound speed = new NBTTagCompound();
        speed.set("AttributeName", new NBTTagString("generic.attackSpeed"));
        speed.set("Name", new NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new NBTTagDouble(7));
        speed.set("Operation", new NBTTagInt(0));
        speed.set("UUIDLeast", new NBTTagInt(894654));
        speed.set("UUIDMost", new NBTTagInt(2872));
        speed.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(speed);
        
        NBTTagCompound damage = new NBTTagCompound();
        damage.set("AttributeName", new NBTTagString("generic.attackDamage"));
        damage.set("Name", new NBTTagString("generic.attackDamage"));
        damage.set("Amount", new NBTTagDouble(7));
        damage.set("Operation", new NBTTagInt(0));
        damage.set("UUIDLeast", new NBTTagInt(894654));
        damage.set("UUIDMost", new NBTTagInt(2872));
        damage.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(damage);
        
        NBTTagCompound health = new NBTTagCompound();
        health.set("AttributeName", new NBTTagString("generic.maxHealth"));
        health.set("Name", new NBTTagString("generic.maxHealth"));
        health.set("Amount", new NBTTagDouble(7));
        health.set("Operation", new NBTTagInt(0));
        health.set("UUIDLeast", new NBTTagInt(894654));
        health.set("UUIDMost", new NBTTagInt(2872));
        health.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(health);
        
        NBTTagCompound armor = new NBTTagCompound();
        armor.set("AttributeName", new NBTTagString("generic.armor"));
        armor.set("Name", new NBTTagString("generic.armor"));
        armor.set("Amount", new NBTTagDouble(7));
        armor.set("Operation", new NBTTagInt(0));
        armor.set("UUIDLeast", new NBTTagInt(894654));
        armor.set("UUIDMost", new NBTTagInt(2872));
        armor.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(armor);
        
        nbt.set("AttributeModifiers", nbtTags);
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
		lore.add(ChatColor.YELLOW + "Epée du guerrie déchu Mor'Ladim");
		meta.setLore(lore);
		Archeus.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Archeus);
        NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new NBTTagCompound();
        NBTTagList nbtTags = new NBTTagList();
        
        NBTTagCompound speed = new NBTTagCompound();
        speed.set("AttributeName", new NBTTagString("generic.attackSpeed"));
        speed.set("Name", new NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new NBTTagDouble(7));
        speed.set("Operation", new NBTTagInt(0));
        speed.set("UUIDLeast", new NBTTagInt(894654));
        speed.set("UUIDMost", new NBTTagInt(2872));
        speed.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(speed);
        
        NBTTagCompound damage = new NBTTagCompound();
        damage.set("AttributeName", new NBTTagString("generic.attackDamage"));
        damage.set("Name", new NBTTagString("generic.attackDamage"));
        damage.set("Amount", new NBTTagDouble(7));
        damage.set("Operation", new NBTTagInt(0));
        damage.set("UUIDLeast", new NBTTagInt(894654));
        damage.set("UUIDMost", new NBTTagInt(2872));
        damage.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(damage);
        
        NBTTagCompound health = new NBTTagCompound();
        health.set("AttributeName", new NBTTagString("generic.maxHealth"));
        health.set("Name", new NBTTagString("generic.maxHealth"));
        health.set("Amount", new NBTTagDouble(7));
        health.set("Operation", new NBTTagInt(0));
        health.set("UUIDLeast", new NBTTagInt(894654));
        health.set("UUIDMost", new NBTTagInt(2872));
        health.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(health);
        
        NBTTagCompound armor = new NBTTagCompound();
        armor.set("AttributeName", new NBTTagString("generic.armor"));
        armor.set("Name", new NBTTagString("generic.armor"));
        armor.set("Amount", new NBTTagDouble(7));
        armor.set("Operation", new NBTTagInt(0));
        armor.set("UUIDLeast", new NBTTagInt(894654));
        armor.set("UUIDMost", new NBTTagInt(2872));
        armor.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(armor);
        
        nbt.set("AttributeModifiers", nbtTags);
        nmsStack.setTag(nbt);
     
        Archeus = CraftItemStack.asBukkitCopy(nmsStack);
		return Archeus;
	}
	
	/**
	 * JavaDoc createEDMV
	 * This methode create a common sword name "Epée des milles véritées"
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
		meta.setDisplayName(ChatColor.GOLD + "Epée des milles véritées");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Prédite par Salzman");
		lore.add(ChatColor.YELLOW + "elle tue même les êtres sans vie");
		meta.setLore(lore);
		EDMV.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(EDMV);
        NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new NBTTagCompound();
        NBTTagList nbtTags = new NBTTagList();
        
        NBTTagCompound speed = new NBTTagCompound();
        speed.set("AttributeName", new NBTTagString("generic.attackSpeed"));
        speed.set("Name", new NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new NBTTagDouble(10));
        speed.set("Operation", new NBTTagInt(0));
        speed.set("UUIDLeast", new NBTTagInt(894654));
        speed.set("UUIDMost", new NBTTagInt(2872));
        speed.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(speed);
        
        NBTTagCompound damage = new NBTTagCompound();
        damage.set("AttributeName", new NBTTagString("generic.attackDamage"));
        damage.set("Name", new NBTTagString("generic.attackDamage"));
        damage.set("Amount", new NBTTagDouble(10));
        damage.set("Operation", new NBTTagInt(0));
        damage.set("UUIDLeast", new NBTTagInt(894654));
        damage.set("UUIDMost", new NBTTagInt(2872));
        damage.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(damage);
        
        NBTTagCompound health = new NBTTagCompound();
        health.set("AttributeName", new NBTTagString("generic.maxHealth"));
        health.set("Name", new NBTTagString("generic.maxHealth"));
        health.set("Amount", new NBTTagDouble(10));
        health.set("Operation", new NBTTagInt(0));
        health.set("UUIDLeast", new NBTTagInt(894654));
        health.set("UUIDMost", new NBTTagInt(2872));
        health.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(health);
        
        NBTTagCompound armor = new NBTTagCompound();
        armor.set("AttributeName", new NBTTagString("generic.armor"));
        armor.set("Name", new NBTTagString("generic.armor"));
        armor.set("Amount", new NBTTagDouble(10));
        armor.set("Operation", new NBTTagInt(0));
        armor.set("UUIDLeast", new NBTTagInt(894654));
        armor.set("UUIDMost", new NBTTagInt(2872));
        armor.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(armor);
        
        nbt.set("AttributeModifiers", nbtTags);
        nmsStack.setTag(nbt);
     
        EDMV = CraftItemStack.asBukkitCopy(nmsStack);
		return EDMV;
	}
}
