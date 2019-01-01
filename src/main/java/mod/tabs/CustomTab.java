package mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CustomTab extends CreativeTabs{
	public CustomTab(String label) {
		super(label);
		//this.setBackgroundImageName("modtab.png"); //Add if wanted, kept here as a note
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.COAL);
	}
}
