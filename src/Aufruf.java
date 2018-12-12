import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf {

    public static void main(String[] args) {

        //Aufgabe 3

        Date date = new Date(118, 9, 2, 14, 9, 54);     //Jahre beginnt bei 1900 somit +118 =2018 und januar=0
        Book a = new Book (200, date, "My Book","125215-12521-73473");

        System.out.println("Aufgabe 3:");
        System.out.println("Das Buch hat "+ a.getPages()+" Seiten, wurde am "+a.getReleased()+ " veröffentlicht und hat den Titel "+a.getTitle());

        //Aufgabe 4

        List<Book> lieblingsbuecher = new ArrayList<>();

        lieblingsbuecher.add(new Book(200, date, "Zwerge 1", "125215-12521-73473")); //Element einfügen in arrayliste mit oder ohne positionsangabe möglich
        lieblingsbuecher.add(new Book(200, date, "Zwerge 2", "6437-623623-24254"));
        lieblingsbuecher.add(new Book(200, date, "Zwerge 3", "26326-734737-732473"));
        lieblingsbuecher.add(new Book(200, date, "Zwerge 4", "745854-124412-348743848"));
        lieblingsbuecher.add(new Book(200, date, "Zwerge 5", "672-5236236-123483475125"));

        System.out.println("\nAufgabe 4:");

        for(Book x : lieblingsbuecher){  //for-each Schleife
            System.out.println(x.getTitle()+ " hat "+ x.getPages()+ " Seiten und folgende ISBN: "+x.getIsbn()); // Ausgabe der schleife
        }

        //Aufabe 5
        List<Paperbook> paperbooks = new ArrayList<>();

        paperbooks.add(new Paperbook(200, date, "My Paperbook 1", "0000-00000-0000", "Serie", "April")); //add element einfügen mit oder ohne positionsangabe
        paperbooks.add(new Paperbook(210, date, "My Paperbook 2", "0000-00000-0000", "Serie", "April"));
        paperbooks.add(new Paperbook(240, date, "My Paperbook 3", "0000-00000-0000", "Serie", "January"));
        paperbooks.add(new Paperbook(100, date, "My Paperbook 4", "0000-00000-0000", "Serie", "March"));
        paperbooks.add(new Paperbook(140, date, "My Paperbook 5", "0000-00000-0000", "Serie", "October"));

        System.out.println("\nAufgabe 5:");

        for (Paperbook x : paperbooks){ //for-each schleife
            System.out.println(x.getTitle()+ " hat "+ x.getPages()+" Seiten und folgende ISBN: "+ x.getIsbn()+ " zusätzlich ist es im Monat "+x.getMonth()+" erschinen");
        }




    }
}
