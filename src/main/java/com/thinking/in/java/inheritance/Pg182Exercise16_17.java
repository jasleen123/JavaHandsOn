package com.thinking.in.java.inheritance;
public class Pg182Exercise16_17 {

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.checkAmphibian(frog);
    }
}

class Amphibian {
    private boolean isColdBlood;
    private boolean hasMoistAndScalelessSkin;
    private boolean livesInWaterAndLand;

    public Amphibian() {
        this.isColdBlood = true;
        this.hasMoistAndScalelessSkin = true;
        this.livesInWaterAndLand = true;
    }

    public boolean isColdBlooded() {
        return isColdBlood;
    }

    public boolean livesInWaterAndLand() {
        return livesInWaterAndLand;
    }

    public boolean hasMoistAndScalessSkin() {
        return hasMoistAndScalelessSkin;
    }

    public void checkAmphibian(Amphibian amphibian) {
        if ((isColdBlooded()) && (livesInWaterAndLand()) && (hasMoistAndScalessSkin())) {
            System.out.println("Yes, " + amphibian.toString() + " is an amphibian");
        }
    }

    @Override
    public String toString() {
        return "Amphibian";
    }
}

class Frog extends Amphibian {

    Frog(){
        super();
    }

    @Override
    public String toString() {
        return "Frog";
    }

    public void checkAmphibian(Amphibian amphibian){
        System.out.println(amphibian.toString() + " is an amphibian");
    }

}