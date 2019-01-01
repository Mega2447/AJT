package mod.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class ColaBox extends BlockBase{

	public ColaBox(String name) {
		super(name, Material.WOOD);
		
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}
