package mod.objects.items.food;

import mod.Main;
import mod.init.ItemInit;
import mod.util.IHasModel;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel{
	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood) {
		super(amount, saturation, isAnimalFood);
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
