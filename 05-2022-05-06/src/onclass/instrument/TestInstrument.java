package onclass.instrument;

public class TestInstrument {
    public static void main(String[] args) {
        PlayInstrument playInstrument = new PlayInstrument();
        playInstrument.testPlay();
        Instrument instrument = new Piano();
        playInstrument.testPlay(instrument);
        instrument = new Violin();
        playInstrument.testPlay(instrument);
    }
}
