package num.numirp.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAxe extends ItemTool {
    public static final Block[] blocksEffectiveAgainst = new Block[] {Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stoneDoubleSlab, Block.stoneSingleSlab, Block.pumpkin, Block.pumpkinLantern};

    private int materialType;

    public ItemAxe(int itemId, int type) {
        super(itemId, 2, EnumToolMaterial.IRON, blocksEffectiveAgainst);
        setCreativeTab(CreativeTabs.tabTools);
        setMaxDamage(220);

        materialType = type;

        if (type == 0) {
            setUnlocalizedName("axeRuby");
        } else if (type == 1) {
            setUnlocalizedName("axeGreenSapphire");
        } else if (type == 2) {
            setUnlocalizedName("axeSapphire");
        } else {
            setUnlocalizedName("axeUnknown");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "axe" + Strings.ORES[materialType]);
    }

    @Override
    public boolean canHarvestBlock(Block par1Block) {
        return false;
    }
    
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block != null && (par2Block.blockMaterial == Material.wood || par2Block.blockMaterial == Material.plants || par2Block.blockMaterial == Material.vine) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }

}
