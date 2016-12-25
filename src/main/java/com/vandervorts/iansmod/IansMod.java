package com.vandervorts.iansmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = IansMod.MODID, version = IansMod.VERSION)
public class IansMod
{
    public static final String MODID = "iansmod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("Aaron rocks the dirt >> "+Blocks.DIRT.getUnlocalizedName());
    }
}
