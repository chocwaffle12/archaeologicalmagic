package net.chocwaffle.archaeologicalmagic.item;

import net.chocwaffle.archaeologicalmagic.ArchaeologicalMagic;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PURPLE_COMET_FRAGMENT = registerItem("purple_comet_fragment", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ArchaeologicalMagic.MOD_ID, name),item);
    }

    public static void registerModItems(){
        ArchaeologicalMagic.LOGGER.info("Registering Mod Items for "+ArchaeologicalMagic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PURPLE_COMET_FRAGMENT);
        });
    }
}
