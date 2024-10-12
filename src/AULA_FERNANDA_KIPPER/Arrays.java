package AULA_FERNANDA_KIPPER;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList <String> nomes = new ArrayList<>();
        nomes.add("Arie Kun");
        nomes.add("V");
        nomes.add("Yuri Zahard");
        nomes.add("Ban");
        System.out.println(nomes.get(0));
        nomes.remove(0);
        System.out.println(nomes.get(0));

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
