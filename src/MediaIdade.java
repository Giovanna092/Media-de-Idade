import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite a idade da pessoa 1");
        int idade1 = leitor.nextInt();

        System.out.println("Digite a idade da pessoa 2");
        int idade2 = leitor.nextInt();

        System.out.println("Digite a idade da pessoa 3");
        int idade3 = leitor.nextInt();

        int media = (idade1+idade2+idade3)/3;
        

        if (media > 0 && media <= 25) {
            System.out.println("Jovem!");
        } 

        else if (media >= 26 && media <= 60) {
            System.out.println("Adulta!");
        } 

        else if (media >= 60) {
            System.out.println("Idosa!");
        }

        
        leitor.close();

    }
}
