import java.util.Scanner;

public class string_builder {
    public static void main(String[] args) {
//        StringBuilder demoText = new StringBuilder("Hello");
//        demoText.append(" world");
//        demoText.insert(3, ",");
//        demoText.delete(5, 7);
//        demoText.replace(3, 8, "Again");
//        demoText.reverse();
//        System.out.println(demoText);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite varda: ");
        String firstName = scanner.nextLine();
        System.out.print("Vartotojo vardas yra: " + firstName);
        scanner.close();
    }
}
