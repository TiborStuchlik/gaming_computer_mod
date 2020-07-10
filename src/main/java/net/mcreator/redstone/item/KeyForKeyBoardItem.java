
package net.mcreator.redstone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.redstone.itemgroup.GamingComputerModItemGroup;
import net.mcreator.redstone.RedstoneModElements;

@RedstoneModElements.ModElement.Tag
public class KeyForKeyBoardItem extends RedstoneModElements.ModElement {
	@ObjectHolder("redstone:key_for_key_board")
	public static final Item block = null;
	public KeyForKeyBoardItem(RedstoneModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GamingComputerModItemGroup.tab).maxStackSize(64));
			setRegistryName("key_for_key_board");
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
