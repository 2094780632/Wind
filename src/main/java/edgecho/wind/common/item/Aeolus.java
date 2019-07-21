package edgecho.wind.common.item;

import edgecho.wind.common.creativetab.CreativeTabsWind;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.potion.PotionType;;

public class Aeolus extends ItemSword
{
    public Aeolus()
    {
        super(EnumHelper.addToolMaterial("SILVER", 4, 2000, 9.5F, 10.0F, 15));
		this.setCreativeTab(CreativeTabsWind.tabWind);
    }
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer playerIn, EnumHand handIn) {
    	ItemStack itemstack = playerIn.getHeldItem(handIn);
    	if(itemstack.getMaxDamage() - itemstack.getMetadata() >= 3) {
    		itemstack.damageItem(3, playerIn);
    		playerIn.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 150, 0));
    		playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 300, 1));
    	}
    	return super.onItemRightClick(world, playerIn, handIn);
    }
}