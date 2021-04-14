import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticExemple {
  public static String nom = "yoman";

  public static void main(String[] args) {
    System.out.println(nom);
    Voiture v1 = new Voiture("Keven", Marque.VOLVO);
    Voiture v2 = new Voiture("Jacob", Marque.NISSAN);
    Voiture v3 = new Voiture("Yanou", Marque.MAZDA);
    v3.count = 12;
    Voiture.count_static = 15;
    List<String> list = Arrays.asList("bla", "bla");
    int distance = Voiture.calculDistance();
  }
}

