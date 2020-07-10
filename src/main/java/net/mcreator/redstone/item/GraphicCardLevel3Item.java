
package net.mcreator.redstone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.redstone.itemgroup.GamingComputerModItemGroup;
import net.mcreator.redstone.RedstoneModElements;

@RedstoneModElements.ModElement.Tag
public class GraphicCardLevel3Item extends RedstoneModElements.ModElement {
	@ObjectHolder("redstone:graphic_card_level_3")
	public static final Item block = null;
	public GraphicCardLevel3Item(RedstoneModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GamingComputerModItemGroup.tab).maxStackSize(64));
			setRegistryName("graphic_card_level_3");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
