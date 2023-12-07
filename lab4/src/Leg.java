public class Leg {
    private double shoesize = 40;
    private boolean hair = true;

    public Leg(){

    }

    public Leg(double shoesize, boolean hair){
        this.shoesize = shoesize;
        this.hair = hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

    public void setShoesize(double shoesize) {
        this.shoesize = shoesize;
    }

    public double getShoesize() {
        return shoesize;
    }

    public boolean hasHair() {
        return hair;
    }

    @Override
    public String toString(){
        if(this.hasHair()) {
            return this.shoesize + " sized hairy leg";
        }
        else {
            return this.shoesize + " sized shaven leg";
        }
    }
}
