package net.vturnip.crystalmagicmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.vturnip.crystalmagicmod.CrystalMagicMod;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> BLUE_TRIISTONE_BATTERY = tag("blue_triistone_battery");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(CrystalMagicMod.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Items {
        public static class Blocks {
            private static TagKey<Item> tag(String name) {
                return ItemTags.create(new ResourceLocation(CrystalMagicMod.MOD_ID, name));
            }

            private static TagKey<Item> forgeTag(String name) {
                return ItemTags.create(new ResourceLocation("forge", name));
            }
        }
    }
}
