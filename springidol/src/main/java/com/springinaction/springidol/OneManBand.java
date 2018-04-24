package com.springinaction.springidol;

import java.util.Collection;

public class OneManBand implements Performer {
    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        instruments.stream().forEach(Instrument::play);
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
