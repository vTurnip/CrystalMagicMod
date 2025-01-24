package net.vturnip.crystalmagicmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {

    public static final Holder<PlacedFeature> RED_TRIISTONE_ORE_PLACED = PlacementUtils.register("red_triistone_ore_placed",
            ModConfiguredFeatures.RED_TRIISTONE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> ORANGE_TRIISTONE_ORE_PLACED = PlacementUtils.register("orange_triistone_ore_placed",
            ModConfiguredFeatures.ORANGE_TRIISTONE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> YELLOW_TRIISTONE_ORE_PLACED = PlacementUtils.register("yellow_triistone_ore_placed",
            ModConfiguredFeatures.YELLOW_TRIISTONE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> GREEN_TRIISTONE_ORE_PLACED = PlacementUtils.register("green_triistone_ore_placed",
            ModConfiguredFeatures.GREEN_TRIISTONE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> BLUE_TRIISTONE_ORE_PLACED = PlacementUtils.register("blue_triistone_ore_placed",
            ModConfiguredFeatures.BLUE_TRIISTONE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> PURPLE_TRIISTONE_ORE_PLACED = PlacementUtils.register("purple_triistone_ore_placed",
            ModConfiguredFeatures.PURPLE_TRIISTONE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> PINK_TRIISTONE_ORE_PLACED = PlacementUtils.register("pink_triistone_ore_placed",
            ModConfiguredFeatures.PINK_TRIISTONE_ORE, ModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

}