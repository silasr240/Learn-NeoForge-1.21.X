package net.silas.neotesting.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.silas.neotesting.NeoTest;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoTest.MOD_ID);

    public static final DeferredItem<Item> CADENITE_INGOT = ITEMS.register("cadenite_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_CADENITE = ITEMS.register("raw_cadenite",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
