package onclass.instrument;

/**
 * 玩乐器类
 */
public class PlayInstrument extends Instrument {
    public void testPlay() {
        super.play();
    }
    public void testPlay(Instrument instrument) {
        instrument.play();
    }
}
