package net.alan.alansmod.item;

import net.alan.alansmod.AlansMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlansMod.MOD_ID);

    public static final RegistryObject<Item> BLUESTUFF = ITEMS.register("bluestuff",
            () -> new Item(new Item.Properties().food(ModFoods.BLUESTUFF)));

    public static final RegistryObject<Item> BLUESTUFFPLATE = ITEMS.register("bluestuffplate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MEDICINE = ITEMS.register("medicine",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BMK = ITEMS.register("bmk",
            () -> new Item(new Item.Properties()));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
