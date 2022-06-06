package com.sgr792.craftx;

import com.sgr792.craftx.init.ModItems;
import com.sgr792.craftx.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;


public class BlockTab extends CreativeTabs {

    public BlockTab( ) {
        super("block_tab" );


    }

    @Override
    public ItemStack getTabIconItem() {
        //这里的参数是你的某一个物品，到时候物品栏会显示该物品的贴图
        return new ItemStack(ModItems.CRAFTX_CS);
    }

}