package edgecho.wind.common.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WindBlocks {
	
	public static Block Blockcloudcrystal = new Blockcloudcrystal().setUnlocalizedName("cloudcrystal");
	public static Block BlockSilver = new BlockSilver().setUnlocalizedName("silver_ore");

	public static void init() {
		ForgeRegistries.BLOCKS.register(Blockcloudcrystal.setRegistryName("cloudcrystal"));
		ForgeRegistries.ITEMS.register(new ItemBlock(Blockcloudcrystal).setRegistryName(Blockcloudcrystal.getRegistryName()));
		ForgeRegistries.BLOCKS.register(BlockSilver.setRegistryName("silver_ore"));
		ForgeRegistries.ITEMS.register(new ItemBlock(BlockSilver).setRegistryName(BlockSilver.getRegistryName()));
	}
	
	@SideOnly(Side.CLIENT)
	public static void ClientInit() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(Blockcloudcrystal), 0, 
	            new ModelResourceLocation(Blockcloudcrystal.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(BlockSilver), 0, 
	            new ModelResourceLocation(BlockSilver.getRegistryName(), "inventory"));

	}
}
