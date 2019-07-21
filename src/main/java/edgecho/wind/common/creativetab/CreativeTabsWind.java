package edgecho.wind.common.creativetab;

import edgecho.wind.common.item.WindItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsWind extends CreativeTabs{
	public static CreativeTabsWind tabWind = new CreativeTabsWind();
    
    public CreativeTabsWind()
    {
        super("Wind");
    }

    public ItemStack getTabIconItem()
    {
        return new ItemStack(WindItems.cloud);
    }
}
