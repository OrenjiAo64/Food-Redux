package xyz.orenjiao64.simplyfood.init;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import xyz.orenjiao64.simplyfood.startup.Registry;

public class ModItems
{
    //Plain
    public static final RegistryObject<Item> FLOUR = Registry.ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> DOUGH_RAW = Registry.ITEMS.register("dough_raw",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
    public static final RegistryObject<Item> BREAD_RAW = Registry.ITEMS.register("bread_raw",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    //Foods
    public static final RegistryObject<Item> DOUGH_BAKED = Registry.ITEMS.register("dough_baked",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)
                    .food(new Food.Builder().nutrition(2).saturationMod(0.3F).fast().build())));

    //Registry
    public static void register() {}
}
