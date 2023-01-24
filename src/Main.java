import Rasa.Human;
import Rasa.Navi;

public class Main {
    public static void main(String[] args){
        Human Jake = new Human();
        System.out.println(Jake.getBuyBread() + " and " + Jake.getBuyMilk());
        System.out.println();
        Navi Tsutai = new Navi();
        System.out.println(Tsutai.getFlyIcran());
    }

}
