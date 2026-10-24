package io.github.maplemods.maplesparrotsseasonalvariants;

import io.github.maplemods.sapling.functions.RegisterFunctions;
import io.github.maplemods.maplesparrotsseasonalvariants.data.Constants;
import net.minecraft.world.entity.EntityType;

public class CommonMod {

    public static void init() {
        Constants.LOG.info("[" + Constants.MOD_NAME + "] Loaded " + Constants.MOD_NAME + " version " + Constants.MOD_VERSION + ".");

        RegisterFunctions.registerCategory(Constants.MOD_ID, "spring", "season", 3, 1, 5, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "summer", "season", 6, 1, 8, 31);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "autumn", "season", 9, 1, 11, 30);
        RegisterFunctions.registerCategory(Constants.MOD_ID, "winter", "season", 12, 1, 2, 28);

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "autumn", "flannel_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "autumn", "flannel_parrot", "*", "flannel_parrot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "autumn", "flannel_parrot", "*baby", "flannel_parrot");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "autumn", "pumpkin_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "autumn", "pumpkin_parrot", "*", "pumpkin_parrot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "autumn", "pumpkin_parrot", "*baby", "pumpkin_parrot");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "spring", "cherry_blossom_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "spring", "cherry_blossom_parrot", "*", "cherry_blossom_parrot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "spring", "cherry_blossom_parrot", "*baby", "cherry_blossom_parrot");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "spring", "flower_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "spring", "flower_parrot", "*", "flower_parrot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "spring", "flower_parrot", "*baby", "flower_parrot");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "summer", "midsommar_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "summer", "midsommar_parrot", "*", "midsommar_parrot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "summer", "midsommar_parrot", "*baby", "midsommar_parrot");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "summer", "watermelon_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "summer", "watermelon_parrot", "*", "watermelon_parrot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "summer", "watermelon_parrot", "*baby", "watermelon_parrot");

        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "winter", "frozen_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "winter", "frozen_parrot", "*", "frozen_parrot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "winter", "frozen_parrot", "*baby", "frozen_parrot");
        RegisterFunctions.registerTextures(Constants.MOD_ID, EntityType.PARROT, "winter", "snow_covered_parrot", 1);
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "winter", "snow_covered_parrot", "*", "snow_covered_parrot");
        RegisterFunctions.registerReplacement(Constants.MOD_ID, EntityType.PARROT, "winter", "snow_covered_parrot", "*baby", "snow_covered_parrot");
    }
}
