package EcoSphere.item;

import EcoSphere.EcoSphere;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EcoSphere.MOD_ID);

    public static final DeferredItem<Item> SILVER_ORE = ITEMS.register("silver_ore",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SILVER_BAR = ITEMS.register("silver_bar",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
