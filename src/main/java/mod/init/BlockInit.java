package mod.init;

import java.util.ArrayList;
import java.util.List;

import mod.objects.blocks.ColaBox;
import net.minecraft.block.Block;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COLA_BOX = new ColaBox("cola_box");
}
