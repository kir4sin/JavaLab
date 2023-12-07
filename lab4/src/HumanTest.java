public class HumanTest {
    public static void main(String[] args){
        Head head = new Head("blue", 135);
        Leg lleg = new Leg(39, true);
        Leg rleg = new Leg(39.5, false);
        rleg.setHair(false);
        Hand lhand = new Hand(false);
        Hand rhand = new Hand(true, "black");
        rhand.setManicure(false);
        Human someone = new Human(170, 65, 'F', head, lleg, rleg, lhand, rhand);

        System.out.print(someone);
    }
}