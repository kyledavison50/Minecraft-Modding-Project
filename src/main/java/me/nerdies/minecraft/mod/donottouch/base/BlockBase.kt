package me.nerdies.minecraft.mod.donottouch.base

import me.nerdies.minecraft.mod.donottouch.Nerdiesmod
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.Item
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing
import net.minecraft.util.EnumHand
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World


open class BlockBase(material: Material, var name: String) : Block(material)
{
    init
    {
        setRegistryName(name)
        translationKey = name
        super.setCreativeTab(Nerdiesmod.creativeTab)
    }

    fun registerItemModel(itemBlock: Item)
    {
        Nerdiesmod.proxy.registerItemRenderer(itemBlock, 0, name)
    }

    fun createItemBlock(): Item
    {
        return ItemBlock(this).setRegistryName(registryName)
    }
}