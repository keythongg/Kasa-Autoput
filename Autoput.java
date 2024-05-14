/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package autoput;

import java.time.LocalDateTime;

/**
 *
 * @author Enis Stranjac
 */
public class Autoput {

    public static void main(String[] args) {
        // Kreiranje tarifa
        Tarifa tarifa = new Tarifa(0.1);  // osnovna cijena po kilometru

        // Kreiranje vozila
        Vozilo vozilo = new Vozilo();
        vozilo.setVoziloId(1);
        vozilo.setRegistracija("3U-R1-M");
        vozilo.setTipVozila(TipVozilaEnum.AUTO);
        vozilo.setVrijemeUlaska(LocalDateTime.now().minusMinutes(49));
        vozilo.setVrijemeIzlaska(LocalDateTime.now());
        vozilo.setPredjeniKilometri(68);
        vozilo.setTarifa(tarifa);

        
        // Ispis tipa vozila
        TipVozilaEnum tipVozila = vozilo.getTipVozila();
        System.out.println("Tip vozila: " + tipVozila);

        // Izračunavanje cestarine
        double cijena = vozilo.izracunajCijenu();
        System.out.println("Cijena cestarine: " + cijena + " KM");

        // Izračunavanje prosječne brzine
        double prosjecnaBrzina = vozilo.izracunajProsjecnuBrzinu();
        System.out.println("Prosječna brzina: " + prosjecnaBrzina + " km/h");

        // Kreiranje kazne
        Kazna kazna = new Kazna();
        double iznosKazne = kazna.izracunajKaznu(prosjecnaBrzina);
        if (iznosKazne > 0) {
            System.out.println("Iznos kazne: " + iznosKazne + " KM");
        } else {
            System.out.println("Nema kazne.");
        }
        
        // Obavještavanje policije
        if (prosjecnaBrzina > 150) {
        System.out.println("\n");
        System.out.println("Obavještenje: Policija je obavještena o opasnoj vožnji.");
        System.out.println("Podaci o vozilu:");
        System.out.println("Registracija: " + vozilo.getRegistracija());
        System.out.println("Vrijeme ulaska: " + vozilo.getVrijemeUlaska());
        System.out.println("Vrijeme izlaska: " + vozilo.getVrijemeIzlaska());
        
        }
    }
}
