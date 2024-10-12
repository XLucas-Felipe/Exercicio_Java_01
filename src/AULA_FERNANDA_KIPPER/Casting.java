package AULA_FERNANDA_KIPPER;

public class Casting {
    public static void main(String[] args) {
        int intNumero = 6;
        double doubleNumero = 6.0;

        //converter para double
        int convDoubInt = (int)doubleNumero;

        //converter para int
        double convIntDoub = intNumero;

        //converter para int
        String meuString = "10";
        int meuInt = Integer.parseInt(meuString);
        System.out.println(meuInt);

        //converter para String
        String minhaString = String.valueOf(meuInt);
    }
}
