public class Head {
    private String eyecolor = "brown";
    private double IQ = 100;

    public Head(){

    }

    public Head(String eyecolor, double IQ){
        this.eyecolor = eyecolor;
        this.IQ = IQ;
    }

    public void setEyecolor(String eyecolor){
        this.eyecolor = eyecolor;
    }
    public void setIQ(double IQ) {
        this.IQ = IQ;
    }
    public String getEyecolor() {
        return eyecolor;
    }
    public double getIQ() {
        return IQ;
    }

    @Override
    public String toString(){
        return this.IQ+"IQ head with eyes of color "+this.eyecolor;
    }
}
