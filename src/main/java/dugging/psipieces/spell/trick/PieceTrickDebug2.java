package dugging.psipieces.spell.trick;


import net.minecraft.util.text.TextComponentString;
import vazkii.psi.api.spell.*;
import vazkii.psi.api.spell.piece.PieceTrick;



public class PieceTrickDebug2 extends PieceTrick{

    public PieceTrickDebug2(Spell spell){
        super(spell);
    }

    @Override
    public void initParams(){
        //NO-PARAMS
    }

    public void addToMetadata(SpellMetadata meta) throws SpellCompilationException {
        super.addToMetadata(meta);
        meta.addStat(EnumSpellStat.POTENCY, 2);
        meta.addStat(EnumSpellStat.COST, 5);
    }


    public Object execute(SpellContext context) throws SpellRuntimeException {
        if(context.caster.worldObj.isRemote) {
            return null;
        }else {
            context.caster.addChatMessage(new TextComponentString("Hello"));
            return null;
        }
    }
}

