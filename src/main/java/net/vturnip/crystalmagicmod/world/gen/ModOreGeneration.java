package net.vturnip.crystalmagicmod.world.gen;

import net.vturnip.crystalmagicmod.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeatures.RED_TRIISTONE_ORE_PLACED);
        base.add(ModPlacedFeatures.ORANGE_TRIISTONE_ORE_PLACED);
        base.add(ModPlacedFeatures.YELLOW_TRIISTONE_ORE_PLACED);
        base.add(ModPlacedFeatures.GREEN_TRIISTONE_ORE_PLACED);
        base.add(ModPlacedFeatures.BLUE_TRIISTONE_ORE_PLACED);
        base.add(ModPlacedFeatures.PURPLE_TRIISTONE_ORE_PLACED);
        base.add(ModPlacedFeatures.PINK_TRIISTONE_ORE_PLACED);
    }
}
