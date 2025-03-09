package net.chocwaffle.archaeologicalmagic.item;

import net.chocwaffle.archaeologicalmagic.ArchaeologicalMagic;
import net.chocwaffle.archaeologicalmagic.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ARCHAEOLOGICAL_MAGIC_METALS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ArchaeologicalMagic.MOD_ID,"metal_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PURPLE_COMET_FRAGMENT))
                    .displayName(Text.translatable("itemgroup.archaeological_magic.metal_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_COMET_FRAGMENT);
                        entries.add(ModItems.PURPLE_COMET_FRAGMENT);
                        entries.add(ModBlocks.PURPLE_COMET_BLOCK);
                        entries.add(ModBlocks.RED_COMET_BLOCK);
                    })

                    .build());


    public static void registerItemGroups(){
        ArchaeologicalMagic.LOGGER.info("registering item groups for "+ArchaeologicalMagic.MOD_ID);
    }

}
