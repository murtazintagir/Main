import Rasa.Human;
import Rasa.Navi;

public class Main {
    public static void main(String[] args){
        Human Jake = new Human();
        Jake.BuyBread();
        Jake.BuyMilk();
        System.out.println(Jake.getAge(25));
        Navi Tsutai = new Navi();
        Tsutai.FlyIcran();
    }

}
