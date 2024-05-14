/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoput;

/**
 *
 * @author Enis Stranjac
 */
public class Kazna {
    private double limitBrzina;
    private double kaznaNiska;
    private double kaznaVisoka;

    public Kazna() {
        this.limitBrzina = 140.0;  // primjer limita
        this.kaznaNiska = 50.0;    // kazna za prosjecnu brzinu iznad 140 km/h
        this.kaznaVisoka = 150.0;  // kazna za prosjecnu brzinu iznad 150 km/h
    }

    // Getteri i setteri
    public double getLimitBrzina() { return limitBrzina; }
    public void setLimitBrzina(double limitBrzina) { this.limitBrzina = limitBrzina; }
    public double getKaznaNiska() { return kaznaNiska; }
    public void setKaznaNiska(double kaznaNiska) { this.kaznaNiska = kaznaNiska; }
    public double getKaznaVisoka() { return kaznaVisoka; }
    public void setKaznaVisoka(double kaznaVisoka) { this.kaznaVisoka = kaznaVisoka; }

    // Metoda za izračunavanje kazne
    public double izracunajKaznu(double prosjecnaBrzina) {
        if (prosjecnaBrzina > 150) {
            return kaznaVisoka;
        } else if (prosjecnaBrzina > 140) {
            return kaznaNiska;
        }
        return 0.0;
    }
}
