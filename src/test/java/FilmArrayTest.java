import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by fgul on 05/08/2018.
 */
public class FilmArrayTest {

    private FilmArray array;

    @Before
    public void SetUp() throws Exception {
        array = new FilmArray();
    }

    @Test
    public void GetAndSet() throws  Exception {
        array.set(0, new Film("The Godfather",1972,"Drama"));
        Assert.assertEquals("The Godfather", array.get(0).getTitle());
    }

    @Test
    public void Delete() throws Exception {
        array.add(new Film("The Shawshank Redemption",1994,"Drama"));
        array.add(new Film("The Godfather",1972,"Drama"));
        array.add(new Film("The Dark Knight",2008,"Action"));

        array.delete("The Godfather");

        Assert.assertEquals(2, array.size());
        Assert.assertEquals("The Shawshank Redemption", array.get(0).getTitle());
        Assert.assertEquals("The Dark Knight", array.get(1).getTitle());

        array = new FilmArray();

        // ********************** the Last Item deleted ****************************************
        array.add(new Film("The Shawshank Redemption",1994,"Drama"));
        array.add(new Film("The Godfather",1972,"Drama"));
        array.add(new Film("The Dark Knight",2008,"Action"));

        array.delete("The Dark Knight");

        Assert.assertEquals(2, array.size());
        Assert.assertEquals("The Shawshank Redemption", array.get(0).getTitle());
        Assert.assertEquals("The Godfather", array.get(1).getTitle());
    }





}
