package num.numirp.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import num.numirp.lib.ItemIDs;
import num.numirp.lib.Strings;
import num.numirp.item.ItemPickaxe;

public class ModItems {
    public static Item itemProcessed;
    public static ItemStack gemSapphire, gemGreenSapphire, gemRuby, ingotCopper, ingotTin, ingotSilver, dustNikolite,
            ingotTungsten;

    // Tools
    public static Item pickaxeRuby, pickaxeGreenSapphire, pickaxeSapphire;
    private static Item shovelRuby, shovelGreenSapphire, shovelSapphire;
    private static Item axeRuby,axeGreenSapphire, axeSapphire;

    public static void init() {
        itemProcessed = new ItemProcessed(ItemIDs.PROCESSED_ID);
        GameRegistry.registerItem(itemProcessed, "itemProcessed");
        for (int i = 0; i < Strings.PROCESSED.length; i++) {
            LanguageRegistry.addName(new ItemStack(itemProcessed, 1, i), Strings.PROCESSED_NAMES[i]);
        }

        gemRuby = new ItemStack(itemProcessed, 1, 0);
        gemGreenSapphire = new ItemStack(itemProcessed, 1, 1);
        gemSapphire = new ItemStack(itemProcessed, 1, 2);
        ingotTin = new ItemStack(itemProcessed, 1, 3);
        ingotCopper = new ItemStack(itemProcessed, 1, 4);
        ingotSilver = new ItemStack(itemProcessed, 1, 5);
        dustNikolite = new ItemStack(itemProcessed, 1, 6);
        ingotTungsten = new ItemStack(itemProcessed, 1, 7);

        OreDictionary.registerOre("gemRuby", gemRuby);
        OreDictionary.registerOre("gemGreenSapphire", gemGreenSapphire);
        OreDictionary.registerOre("gemSapphire", gemSapphire);
        OreDictionary.registerOre("ingotTin", ingotTin);
        OreDictionary.registerOre("ingotCopper", ingotCopper);
        OreDictionary.registerOre("ingotSilver", ingotSilver);
        OreDictionary.registerOre("dustNikolite", dustNikolite);
        OreDictionary.registerOre("ingotTungsten", ingotTungsten);

        // Pickaxes
        pickaxeRuby = new ItemPickaxe(ItemIDs.PICKAXE_RUBY_ID, 0);
        GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
        LanguageRegistry.addName(new ItemStack(pickaxeRuby, 1), Strings.PICKAXES[0]);
        
        pickaxeGreenSapphire = new ItemPickaxe(ItemIDs.PICKAXE_GREEN_SAPPHIRE_ID, 1);
        GameRegistry.registerItem(pickaxeGreenSapphire, "pickaxeGreenSapphire");
        LanguageRegistry.addName(new ItemStack(pickaxeGreenSapphire, 1), Strings.PICKAXES[1]);
        
        pickaxeSapphire = new ItemPickaxe(ItemIDs.PICKAXE_SAPPHIRE_ID, 2);
        GameRegistry.registerItem(pickaxeSapphire, "pickaxeSapphire");
        LanguageRegistry.addName(new ItemStack(pickaxeSapphire, 1), Strings.PICKAXES[2]);

        // Shovels
        shovelRuby = new ItemShovel(ItemIDs.SHOVEL_RUBY_ID, 0);
        GameRegistry.registerItem(shovelRuby, "shovelRuby");
        LanguageRegistry.addName(new ItemStack(shovelRuby, 1), Strings.SHOVELS[0]);
        
        shovelGreenSapphire = new ItemShovel(ItemIDs.SHOVEL_GREEN_SAPPHIRE_ID, 1);
        GameRegistry.registerItem(shovelGreenSapphire, "shovelGreenSapphire");
        LanguageRegistry.addName(new ItemStack(shovelGreenSapphire, 1), Strings.SHOVELS[1]);
        
        shovelSapphire = new ItemShovel(ItemIDs.SHOVEL_SAPPHIRE_ID, 2);
        GameRegistry.registerItem(shovelSapphire, "shovelSapphire");
        LanguageRegistry.addName(new ItemStack(shovelSapphire, 1), Strings.SHOVELS[2]);

        // Shovels
        axeRuby = new ItemAxe(ItemIDs.AXE_RUBY_ID, 0);
        GameRegistry.registerItem(axeRuby, "axeRuby");
        LanguageRegistry.addName(new ItemStack(axeRuby, 1), Strings.AXES[0]);
        
        axeGreenSapphire = new ItemAxe(ItemIDs.AXE_GREEN_SAPPHIRE_ID, 1);
        GameRegistry.registerItem(axeGreenSapphire, "axeGreenSapphire");
        LanguageRegistry.addName(new ItemStack(axeGreenSapphire, 1), Strings.AXES[1]);
        
        axeSapphire = new ItemAxe(ItemIDs.AXE_SAPPHIRE_ID, 2);
        GameRegistry.registerItem(axeSapphire, "axeSapphire");
        LanguageRegistry.addName(new ItemStack(axeSapphire, 1), Strings.AXES[2]);

    }
}
