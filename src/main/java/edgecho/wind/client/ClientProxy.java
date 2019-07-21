package edgecho.wind.client;

import edgecho.wind.common.CommonProxy;
import edgecho.wind.common.block.WindBlocks;
import edgecho.wind.common.item.WindItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
        WindItems.ClientInit();
        WindBlocks.ClientInit();
    }
    
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }
}