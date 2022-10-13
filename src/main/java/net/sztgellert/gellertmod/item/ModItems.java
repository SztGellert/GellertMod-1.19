package net.sztgellert.gellertmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sztgellert.gellertmod.GellertMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GellertMod.MOD_ID);

    public static final RegistryObject<Item> GEMSTONE = ITEMS.register("gemstone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> CANDLE = ITEMS.register("candle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> LIT_CANDLE = ITEMS.register("lit_candle",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).durability(3)));

    public static final RegistryObject<Item> PURPLE_WAX = ITEMS.register("purple_wax",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> PURPLE_HONEY = ITEMS.register("purple_honey",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
