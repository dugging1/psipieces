package dugging.psipieces;

import dugging.psipieces.lib.LPieceNames;
import dugging.psipieces.spell.trick.PieceTrickDebug2;
import dugging.psipieces.spell.trick.PieceTrickTag;
import vazkii.psi.common.lib.LibPieceGroups;

import static vazkii.psi.common.spell.base.ModSpellPieces.register;

public class ModSpellPieces {
    public static vazkii.psi.common.spell.base.ModSpellPieces.PieceContainer trickDebug2;
    public static vazkii.psi.common.spell.base.ModSpellPieces.PieceContainer trickTag;

    public static void init() {
        trickDebug2 = register(PieceTrickDebug2.class, LPieceNames.TRICK_DEBUG2, LibPieceGroups.TUTORIAL_1);
        trickTag = register(PieceTrickTag.class, LPieceNames.TRICK_TAG, LibPieceGroups.TUTORIAL_1);
    }
}
