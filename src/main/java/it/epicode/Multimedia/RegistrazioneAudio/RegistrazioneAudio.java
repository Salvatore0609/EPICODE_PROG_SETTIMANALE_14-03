package it.epicode.Multimedia.RegistrazioneAudio;

import it.epicode.Multimedia.ElementoRiproducibile.ElementoRiproducibile;
import lombok.Data;

@Data
public class RegistrazioneAudio extends ElementoRiproducibile {
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public void alzaVolume() {
        volume++;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}
