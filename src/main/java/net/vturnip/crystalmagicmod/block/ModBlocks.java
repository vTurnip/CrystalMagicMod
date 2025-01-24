package net.vturnip.crystalmagicmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vturnip.crystalmagicmod.CrystalMagicMod;
import net.vturnip.crystalmagicmod.item.ModCreativeModeTab;
import net.vturnip.crystalmagicmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrystalMagicMod.MOD_ID);

    public static final RegistryObject<Block> RED_TRIISTONE_BLOCK = registerBlock("red_triistone_block",
            () -> new Block (BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> ORANGE_TRIISTONE_BLOCK = registerBlock("orange_triistone_block",
            () -> new Block (BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> YELLOW_TRIISTONE_BLOCK = registerBlock("yellow_triistone_block",
            () -> new Block (BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> GREEN_TRIISTONE_BLOCK = registerBlock("green_triistone_block",
            () -> new Block (BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> BLUE_TRIISTONE_BLOCK = registerBlock("blue_triistone_block",
            () -> new Block (BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> PURPLE_TRIISTONE_BLOCK = registerBlock("purple_triistone_block",
            () -> new Block (BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> PINK_TRIISTONE_BLOCK = registerBlock("pink_triistone_block",
            () -> new Block (BlockBehaviour.Properties.of(Material.AMETHYST)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> RED_TRIISTONE_ORE = registerBlock("red_triistone_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> ORANGE_TRIISTONE_ORE = registerBlock("orange_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> YELLOW_TRIISTONE_ORE = registerBlock("yellow_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> GREEN_TRIISTONE_ORE = registerBlock("green_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> BLUE_TRIISTONE_ORE = registerBlock("blue_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> PURPLE_TRIISTONE_ORE = registerBlock("purple_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> PINK_TRIISTONE_ORE = registerBlock("pink_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_RED_TRIISTONE_ORE = registerBlock("deepslate_red_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_ORANGE_TRIISTONE_ORE = registerBlock("deepslate_orange_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_YELLOW_TRIISTONE_ORE = registerBlock("deepslate_yellow_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_GREEN_TRIISTONE_ORE = registerBlock("deepslate_green_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_BLUE_TRIISTONE_ORE = registerBlock("deepslate_blue_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PURPLE_TRIISTONE_ORE = registerBlock("deepslate_purple_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    public static final RegistryObject<Block> DEEPSLATE_PINK_TRIISTONE_ORE = registerBlock("deepslate_pink_triistone_ore",
            () -> new Block (BlockBehaviour.Properties.of(Material.STONE)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.CRYSTAL_MAGIC_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static  <T extends  Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                             CreativeModeTab tab) {
        return ModItems.Items.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
