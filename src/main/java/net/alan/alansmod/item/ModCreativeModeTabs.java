package net.alan.alansmod.item;

import net.alan.alansmod.AlansMod;
import net.alan.alansmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlansMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALANS_MOD_TAB = CREATIVE_MODE_TABS.register("alans_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BLUESTUFF.get()))
                    .title(Component.translatable("creativetab.alans_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLUESTUFF.get());
                        output.accept(ModItems.BLUESTUFFPLATE.get());
                        output.accept(ModItems.MEDICINE.get());
                        output.accept(ModItems.PRECURSOR.get());
                        output.accept(ModBlocks.BLUESTUFFBLOCK.get());
                        output.accept(ModBlocks.COMPRESSEDBLUESTUFFBLOCK.get());
                        output.accept(ModItems.CBS.get());
                        output.accept(ModItems.FUNNYBLUEINGOT.get());
                        output.accept(ModItems.BLUEHOE.get());
                        output.accept(ModItems.BLUESWORD.get());
                        output.accept(ModItems.BLUEAXE.get());
                        output.accept(ModItems.BLUESHOVEL.get());
                        output.accept(ModItems.BLUEPICK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
