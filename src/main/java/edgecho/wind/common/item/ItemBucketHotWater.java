package edgecho.wind.common.item;

import net.minecraft.item.ItemFood;

import edgecho.wind.common.creativetab.CreativeTabsWind;

public class ItemBucketHotWater extends ItemFood{
	public ItemBucketHotWater() {
		super(1, 0.2F, false);
        this.setAlwaysEdible();
        this.setCreativeTab(CreativeTabsWind.tabWind);
	}
}
