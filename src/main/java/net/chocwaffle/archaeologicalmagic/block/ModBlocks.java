package net.chocwaffle.archaeologicalmagic.block;

import net.chocwaffle.archaeologicalmagic.ArchaeologicalMagic;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block PURPLE_COMET_BLOCK = registerBlock("purple_comet_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block RED_COMET_BLOCK = registerBlock("red_comet_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create()
                            .strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ArchaeologicalMagic.MOD_ID, name),block);
    }


    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ArchaeologicalMagic.MOD_ID, name),
                new BlockItem(block,new Item.Settings()));
    }


    public static void registerModBlocks(){
        ArchaeologicalMagic.LOGGER.info("registering Mod Blocks for"+ ArchaeologicalMagic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.PURPLE_COMET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RED_COMET_BLOCK);
        });
    }
}
