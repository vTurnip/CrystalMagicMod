package net.vturnip.crystalmagicmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.vturnip.crystalmagicmod.block.ModBlocks;

import java.util.List;


public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_RED_TRIISTONE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RED_TRIISTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_RED_TRIISTONE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> RED_TRIISTONE_ORE = FeatureUtils.register("red_triistone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_RED_TRIISTONE_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_ORANGE_TRIISTONE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORANGE_TRIISTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ORANGE_TRIISTONE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ORANGE_TRIISTONE_ORE = FeatureUtils.register("orange_triistone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_ORANGE_TRIISTONE_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_YELLOW_TRIISTONE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.YELLOW_TRIISTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_YELLOW_TRIISTONE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> YELLOW_TRIISTONE_ORE = FeatureUtils.register("yellow_triistone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_YELLOW_TRIISTONE_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_GREEN_TRIISTONE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.GREEN_TRIISTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_GREEN_TRIISTONE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GREEN_TRIISTONE_ORE = FeatureUtils.register("green_triistone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_GREEN_TRIISTONE_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_BLUE_TRIISTONE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.BLUE_TRIISTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_BLUE_TRIISTONE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BLUE_TRIISTONE_ORE = FeatureUtils.register("blue_triistone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_BLUE_TRIISTONE_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PURPLE_TRIISTONE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PURPLE_TRIISTONE_BLOCK.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_PURPLE_TRIISTONE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PURPLE_TRIISTONE_ORE = FeatureUtils.register("purple_triistone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PURPLE_TRIISTONE_ORES, 9));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PINK_TRIISTONE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PINK_TRIISTONE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_PINK_TRIISTONE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PINK_TRIISTONE_ORE = FeatureUtils.register("pink_triistone_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PINK_TRIISTONE_ORES, 9));

}
