package edgecho.wind.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import edgecho.wind.common.block.WindBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraftforge.client.model.ModelLoader;

public class WindItems
{
    public static Item Aeolus = new Aeolus().setUnlocalizedName("Aeolus");
    public static Item cloud = new Itemcloud().setUnlocalizedName("Cloud");
    public static Item wind_net = new ItemWindNet().setUnlocalizedName("wind_net");
    public static Item magic_feather = new ItemMagicFeather().setUnlocalizedName("magic_feather");
    public static Item magic_mineral = new ItemMagicMineral().setUnlocalizedName("magic_mineral");
    public static Item magic_ingot = new ItemMagicIngot().setUnlocalizedName("magic_ingot");
    public static Item magic_stick = new ItemMagicStick().setUnlocalizedName("magic_stick");
    public static Item silver_ingot = new ItemSilverIngot().setUnlocalizedName("silver_ingot");
    public static Item bucket_hot_water = new ItemBucketHotWater().setUnlocalizedName("bucket_hot_water");
    public static Item pneumatic_air = new ItemPneumaticAir().setUnlocalizedName("pneumatic_air");
    
    public static void init()
    {
        ForgeRegistries.ITEMS.register(Aeolus.setRegistryName("Aeolus"));
        ForgeRegistries.ITEMS.register(cloud.setRegistryName("Cloud"));
        ForgeRegistries.ITEMS.register(wind_net.setRegistryName("wind_net"));
        ForgeRegistries.ITEMS.register(magic_feather.setRegistryName("magic_feather"));
        ForgeRegistries.ITEMS.register(magic_mineral.setRegistryName("magic_mineral"));
        ForgeRegistries.ITEMS.register(magic_ingot.setRegistryName("magic_ingot"));
        ForgeRegistries.ITEMS.register(magic_stick.setRegistryName("magic_stick"));
        ForgeRegistries.ITEMS.register(silver_ingot.setRegistryName("silver_ingot"));
        ForgeRegistries.ITEMS.register(bucket_hot_water.setRegistryName("bucket_hot_water"));
        ForgeRegistries.ITEMS.register(pneumatic_air.setRegistryName("pneumatic_air"));
        OreDictionary.registerOre("ingotSilver", silver_ingot);
    }
    
    @SideOnly(Side.CLIENT)
    public static void ClientInit(){
    	ModelLoader.setCustomModelResourceLocation(Aeolus, 0, 
                new ModelResourceLocation(Aeolus.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(cloud, 0, 
                new ModelResourceLocation(cloud.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(wind_net, 0, 
                new ModelResourceLocation(wind_net.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(magic_feather, 0, 
                new ModelResourceLocation(magic_feather.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(magic_mineral, 0, 
                new ModelResourceLocation(magic_mineral.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(magic_ingot, 0, 
                new ModelResourceLocation(magic_ingot.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(magic_stick, 0, 
                new ModelResourceLocation(magic_stick.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(silver_ingot, 0, 
                new ModelResourceLocation(silver_ingot.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(bucket_hot_water, 0, 
                new ModelResourceLocation(bucket_hot_water.getRegistryName(), "inventory"));
    	ModelLoader.setCustomModelResourceLocation(pneumatic_air, 0, 
                new ModelResourceLocation(pneumatic_air.getRegistryName(), "inventory"));
    	
    }
    public static void addSmelting() {
    	GameRegistry.addSmelting(WindBlocks.BlockSilver, new ItemStack(silver_ingot), 0.5f);
    	GameRegistry.addSmelting(WindItems.magic_mineral, new ItemStack(magic_ingot), 0.5f);
    	GameRegistry.addSmelting(Items.WATER_BUCKET, new ItemStack(bucket_hot_water), 0.5f);
    }
    
}

/*
 * package edgecho.wind.common.item;

import net.minecraftforge.fml.common.registry.*;

public class WindItems {
	public static void init()
	{
		ForgeRegistries.ITEMS.register(new Aeolus().setRegistryName("Aeolus"));
	}
}


package edgecho.wind.common.item;

import edgecho.wind.common.creativetab.CreativeTabsWind;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

package edgecho.wind.common.item;

import edgecho.wind.common.creativetab.CreativeTabsWind;
import net.minecraft.item.Item;

public class Itemcloud extends Item{
	public Itemcloud() {
		super();
		this.setCreativeTab(CreativeTabsWind.tabWind);
	}
}

*/