/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autoput;

/**
 *
 * @author Enis Stranjac
 */
public class Tarifa {
    private double osnovnaCijena;
    private double faktorMotor;
    private double faktorAuto;
    private double faktorBus;
    private double faktorKamion;

    public Tarifa(double osnovnaCijena) {
        this.osnovnaCijena = osnovnaCijena;
        this.faktorMotor = 1.0;
        this.faktorAuto = 1.2;
        this.faktorBus = 1.4;
        this.faktorKamion = 1.8;
    }

    // Getteri i setteri
    public double getOsnovnaCijena() { return osnovnaCijena; }
    public void setOsnovnaCijena(double osnovnaCijena) { this.osnovnaCijena = osnovnaCijena; }
    public double getFaktorMotor() { return faktorMotor; }
    public void setFaktorMotor(double faktorMotor) { this.faktorMotor = faktorMotor; }
    public double getFaktorAuto() { return faktorAuto; }
    public void setFaktorAuto(double faktorAuto) { this.faktorAuto = faktorAuto; }
    public double getFaktorBus() { return faktorBus; }
    public void setFaktorBus(double faktorBus) { this.faktorBus = faktorBus; }
    public double getFaktorKamion() { return faktorKamion; }
    public void setFaktorKamion(double faktorKamion) { this.faktorKamion = faktorKamion; }
}
