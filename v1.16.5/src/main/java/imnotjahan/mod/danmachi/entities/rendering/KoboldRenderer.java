package imnotjahan.mod.danmachi.entities.rendering;

import imnotjahan.mod.danmachi.Reference;
import imnotjahan.mod.danmachi.entities.Kobold;
import imnotjahan.mod.danmachi.entities.models.KoboldModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class KoboldRenderer extends MobRenderer<Kobold, KoboldModel<Kobold>>
{
    public KoboldRenderer(EntityRendererManager context)
    {
        super(context, new KoboldModel<>(0), 1);
    }

    @Override
    public ResourceLocation getTextureLocation(Kobold p_110775_1_)
    {
        return new ResourceLocation(Reference.MODID, "textures/entity/kobold.png");
    }
}