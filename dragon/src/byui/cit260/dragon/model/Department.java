/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragon.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Karina
 */
public class Department implements Serializable {

    private String name;
    private double food;
    private double sport;
    private double pharmacy;

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getSport() {
        return sport;
    }

    public void setSport(double sport) {
        this.sport = sport;
    }

    public double getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(double pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.food) ^ (Double.doubleToLongBits(this.food) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.sport) ^ (Double.doubleToLongBits(this.sport) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.pharmacy) ^ (Double.doubleToLongBits(this.pharmacy) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.food) != Double.doubleToLongBits(other.food)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sport) != Double.doubleToLongBits(other.sport)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pharmacy) != Double.doubleToLongBits(other.pharmacy)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", food=" + food + ", sport=" + sport + ", pharmacy=" + pharmacy + '}';
    }

}
