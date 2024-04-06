import java.util.Scanner;

public class zad1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matematyka;
        int chemia;
        int wf; 
        int angielski; 
        int polski;

        System.out.print("Podaj ocenę z matematyki: ");
        matematyka = scanner.nextInt();

        System.out.print("Podaj ocenę z chemii: ");

        chemia = scanner.nextInt();
        
        System.out.print("Podaj ocenę z wf: ");

        wf = scanner.nextInt();

        System.out.print("Podaj ocenę z angielskiego: ");
        
        angielski = scanner.nextInt();

        System.out.print("Podaj ocenę z polskiego: ");

        polski = scanner.nextInt();

        double srednia = (matematyka + chemia + wf + angielski + polski) / 5.0;

        System.out.printf("Średnia ocen wynsoi: %.2f", srednia);
        


    }
    
}
