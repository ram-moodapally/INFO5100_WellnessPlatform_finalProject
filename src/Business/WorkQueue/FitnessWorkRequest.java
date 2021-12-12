/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author ram
 */
public class FitnessWorkRequest extends WorkRequest {
    private int cal;
    private int weight;
    private int height;
    private int muscleMass;
    private String fitnessMessage;

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMuscleMass() {
        return muscleMass;
    }

    public void setMuscleMass(int muscleMass) {
        this.muscleMass = muscleMass;
    }

    public String getFitnessMessage() {
        return fitnessMessage;
    }

    public void setFitnessMessage(String fitnessMessage) {
        this.fitnessMessage = fitnessMessage;
    }
}
