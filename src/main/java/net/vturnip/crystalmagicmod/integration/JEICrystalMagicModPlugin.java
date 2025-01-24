package net.vturnip.crystalmagicmod.integration;


import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.vturnip.crystalmagicmod.CrystalMagicMod;

public class JEICrystalMagicModPlugin implements IModPlugin {

    @JeiPlugin
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(CrystalMagicMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IModPlugin.super.registerCategories(registration);
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        IModPlugin.super.registerRecipes(registration);
    }
}
