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
 * @author Bolotoff
 */
public class DragonC implements Serializable {
    private String name;
    private int age;
    private double mood;
    private double hygene;
    private boolean sick;
    private String sickType;
    private double wings;
    private double legs;
    private double tail;
    private double shape;
    private double tired;
    private double brain;

    public DragonC() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMood() {
        return mood;
    }

    public void setMood(double mood) {
        this.mood = mood;
    }

    public double getHygene() {
        return hygene;
    }

    public void setHygene(double hygene) {
        this.hygene = hygene;
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public String getSickType() {
        return sickType;
    }

    public void setSickType(String sickType) {
        this.sickType = sickType;
    }

    public double getWings() {
        return wings;
    }

    public void setWings(double wings) {
        this.wings = wings;
    }

    public double getLegs() {
        return legs;
    }

    public void setLegs(double legs) {
        this.legs = legs;
    }

    public double getTail() {
        return tail;
    }

    public void setTail(double tail) {
        this.tail = tail;
    }

    public double getShape() {
        return shape;
    }

    public void setShape(double shape) {
        this.shape = shape;
    }

    public double getTired() {
        return tired;
    }

    public void setTired(double tired) {
        this.tired = tired;
    }

    public double getBrain() {
        return brain;
    }

    public void setBrain(double brain) {
        this.brain = brain;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + this.age;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.mood) ^ (Double.doubleToLongBits(this.mood) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.hygene) ^ (Double.doubleToLongBits(this.hygene) >>> 32));
        hash = 31 * hash + (this.sick ? 1 : 0);
        hash = 31 * hash + Objects.hashCode(this.sickType);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.wings) ^ (Double.doubleToLongBits(this.wings) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.legs) ^ (Double.doubleToLongBits(this.legs) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.tail) ^ (Double.doubleToLongBits(this.tail) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.shape) ^ (Double.doubleToLongBits(this.shape) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.tired) ^ (Double.doubleToLongBits(this.tired) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.brain) ^ (Double.doubleToLongBits(this.brain) >>> 32));
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
        final DragonC other = (DragonC) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (Double.doubleToLongBits(this.mood) != Double.doubleToLongBits(other.mood)) {
            return false;
        }
        if (Double.doubleToLongBits(this.hygene) != Double.doubleToLongBits(other.hygene)) {
            return false;
        }
        if (this.sick != other.sick) {
            return false;
        }
        if (!Objects.equals(this.sickType, other.sickType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.wings) != Double.doubleToLongBits(other.wings)) {
            return false;
        }
        if (Double.doubleToLongBits(this.legs) != Double.doubleToLongBits(other.legs)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tail) != Double.doubleToLongBits(other.tail)) {
            return false;
        }
        if (Double.doubleToLongBits(this.shape) != Double.doubleToLongBits(other.shape)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tired) != Double.doubleToLongBits(other.tired)) {
            return false;
        }
        if (Double.doubleToLongBits(this.brain) != Double.doubleToLongBits(other.brain)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DragonC{" + "name=" + name + ", age=" + age + ", mood=" + mood + ", hygene=" + hygene + ", sick=" + sick + ", sickType=" + sickType + ", wings=" + wings + ", legs=" + legs + ", tail=" + tail + ", shape=" + shape + ", tired=" + tired + ", brain=" + brain + '}';
    }
    
    
            
    
}
