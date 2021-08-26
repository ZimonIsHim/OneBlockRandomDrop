package com.zimonishim.oneblockrandomdrop;

import com.zimonishim.oneblockrandomdrop.config.ConfigHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Oneblockrandomdrop implements ModInitializer {

    public static final String MOD_ID = "obrd";

    public static final Block RANDOMDROP_BLOCK = new RandomDropBlock();

    @Override
    public void onInitialize() {
        //Registers the block & the blockItem.
        Registry.register(Registry.BLOCK, new Identifier("obrd", "randomdrop_block"), RANDOMDROP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("obrd", "randomdrop_block"), new BlockItem(RANDOMDROP_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

        //Sets up the config.
        ConfigHandler.load();
    }
}