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
public class Items implements Serializable {

    private double cost;
    private double mood;
    private double hygene;
    private boolean sick;
    private double wings;
    private double brain;
    private double legs;
    private double tail;
    private double shape;
    private double tired;
    private String name;
    private String activityType;
    private String department;

    public Items() {
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
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

    public double getWings() {
        return wings;
    }

    public void setWings(double wings) {
        this.wings = wings;
    }

    public double getBrain() {
        return brain;
    }

    public void setBrain(double brain) {
        this.brain = brain;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.mood) ^ (Double.doubleToLongBits(this.mood) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.hygene) ^ (Double.doubleToLongBits(this.hygene) >>> 32));
        hash = 19 * hash + (this.sick ? 1 : 0);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.wings) ^ (Double.doubleToLongBits(this.wings) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.brain) ^ (Double.doubleToLongBits(this.brain) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.legs) ^ (Double.doubleToLongBits(this.legs) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.tail) ^ (Double.doubleToLongBits(this.tail) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.shape) ^ (Double.doubleToLongBits(this.shape) >>> 32));
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.tired) ^ (Double.doubleToLongBits(this.tired) >>> 32));
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.activityType);
        hash = 19 * hash + Objects.hashCode(this.department);
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
        final Items other = (Items) obj;
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
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
        if (Double.doubleToLongBits(this.wings) != Double.doubleToLongBits(other.wings)) {
            return false;
        }
        if (Double.doubleToLongBits(this.brain) != Double.doubleToLongBits(other.brain)) {
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.activityType, other.activityType)) {
            return false;
        }
        if (!Objects.equals(this.department, other.department)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Items{" + "cost=" + cost + ", mood=" + mood + ", hygene=" + hygene + ", sick=" + sick + ", wings=" + wings + ", brain=" + brain + ", legs=" + legs + ", tail=" + tail + ", shape=" + shape + ", tired=" + tired + ", name=" + name + ", activityType=" + activityType + ", department=" + department + '}';
    }

}
