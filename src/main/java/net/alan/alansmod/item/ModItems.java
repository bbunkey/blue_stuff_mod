package net.alan.alansmod.item;

import net.alan.alansmod.AlansMod;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> PRECURSOR = ITEMS.register("precursor",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CBS = ITEMS.register("cbs",
            () -> new Item(new Item.Properties().food(ModFoods.CBS)));

    public static final RegistryObject<Item> FUNNYBLUEINGOT = ITEMS.register("funnyblueingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUESWORD = ITEMS.register("bluesword",
            () -> new SwordItem(ModToolTiers.BLUE,4,4,new Item.Properties()));
    public static final RegistryObject<Item> BLUEPICK = ITEMS.register("bluepick",
            () -> new PickaxeItem(ModToolTiers.BLUE,1,1,new Item.Properties()));
    public static final RegistryObject<Item> BLUESHOVEL = ITEMS.register("blueshovel",
            () -> new ShovelItem(ModToolTiers.BLUE,1,1,new Item.Properties()));
    public static final RegistryObject<Item> BLUEHOE = ITEMS.register("bluehoe",
            () -> new HoeItem(ModToolTiers.BLUE,1,1,new Item.Properties()));
    public static final RegistryObject<Item> BLUEAXE = ITEMS.register("blueaxe",
            () -> new HoeItem(ModToolTiers.BLUE,10,2,new Item.Properties()));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
