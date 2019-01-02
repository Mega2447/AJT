package mod.objects.items;

import mod.init.BlockInit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Cocaine extends ItemBase {

	public Cocaine(String name) {
		super(name);
	}
	
	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack itemstack = player.getHeldItem(hand);
		BlockPos pos2 = pos.up();
		
		if(worldIn.isAirBlock(pos2)) {
			worldIn.setBlockState(pos2, BlockInit.COKE_LINES.getDefaultState());
			return EnumActionResult.SUCCESS;
		}
		else {
			System.out.println("Can only be used on blocks with air over them");
			return EnumActionResult.FAIL;
		}
	}
}
