package com.sgr792.craftx.init;

import java.util.ArrayList;
import java.util.List;

import com.sgr792.craftx.Main;
import com.sgr792.craftx.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item CRAFTX_CS = new ItemBase("craftx_cs", Main.ITEM_TAB);

}
