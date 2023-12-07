public class Hand {
    private boolean manicure = false;
    private String nailcolor = "tan";

    public Hand(){

    }

    public Hand(boolean manicure){
        this.manicure = manicure;
    }
    public Hand(boolean manicure, String nailcolor){
        this.manicure = manicure;
        this.nailcolor = nailcolor;
    }
    public void setManicure(boolean manicure) {
        this.manicure = manicure;
    }

    public void setNailcolor(String nailcolor) {
        this.nailcolor = nailcolor;
    }

    public String getNailcolor() {
        return nailcolor;
    }

    public boolean hasManicure() {
        return manicure;
    }

    @Override
    public String toString(){
        if(this.hasManicure()){
            return "hand with " + this.nailcolor + " nail polish";
        }
        else {
            return "hand with naked nails";
        }
    }
}
