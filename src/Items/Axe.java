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

public class Axe
{
	/**
	 * JavaDoc createOkin
	 * This methode create a common sword name "Okin"
	 * 
	 * @return Okin
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createOkin()
	{
		ItemStack Okin = new ItemStack(Material.DIAMOND_AXE, 1, (short)1);
		ItemMeta meta = Okin.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.WHITE + "Okin");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Sais pas");
		meta.setLore(lore);
		Okin.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Okin);
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
     
        Okin = CraftItemStack.asBukkitCopy(nmsStack);
		return Okin;
	}
	
	/**
	 * JavaDoc createClavicus
	 * This methode create a uncommon sword name "Clavicus"
	 * 
	 * @return Clavicus
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createClavicus()
	{
		ItemStack Clavicus = new ItemStack(Material.DIAMOND_AXE, 1, (short)1);
		ItemMeta meta = Clavicus.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.DARK_GREEN + "Clavicus");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Sais pas");
		meta.setLore(lore);
		Clavicus.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Clavicus);
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
     
        Clavicus = CraftItemStack.asBukkitCopy(nmsStack);
		return Clavicus;
	}
	
	/**
	 * JavaDoc createFeralgide
	 * This methode create a rare sword name "Feralgide"
	 * 
	 * @return rare
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createFeralgide()
	{
		ItemStack Feralgide = new ItemStack(Material.DIAMOND_AXE, 1, (short)1);
		ItemMeta meta = Feralgide.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.BLUE + "Feralgide");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Feralgide");
		meta.setLore(lore);
		Feralgide.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Feralgide);
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
     
        Feralgide = CraftItemStack.asBukkitCopy(nmsStack);
		return Feralgide;
	}
	
	/**
	 * JavaDoc createRavageuse
	 * This methode create a common sword name "Ravageuse"
	 * 
	 * @return Ravageuse
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createRavageuse()
	{
		ItemStack Ravageuse = new ItemStack(Material.DIAMOND_AXE, 1, (short)1);
		ItemMeta meta = Ravageuse.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.DARK_PURPLE + "Ravageuse");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Epée du guerrie déchu Mor'Ladim");
		meta.setLore(lore);
		Ravageuse.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Ravageuse);
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
     
        Ravageuse = CraftItemStack.asBukkitCopy(nmsStack);
		return Ravageuse;
	}
	
	/**
	 * JavaDoc createEnsanglante
	 * This methode create a common sword name "Epée des milles véritées"
	 * 
	 * @return Ensanglante
	 * @author Falcort alias Thibault SOUQUET
	 * @version 0.2
	 */
	public static ItemStack createEnsanglante()
	{
		ItemStack Ensanglante = new ItemStack(Material.DIAMOND_AXE, 1, (short)1);
		ItemMeta meta = Ensanglante.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.GOLD + "Ensanglante");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Née de la tristesse et le sable");
		lore.add(ChatColor.YELLOW + "portée par de grands héros");
		meta.setLore(lore);
		Ensanglante.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Ensanglante);
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
     
        Ensanglante = CraftItemStack.asBukkitCopy(nmsStack);
		return Ensanglante;
	}
}
