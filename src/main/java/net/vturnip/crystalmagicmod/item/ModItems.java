package net.vturnip.crystalmagicmod.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vturnip.crystalmagicmod.CrystalMagicMod;
import net.vturnip.crystalmagicmod.item.custom.*;

import static net.minecraftforge.registries.ForgeRegistries.ITEMS;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ITEMS, CrystalMagicMod.MOD_ID);

    public static final RegistryObject<Item> RAWREDTRIISTONE = Items.register("raw_red_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> RAWORANGETRIISTONE = Items.register("raw_orange_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> RAWYELLOWTRIISTONE = Items.register("raw_yellow_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> RAWGREENTRIISTONE = Items.register("raw_green_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> RAWBLUETRIISTONE = Items.register("raw_blue_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> RAWPURPLETRIISTONE = Items.register("raw_purple_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> RAWPINKTRIISTONE = Items.register("raw_pink_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> REDTRIISTONE = Items.register("red_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> ORANGETRIISTONE = Items.register("orange_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> YELLOWTRIISTONE = Items.register("yellow_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> GREENTRIISTONE = Items.register("green_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> BLUETRIISTONE = Items.register("blue_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> PURPLETRIISTONE = Items.register("purple_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> PINKTRIISTONE = Items.register("pink_triistone",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> REDTRIISTONEBATTERY = Items.register("red_triistone_battery",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> EMPTYTRIISTONEBATTERY = Items.register("empty_triistone_battery",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> ORANGETRIISTONEBATTERY = Items.register("orange_triistone_battery",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> YELLOWTRIISTONEBATTERY = Items.register("yellow_triistone_battery",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> GREENTRIISTONEBATTERY = Items.register("green_triistone_battery",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> BLUETRIISTONEBATTERY = Items.register("blue_triistone_battery",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> PURPLETRIISTONEBATTERY = Items.register("purple_triistone_battery",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> PINKTRIISTONEBATTERY = Items.register("pink_triistone_battery",
            () -> new Item(new Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> REDTRIISTONESWORD = Items.register("red_triistone_sword",
            () ->new FireSwordItem(ModTiers.RED_TRIISTONE, 2, 3F,
                new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> ORANGETRIISTONESWORD = Items.register("orange_triistone_sword",
            () ->new GlowingSwordItem(ModTiers.ORANGE_TRIISTONE, 2, 3F,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> YELLOWTRIISTONESWORD = Items.register("yellow_triistone_sword",
            () ->new BlindnessSwordItem(ModTiers.YELLOW_TRIISTONE, 2, 3F,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> GREENTRIISTONESWORD = Items.register("green_triistone_sword",
            () ->new LevitationSwordItem(ModTiers.GREEN_TRIISTONE, 2, 3F,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> BLUETRIISTONESWORD = Items.register("blue_triistone_sword",
            () ->new FreezeSwordItem(ModTiers.BLUE_TRIISTONE, 2, 3F,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> PURPLETRIISTONESWORD = Items.register("purple_triistone_sword",
            () ->new PoisonSwordItem(ModTiers.PURPLE_TRIISTONE, 2, 3F,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> PINKTRIISTONESWORD = Items.register("pink_triistone_sword",
            () ->new WeaknessSwordItem(ModTiers.PINK_TRIISTONE, 2, 3F,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));

    public static final RegistryObject<Item> UNPOWEREDTRIISTONESWORD = Items.register("unpowered_triistone_sword",
            () ->new SwordItem(Tiers.STONE, 1, 2F,
                    new Item.Properties().tab(ModCreativeModeTab.CRYSTAL_MAGIC_TAB)));


    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }

}
