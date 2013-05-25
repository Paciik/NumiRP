package num.numirp.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;
import num.numirp.lib.Reference;
import num.numirp.lib.Strings;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPickaxe extends ItemTool {
    public static final Block[] blocksEffectiveAgainst = new Block[] { Block.cobblestone, Block.stoneDoubleSlab,
            Block.stoneSingleSlab, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron,
            Block.blockIron, Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond, Block.blockDiamond,
            Block.ice, Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing,
            Block.rail, Block.railDetector, Block.railPowered, Block.railActivator };

    private int materialType;

    public ItemPickaxe(int itemId, int type) {
        super(itemId, 2, EnumToolMaterial.IRON, blocksEffectiveAgainst);
        setCreativeTab(CreativeTabs.tabTools);
        setMaxDamage(220);

        materialType = type;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.TEXTURE_PATH + "pickaxe" + Strings.ORES[materialType]);
    }

    @Override
    public boolean canHarvestBlock(Block par1Block) {
        return par1Block == Block.obsidian ? this.toolMaterial.getHarvestLevel() == 3
                : (par1Block != Block.blockDiamond && par1Block != Block.oreDiamond ? (par1Block != Block.oreEmerald
                        && par1Block != Block.blockEmerald ? (par1Block != Block.blockGold
                        && par1Block != Block.oreGold ? (par1Block != Block.blockIron && par1Block != Block.oreIron ? (par1Block != Block.blockLapis
                        && par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone
                        && par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true
                        : (par1Block.blockMaterial == Material.iron ? true : par1Block.blockMaterial == Material.anvil))
                        : this.toolMaterial.getHarvestLevel() >= 2)
                        : this.toolMaterial.getHarvestLevel() >= 1)
                        : this.toolMaterial.getHarvestLevel() >= 1)
                        : this.toolMaterial.getHarvestLevel() >= 2)
                        : this.toolMaterial.getHarvestLevel() >= 2)
                        : this.toolMaterial.getHarvestLevel() >= 2);
    }
}
