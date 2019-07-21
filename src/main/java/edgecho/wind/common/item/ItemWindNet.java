package edgecho.wind.common.item;

import edgecho.wind.common.creativetab.CreativeTabsWind;
import edgecho.wind.common.item.WindItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemCarrotOnAStick;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;


public class ItemWindNet extends Item{
	public ItemWindNet() {
		super();
		setMaxStackSize(1);
		setMaxDamage(25);
		setNoRepair();
		this.setCreativeTab(CreativeTabsWind.tabWind);
	}
	    @Override
	    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer playerIn, EnumHand handIn) {
	    	playerIn.addItemStackToInventory(new ItemStack(WindItems.pneumatic_air, 1));
	    	ItemStack itemstack = playerIn.getHeldItem(handIn);
	    	itemstack.damageItem(1, playerIn);
	    	return super.onItemRightClick(world, playerIn, handIn);   
	    }
}
