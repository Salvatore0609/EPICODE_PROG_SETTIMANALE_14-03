package it.epicode.Multimedia.ElementoRiproducibile;

import it.epicode.Multimedia.ElementoMultimediale.ElementoMultimediale;
import it.epicode.Multimedia.Riproducibile.Riproducibile;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class ElementoRiproducibile extends ElementoMultimediale implements Riproducibile {
    protected int durata;

    public ElementoRiproducibile(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }
}