package mod.objects.items;

import mod.init.ItemInit;
import mod.util.handlers.SoundsHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ColaClosed extends ItemBase{

	public ColaClosed(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		// TODO Auto-generated method stub
		ItemStack item = playerIn.getHeldItem(handIn);
		
		worldIn.playSound(playerIn, playerIn.getPosition().getX(), playerIn.getPosition().getY(), playerIn.getPosition().getZ(), SoundsHandler.COLA_POP, SoundCategory.PLAYERS, 50f, 0f);
		
		playerIn.inventory.addItemStackToInventory(new ItemStack(ItemInit.COLA));
		item.shrink(1);
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
