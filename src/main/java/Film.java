/**
 * Created by fgul on 05/08/2018.
 */

public class Film {

    String title;
    int yapimTarihi;
    String turu;

    public Film() {
    }

    public Film(String title, int yapimTarihi, String turu) {
        this.title = title ;
        this.yapimTarihi = yapimTarihi;
        this.turu = turu;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYapimTarihi() {
        return yapimTarihi;
    }

    public void setYapimTarihi(int yapimTarihi) {
        this.yapimTarihi = yapimTarihi;
    }

    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", yapimTarihi=" + yapimTarihi +
                ", turu='" + turu + '\'' +
                '}';
    }
}
