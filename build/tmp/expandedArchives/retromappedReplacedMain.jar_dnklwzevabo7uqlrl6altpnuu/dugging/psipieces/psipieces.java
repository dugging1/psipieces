package dugging.psipieces;


import dugging.psipieces.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="psipieces", name="PSI Pieces", version="1.10-1.0.0.1")
public class psipieces {
    @Mod.Instance("psipieces")
    public static psipieces instance;

    @SidedProxy(clientSide = "dugging.psipieces.proxy.ClientProxy", serverSide = "dugging.psipieces.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
