import java.util.Date;

public class Paperbook extends Book{

    private String series;
    private String month;

    //Konstruktor

    public Paperbook(int pages, Date released, String title, String isbn, String series, String month){
        super (pages, released, title, isbn);
        this.series=series;
        this.month=month;
    }

    //Getter

    public String getSeries() {
        return series;
    }

    public String getMonth() {
        return month;
    }

    //Setter

    public void setSeries(String series) {
        this.series = series;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}


