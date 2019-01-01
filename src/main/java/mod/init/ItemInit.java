package mod.init;

import java.util.ArrayList;
import java.util.List;

import mod.objects.items.Cocaine;
import mod.objects.items.ColaClosed;
import mod.objects.items.ItemBase;
import mod.objects.items.food.FoodBase;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemInit {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Food
	public static final Item COLA = new FoodBase("cola", 6, 7.0f, true) {
		@Override
		public EnumAction getItemUseAction(ItemStack stack)
	    {
	        return EnumAction.DRINK;
	    }
	};
	
	//Items
	public static final Item COLA_CLOSED = new ColaClosed("cola_closed");
	public static final Item COCAINE = new Cocaine("cocaine");
}
