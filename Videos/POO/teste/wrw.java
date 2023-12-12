import java.util.ArrayList;
import java.util.Scanner;

class CD {
    String title;
    String artist;
    int year;

    public CD(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CD: " + title + " by " + artist + " (" + year + ")";
    }
}

class DVD {
    String title;
    String director;
    int year;

    public DVD(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    @Override
    public String toString() {
        return "DVD: " + title + " directed by " + director + " (" + year + ")";
    }
}

public class CDandDVDCollection {
    public static void main(String[] args) {
        ArrayList<CD> cdCollection = new ArrayList<>();
        ArrayList<DVD> dvdCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar CD");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Listar CDs");
            System.out.println("4. Listar DVDs");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (choice) {
                case 1:
                    System.out.println("Digite o título do CD:");
                    String cdTitle = scanner.nextLine();
                    System.out.println("Digite o nome do artista:");
                    String cdArtist = scanner.nextLine();
                    System.out.println("Digite o ano de lançamento:");
                    int cdYear = scanner.nextInt();
                    cdCollection.add(new CD(cdTitle, cdArtist, cdYear));
                    break;
                case 2:
                    System.out.println("Digite o título do DVD:");
                    String dvdTitle = scanner.nextLine();
                    System.out.println("Digite o nome do diretor:");
                    String dvdDirector = scanner.nextLine();
                    System.out.println("Digite o ano de lançamento:");
                    int dvdYear = scanner.nextInt();
                    dvdCollection.add(new DVD(dvdTitle, dvdDirector, dvdYear));
                    break;
                case 3:
                    System.out.println("CDs na coleção:");
                    for (CD cd : cdCollection) {
                        System.out.println(cd);
                    }
                    break;
                case 4:
                    System.out.println("DVDs na coleção:");
                    for (DVD dvd : dvdCollection) {
                        System.out.println(dvd);
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }
}