package imnotjahan.mod.danmachi.entities.gods;

import imnotjahan.mod.danmachi.entities.templates.GodBase;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class Hermes extends GodBase
{
    public Hermes(EntityType<? extends CreatureEntity> entity, World world)
    {
        super(entity, world, "hermes");
    }
}
