package it.epicode.Multimedia.MultimediaPlayer;

import it.epicode.Multimedia.ElementoMultimediale.ElementoMultimediale;
import it.epicode.Multimedia.Immagine.Immagine;
import it.epicode.Multimedia.RegistrazioneAudio.RegistrazioneAudio;
import it.epicode.Multimedia.Riproducibile.Riproducibile;
import it.epicode.Multimedia.Video.Video;

import java.util.Scanner;

public class MultimediaPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        // Creazione degli elementi
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1 = Immagine, 2 = Audio, 3 = Video):");
            int tipo = scanner.nextInt();
            scanner.nextLine(); // Consuma la riga

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("Inserisci la durata:");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.println("Inserisci la durata:");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                default:
                    System.out.println("Tipo non valido, riprova.");
                    i--;
            }
        }

        // Esecuzione degli elementi
        while (true) {
            System.out.println("Scegli un elemento da eseguire (1-5) o 0 per uscire:");
            int scelta = scanner.nextInt();
            if (scelta == 0) break;
            if (scelta < 1 || scelta > 5) {
                System.out.println("Scelta non valida, riprova.");
                continue;
            }

            ElementoMultimediale elemento = elementi[scelta - 1];
            if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            } else if (elemento instanceof Riproducibile) {
                ((Riproducibile) elemento).play();
            }
        }

        scanner.close();
    }
}
