package me.nerdies.minecraft.mod.mymod.blocks

import me.nerdies.minecraft.mod.donottouch.base.BlockBase
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.util.EnumFacing
import net.minecraft.util.EnumHand
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World



class CopperOre : BlockBase(Material.ROCK, "ore_copper")
{
    //Makes block explode when activated (right clicked)
    override fun onBlockActivated(worldIn: World, pos: BlockPos, state: IBlockState, playerIn: EntityPlayer, hand: EnumHand, facing: EnumFacing, hitX: Float, hitY: Float, hitZ: Float): Boolean
    {
        worldIn.createExplosion(null,  pos.x.toDouble(), pos.y.toDouble(), pos.z.toDouble(), 3f,true)
        worldIn.setBlockToAir(pos)
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ)
    }
}