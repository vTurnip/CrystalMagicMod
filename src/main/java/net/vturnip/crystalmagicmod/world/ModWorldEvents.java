package net.vturnip.crystalmagicmod.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.vturnip.crystalmagicmod.CrystalMagicMod;
import net.vturnip.crystalmagicmod.world.gen.ModOreGeneration;

@Mod.EventBusSubscriber(modid = CrystalMagicMod.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }

}
