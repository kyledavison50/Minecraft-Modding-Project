package me.nerdies.minecraft.mod.mymod.smelting

import me.nerdies.minecraft.mod.mymod.registration.ModBlocks
import me.nerdies.minecraft.mod.mymod.registration.ModItems
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.registry.GameRegistry

object Smelting
{
    fun getRecipes()
    {
        GameRegistry.addSmelting(ModBlocks.oreCopper, ItemStack(ModItems.copperIngot), 2f)
    }
}