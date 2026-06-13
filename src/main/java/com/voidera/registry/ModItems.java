package com.voidera.registry;

import com.voidera.item.VoidEraSwordItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, "voidera");

    public static final RegistryObject<Item> VOID_SWORD =
        ITEMS.register("void_era_sword", VoidEraSwordItem::new);
}
