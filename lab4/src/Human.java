public class Human {
    private double height = 180;
    private double weight = 70;
    private char gender = 'M';
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(){

    }

    public Human(double height, double weight, char gender, Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand){
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getGender(){
        return this.gender;
    }

    @Override
    public String toString(){
        return this.height+"cm tall weighing "+this.weight+"kg ("+this.gender+")\n"+this.head+"\nLeft "+this.leftHand+"\nRight "+this.rightHand+"\nLeft "+this.leftLeg+"\nRight " + this.rightLeg;
    }
}
