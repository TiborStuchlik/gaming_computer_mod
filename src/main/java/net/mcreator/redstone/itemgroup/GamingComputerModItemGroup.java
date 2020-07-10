
package net.mcreator.redstone.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.redstone.block.MonitorBlock;
import net.mcreator.redstone.RedstoneModElements;

@RedstoneModElements.ModElement.Tag
public class GamingComputerModItemGroup extends RedstoneModElements.ModElement {
	public GamingComputerModItemGroup(RedstoneModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgaming_computer_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MonitorBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
