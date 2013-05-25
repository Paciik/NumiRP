package num.numirp.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;

public class ItemShovel extends ItemTool {
    public static final Block[] blocksEffectiveAgainst = new Block[] { Block.grass, Block.dirt, Block.sand,
            Block.gravel, Block.snow, Block.blockSnow, Block.blockClay, Block.tilledField, Block.slowSand,
            Block.mycelium };

    private int materialType;

    public ItemShovel(int itemId, int type) {
        super(itemId, 2, EnumToolMaterial.IRON, blocksEffectiveAgainst);
        setCreativeTab(CreativeTabs.tabTools);
        setMaxDamage(220);

        materialType = type;

        if (type == 0) {
            setUnlocalizedName("shovelRuby");
        } else if (type == 1) {
            setUnlocalizedName("shovelGreenSapphire");
        } else if (type == 2) {
            setUnlocalizedName("shovelSapphire");
        } else {
            setUnlocalizedName("shovelUnknown");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "shovel" + Strings.ORES[materialType]);
    }

    @Override
    public boolean canHarvestBlock(Block par1Block) {
        return par1Block == Block.snow ? true : par1Block == Block.blockSnow;
    }

}
