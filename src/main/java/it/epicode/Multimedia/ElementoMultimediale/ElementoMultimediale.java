package it.epicode.Multimedia.ElementoMultimediale;

import it.epicode.Multimedia.Riproducibile.Riproducibile;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class ElementoMultimediale {
    protected String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }
}
