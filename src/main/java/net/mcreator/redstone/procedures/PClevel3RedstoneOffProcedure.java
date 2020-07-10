package net.mcreator.redstone.procedures;

@RedstoneModElements.ModElement.Tag
public class PClevel3RedstoneOffProcedure extends RedstoneModElements.ModElement {

	public PClevel3RedstoneOffProcedure(RedstoneModElements instance) {
		super(instance, 41);

	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PClevel3RedstoneOff!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PClevel3RedstoneOff!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PClevel3RedstoneOff!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PClevel3RedstoneOff!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), PClevel3TurnOffBlock.block.getDefaultState(), 3);

	}

}
