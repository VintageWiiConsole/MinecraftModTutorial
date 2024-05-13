package net.tom.tutorialmod.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tom.tutorialmod.TutorialMod;
import net.tom.tutorialmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> PERSONAL_ADDED = CREATIVE_MODE_TABS.register("personal_added",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GIMS_GLASSES.get()))
                    .title(Component.translatable("creativetab.personal_added"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GIMS_GLASSES.get());
                        pOutput.accept(ModBlocks.GIMS_BLOCK.get());
                        pOutput.accept(ModItems.INFERIOR_GLASSES.get());
                        pOutput.accept(ModBlocks.INFERIOR_GLASSES_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
