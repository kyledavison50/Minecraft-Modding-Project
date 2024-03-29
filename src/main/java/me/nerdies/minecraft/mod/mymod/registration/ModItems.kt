package me.nerdies.minecraft.mod.mymod.registration


import me.nerdies.minecraft.mod.donottouch.registration.RegisterItems
import me.nerdies.minecraft.mod.mymod.armor.*
import me.nerdies.minecraft.mod.mymod.items.CopperIngot
import me.nerdies.minecraft.mod.mymod.weapons.CopperSword
import me.nerdies.minecraft.mod.mymod.items.Corn

// 1) Register the item here
// 2) Place your texture in resources/assets/nerdiesmod/textures/items/TextureName.png
// 3) Create a JSON for the texture(copying and pasting with slight modification is ok)
// 4) Configure the translation key in en_US.lang
object ModItems : RegisterItems()
{
    val copperIngot = CopperIngot()
    val copperSword = CopperSword()
    val copperHelmet = CopperHelmet()
    val copperChestplate = CopperChestplate()
    val copperLeggings = CopperLeggings()
    val copperBoots = CopperBoots()
    val corn = Corn()

    init
    {
        itemList.add(copperIngot)
        itemList.add(copperSword)
        itemList.add(copperHelmet)
        itemList.add(copperChestplate)
        itemList.add(copperLeggings)
        itemList.add(copperBoots)
        itemList.add(corn)
    }
}