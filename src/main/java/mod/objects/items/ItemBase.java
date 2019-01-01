package mod.objects.items;

import mod.Main;
import mod.init.ItemInit;
import mod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.modTab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
