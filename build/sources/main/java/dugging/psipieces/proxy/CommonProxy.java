package dugging.psipieces.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public abstract class CommonProxy implements IProxy {

    public void preInit(FMLPreInitializationEvent event){
        dugging.psipieces.ModSpellPieces.init();
    }
}
