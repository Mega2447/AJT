package mod.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CokeLines extends BlockBase
{
	public static final AxisAlignedBB COKE_LINES_AABB = new AxisAlignedBB(0, 0, 0, 1D, 0.0625D, 1D);
	
	public CokeLines(String name) 
	{
		super(name, Material.WEB);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return COKE_LINES_AABB;
	}
}


