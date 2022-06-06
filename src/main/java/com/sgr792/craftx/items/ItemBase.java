package com.sgr792.craftx.items;

import com.sgr792.craftx.Main;
import com.sgr792.craftx.init.ModItems;
import com.sgr792.craftx.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
             //物品名称     放置的物品栏
    public ItemBase(String name,CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ModItems.ITEMS.add(this);
    }


    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
