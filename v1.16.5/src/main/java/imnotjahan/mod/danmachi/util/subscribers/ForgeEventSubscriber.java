package imnotjahan.mod.danmachi.util.subscribers;

import imnotjahan.mod.danmachi.Reference;
import imnotjahan.mod.danmachi.gui.container.ArmorDressScreen;
import imnotjahan.mod.danmachi.gui.container.StatusGui;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ForgeEventSubscriber
{
    @SubscribeEvent
    public static void onClientTickEvent(TickEvent.ClientTickEvent event)
    {
        if(ClientEventSubscriber.STATUS.isDown())
        {
            Minecraft.getInstance().setScreen(new StatusGui());
        } else if(ClientEventSubscriber.ARMOR_DRESS.isDown())
        {
            Minecraft.getInstance().setScreen(new ArmorDressScreen());
        }
    }
}
