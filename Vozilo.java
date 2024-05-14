/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoput;

/**
 *
 * @author Enis Stranjac
 */
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Vozilo {
    private int voziloId;
    private String registracija;
    private TipVozilaEnum tipVozila;
    private LocalDateTime vrijemeUlaska;
    private LocalDateTime vrijemeIzlaska;
    private double predjeniKilometri;
    private Tarifa tarifa;

    // Getteri i setteri
    public int getVoziloId() { return voziloId; }
    public void setVoziloId(int voziloId) { this.voziloId = voziloId; }
    public String getRegistracija() { return registracija; }
    public void setRegistracija(String registracija) { this.registracija = registracija; }
    public TipVozilaEnum getTipVozila() { return tipVozila; }
    public void setTipVozila(TipVozilaEnum tipVozila) { this.tipVozila = tipVozila; }
    public LocalDateTime getVrijemeUlaska() { return vrijemeUlaska; }
    public void setVrijemeUlaska(LocalDateTime vrijemeUlaska) { this.vrijemeUlaska = vrijemeUlaska; }
    public LocalDateTime getVrijemeIzlaska() { return vrijemeIzlaska; }
    public void setVrijemeIzlaska(LocalDateTime vrijemeIzlaska) { this.vrijemeIzlaska = vrijemeIzlaska; }
    public double getPredjeniKilometri() { return predjeniKilometri; }
    public void setPredjeniKilometri(double predjeniKilometri) { this.predjeniKilometri = predjeniKilometri; }
    public Tarifa getTarifa() { return tarifa; }
    public void setTarifa(Tarifa tarifa) { this.tarifa = tarifa; }

    // Metoda za izračunavanje cijene
    public double izracunajCijenu() {
        double faktor = 1.0;
        switch (this.tipVozila) {
            case MOTOR -> faktor = tarifa.getFaktorMotor();
            case AUTO -> faktor = tarifa.getFaktorAuto();
            case BUS -> faktor = tarifa.getFaktorBus();
            case KAMION -> faktor = tarifa.getFaktorKamion();
        }
        return predjeniKilometri * tarifa.getOsnovnaCijena() * faktor;
    }

    // Metoda za izračunavanje prosječne brzine
    public double izracunajProsjecnuBrzinu() {
        long ulazakEpochSecond = vrijemeUlaska.toEpochSecond(ZoneOffset.UTC);
        long izlazakEpochSecond = vrijemeIzlaska.toEpochSecond(ZoneOffset.UTC);
        double trajanjeUSatima = (double) (izlazakEpochSecond - ulazakEpochSecond) / 3600;
        return predjeniKilometri / trajanjeUSatima;
    }
}

