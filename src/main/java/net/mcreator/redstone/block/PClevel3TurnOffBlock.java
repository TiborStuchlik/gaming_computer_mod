
package net.mcreator.redstone.block;

import net.minecraft.block.material.Material;

@RedstoneModElements.ModElement.Tag
public class PClevel3TurnOffBlock extends RedstoneModElements.ModElement {

	@ObjectHolder("redstone:p_clevel_3_turn_off")
	public static final Block block = null;

	public PClevel3TurnOffBlock(RedstoneModElements instance) {
		super(instance, 39);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(GamingComputerModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("p_clevel_3_turn_off");
		}

		@Override
		public boolean canConnectRedstone(BlockState state, IBlockReader world, BlockPos pos, Direction side) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
