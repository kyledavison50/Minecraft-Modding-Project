package me.nerdies.minecraft.mod.mymod.smelting

import me.nerdies.minecraft.mod.mymod.registration.ModBlocks
import me.nerdies.minecraft.mod.mymod.registration.ModItems
import net.minecraft.client.Minecraft
import net.minecraft.init.Blocks
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.registry.GameRegistry

object Smelting
{
    fun getRecipes()
    {
        GameRegistry.addSmelting(ModBlocks.oreCopper, ItemStack(ModItems.copperIngot), 2f)
        GameRegistry.addSmelting(Blocks.LEVER, ItemStack(Items.BAKED_POTATO, 5), 40f)
    }
}