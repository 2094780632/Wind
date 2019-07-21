package edgecho.wind.common;

import edgecho.wind.common.block.WindBlocks;
import edgecho.wind.common.item.WindItems;
import edgecho.wind.common.world.gen.OreGenEventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
    	WindItems.init();
    	WindBlocks.init();
    }
    
    public void init(FMLInitializationEvent event)
    {
    	WindItems.addSmelting();
    	OreGenEventHandler.init();
    }
}