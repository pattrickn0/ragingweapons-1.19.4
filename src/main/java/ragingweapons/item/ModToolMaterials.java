package ragingweapons.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    TITANIUM(2, 600, 7F, 6.5F, 12, () -> {
        return Ingredient.ofItems(ModItems.TITANIUM);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {return this.itemDurability;}
    public float getMiningSpeedMultiplier() {return this.miningSpeed;}
    public float getAttackDamage() {return this.attackDamage;}
    public int getMiningLevel() {return this.miningLevel;}
    public int getEnchantability() {return this.enchantability;}

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
