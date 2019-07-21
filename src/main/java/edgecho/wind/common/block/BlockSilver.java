package edgecho.wind.common.block;

import edgecho.wind.common.creativetab.CreativeTabsWind;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;

public class BlockSilver extends Block{
	public BlockSilver() {
		super(Material.ROCK);
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.0f);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(CreativeTabsWind.tabWind);
	}
}
