package edgecho.wind;

import org.apache.logging.log4j.Logger;

import edgecho.wind.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = wind.MODID, name=wind.NAME, version=wind.VERSION)
public class wind
{
	public static final String MODID = "wind";
    public static final String NAME = "Wind";
    public static final String VERSION = "1.0.0";
    
    @SidedProxy(clientSide = "edgecho.wind.client.ClientProxy", 
            serverSide = "edgecho.wind.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @Instance(MODID)
    public static wind instance;
    private Logger logger;
    
    public Logger getLogger()
    {
        return logger;
    }
}