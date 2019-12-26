package wtf.choco.strangeplants.listener;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LogBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import wtf.choco.strangeplants.StrangePlants;
import wtf.choco.strangeplants.block.ModBlocks;

@EventBusSubscriber(modid = StrangePlants.MODID, bus = Bus.MOD)
public class ModRegistryListener {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
            new LogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)).setRegistryName(StrangePlants.MODID, "strangler_fig_log"),
            new Block(Block.Properties.from(Blocks.OAK_PLANKS)).setRegistryName(StrangePlants.MODID, "strangler_fig_planks")
        );
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            new BlockItem(ModBlocks.STRANGLER_FIG_LOG, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(ModBlocks.STRANGLER_FIG_LOG.getRegistryName()),
            new BlockItem(ModBlocks.STRANGLER_FIG_PLANKS, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(ModBlocks.STRANGLER_FIG_PLANKS.getRegistryName())
        );
    }

}
