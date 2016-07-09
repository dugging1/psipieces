package dugging.psipieces.spell.trick;

import net.minecraft.entity.Entity;
import vazkii.psi.api.spell.*;
import vazkii.psi.api.spell.param.ParamEntity;
import vazkii.psi.api.spell.piece.PieceTrick;
import vazkii.psi.common.core.handler.PlayerDataHandler;

import static dugging.psipieces.lib.LPieceNames.TRICK_TAG;

public class PieceTrickTag extends PieceTrick {
    SpellParam target;

    public PieceTrickTag(Spell spell){
        super(spell);
    }

    @Override
    public void initParams(){
        this.addParam(target = new ParamEntity(SpellParam.GENERIC_NAME_TARGET, SpellParam.BLUE, false, false));
    }

    public void addToMetadata(SpellMetadata meta) throws SpellCompilationException {
        super.addToMetadata(meta);
        meta.addStat(EnumSpellStat.POTENCY, 20);
        meta.addStat(EnumSpellStat.COST, 20);
    }


    public Object execute(SpellContext context) throws SpellRuntimeException {
        if(context.caster.field_70170_p.field_72995_K) {
            return null;
        }else if(context.loopcastIndex >= 20){
            return null;
        } else {
            Entity targ = this.getParamValue(context, this.target);
            if (targ == context.focalPoint) {
                return null;
            }else {
                SpellContext context1 = new SpellContext();
                context1 = context1.setCompiledSpell(context.cspell);
                context1.caster = context.caster;
                context1.focalPoint = this.getParamValue(context, this.target);
                context1.setLoopcastIndex(context.loopcastIndex+1);
                PlayerDataHandler.get(context.caster).deductPsi(context.cspell.metadata.stats.get(EnumSpellStat.COST), 60, true);
                context1.cspell.safeExecute(context1);
                return null;
            }
        }
    }
}
