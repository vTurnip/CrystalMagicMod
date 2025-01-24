package net.vturnip.crystalmagicmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier RED_TRIISTONE = new ForgeTier(3,1400,1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.REDTRIISTONE.get()));
    public static final ForgeTier ORANGE_TRIISTONE = new ForgeTier(3,1400,1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ORANGETRIISTONE.get()));
    public static final ForgeTier YELLOW_TRIISTONE = new ForgeTier(3,1400,1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.YELLOWTRIISTONE.get()));
    public static final ForgeTier GREEN_TRIISTONE = new ForgeTier(3,1400,1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.GREENTRIISTONE.get()));
    public static final ForgeTier BLUE_TRIISTONE = new ForgeTier(3,1400,1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.BLUETRIISTONE.get()));
    public static final ForgeTier PURPLE_TRIISTONE = new ForgeTier(3,1400,1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.PURPLETRIISTONE.get()));
    public static final ForgeTier PINK_TRIISTONE = new ForgeTier(3,1400,1.5f,
            2f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.PINKTRIISTONE.get()));
}
