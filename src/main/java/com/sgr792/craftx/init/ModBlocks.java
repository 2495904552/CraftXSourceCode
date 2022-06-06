package com.sgr792.craftx.init;

import java.util.ArrayList;
import java.util.List;

import com.sgr792.craftx.Main;
import com.sgr792.craftx.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block CS_BLOCK = new BlockBase("cs_block", Material.IRON, Main.BLOCK_TAB);
    //此处只能大写+下划线        该方块名称(小写+下划线)  方块的材料属性为铁方块(击打的音效，挖掘等级与铁块一致，可随意修改)
}