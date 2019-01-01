package mod.objects.blocks;

import mod.Main;
import mod.init.BlockInit;
import mod.init.ItemInit;
import mod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	
	
	public BlockBase(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modTab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
