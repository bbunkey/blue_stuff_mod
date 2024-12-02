package net.alan.alansmod.item;

import net.alan.alansmod.AlansMod;
import net.alan.alansmod.item.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier BLUE = TierSortingRegistry.registerTier(
            new ForgeTier(10,5000,25f,12f,100,
                    ModTags.Blocks.NEEDS_BLUE_TOOL, () -> Ingredient.of(ModItems.FUNNYBLUEINGOT.get())),
            new ResourceLocation(AlansMod.MOD_ID,"bluestuff"), List.of(Tiers.NETHERITE), List.of());

}
