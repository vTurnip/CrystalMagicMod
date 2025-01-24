package net.vturnip.crystalmagicmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CRYSTAL_MAGIC_TAB = new CreativeModeTab("crystalmagictab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REDTRIISTONE.get());

        }
    };
}
