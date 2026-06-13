package com.voidera.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class VoidEraSwordItem extends SwordItem {
    public VoidEraSwordItem() {
        super(Tiers.NETHERITE, 6, -2.4f, new Item.Properties().fireResistant());
    }
}
