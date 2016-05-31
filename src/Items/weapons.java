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

public class weapons
{
	public static ItemStack createEnsanglante()
	{
		ItemStack Ensanglante = new ItemStack(Material.DIAMOND_AXE, 1, (short)1);
		ItemMeta meta = Ensanglante.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.GOLD + "Ensanglante");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Cette hache lie Briseu et Falcort");
		meta.setLore(lore);
		Ensanglante.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Ensanglante);
        NBTTagCompound nbt = nmsStack.hasTag() ? nmsStack.getTag() : new NBTTagCompound();
        NBTTagList nbtTags = new NBTTagList();
        
        NBTTagCompound speed = new NBTTagCompound();
        speed.set("AttributeName", new NBTTagString("generic.attackSpeed"));
        speed.set("Name", new NBTTagString("generic.attackSpeed"));
        speed.set("Amount", new NBTTagDouble(100));
        speed.set("Operation", new NBTTagInt(0));
        speed.set("UUIDLeast", new NBTTagInt(894654));
        speed.set("UUIDMost", new NBTTagInt(2872));
        speed.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(speed);
        
        NBTTagCompound damage = new NBTTagCompound();
        damage.set("AttributeName", new NBTTagString("generic.attackDamage"));
        damage.set("Name", new NBTTagString("generic.attackDamage"));
        damage.set("Amount", new NBTTagDouble(100));
        damage.set("Operation", new NBTTagInt(0));
        damage.set("UUIDLeast", new NBTTagInt(894654));
        damage.set("UUIDMost", new NBTTagInt(2872));
        damage.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(damage);
        
        NBTTagCompound health = new NBTTagCompound();
        health.set("AttributeName", new NBTTagString("generic.maxHealth"));
        health.set("Name", new NBTTagString("generic.maxHealth"));
        health.set("Amount", new NBTTagDouble(2));
        health.set("Operation", new NBTTagInt(0));
        health.set("UUIDLeast", new NBTTagInt(894654));
        health.set("UUIDMost", new NBTTagInt(2872));
        health.set("Slot", new NBTTagString("mainhand"));
        nbtTags.add(health);
        
        NBTTagCompound armor = new NBTTagCompound();
        armor.set("AttributeName", new NBTTagString("generic.armor"));
        armor.set("Name", new NBTTagString("generic.armor"));
        armor.set("Amount", new NBTTagDouble(2));
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
	
	public static ItemStack createDeuillegivre()
	{
		ItemStack Deuillegivre = new ItemStack(Material.DIAMOND_SWORD, 1, (short)1);
		ItemMeta meta = Deuillegivre.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.setDisplayName(ChatColor.GOLD + "Deuillegivre");
		meta.addItemFlags();
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.YELLOW + "Cette épée à le pouvoir de dévorer l'âme de ses victimes");
		meta.setLore(lore);
		Deuillegivre.setItemMeta(meta);
		
		net.minecraft.server.v1_9_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(Deuillegivre);
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
     
        Deuillegivre = CraftItemStack.asBukkitCopy(nmsStack);
		return Deuillegivre;
	}
}
