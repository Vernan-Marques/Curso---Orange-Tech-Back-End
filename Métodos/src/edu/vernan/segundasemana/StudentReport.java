package edu.vernan.segundasemana;
public class StudentReport {
    public static void main (String[] args) {

        int finalMedia = 8;

        if(finalMedia < 6)
            System.out.println("\nREPROVADO! :-(");
        else if (finalMedia == 6)
            System.out.println("\nVOCÊ ESTÁ DE RECUPERAÇÃO :-|");
        else
            System.out.println("\nAprovado! :-)");

    }
}
