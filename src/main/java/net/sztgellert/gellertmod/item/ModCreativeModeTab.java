package net.sztgellert.gellertmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("gellerttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LIT_CANDLE.get());
        }
    };
}
