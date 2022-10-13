package net.sztgellert.gellertmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sztgellert.gellertmod.GellertMod;
import net.sztgellert.gellertmod.item.ModCreativeModeTab;
import net.sztgellert.gellertmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GellertMod.MOD_ID);

    public static final RegistryObject<Block> CANDLE_BLOCK = registerBlock("candle_block",
            ()-> new Block((BlockBehaviour.Properties.of(Material.FIRE).destroyTime(30))),
            ModCreativeModeTab.TUTORIAL_TAB);

    public static final RegistryObject<Block> EXPERIENCE_BLOCK = registerBlock("experience_block",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(6f)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,7)),
            ModCreativeModeTab.TUTORIAL_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
       RegistryObject<T> toReturn = BLOCKS.register(name, block);
       registerBlockItem(name, toReturn, tab);
       return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
