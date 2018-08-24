/**
 * Created by fgul on 05/08/2018.
 */
public class FilmArray {

    private Film[] filmArray;

    /**
     * The size of the FilmArray (the number of elements it contains).
     *
     */
    private int size;

    /**
     * The length of the FilmArray .
     *
     */
    private int initialCapacity;

    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Constructs an empty film list with an initial capacity of ten.
     */
    public FilmArray() {
        this.initialCapacity = DEFAULT_CAPACITY;
        filmArray = new Film[DEFAULT_CAPACITY];
    }

    public FilmArray(Film[] filmArray, int initialCapacity) {
        this.initialCapacity = initialCapacity;
        filmArray = new Film[initialCapacity];
    }

    // Which is like insert, only in does the insert at the end of the array.
    public void add(Film film) {

        if (size == initialCapacity) {
            resize();
        }

        filmArray[size] = film;
        size++;

    }

    //resize the list length. it doubles the length of the list.
    private void resize() {

        //doubles the size of filmArray
        Film[] newFilmArray = new Film[initialCapacity * 2];

        //move from items of filmArray to newFilmArray
        for (int i = 0; i < initialCapacity; i++) {
            newFilmArray[i] = filmArray[i];
        }

        //assigment newFilmArray to filmArray
        filmArray = newFilmArray;

        this.initialCapacity = initialCapacity * 2;
    }

    //get number of elements it contains
    public int size() {
        return this.size;
    }

    //whether the filmArray contains the film or not
    public boolean contains(String  filmAdi) {

        for (int i = 0; i < size - 1; i++) {
            if(filmAdi.equals(filmArray[i].getTitle())) {
                return true;
            }
        }

        return false;
    }

    public void insert(int index, Film film) {

        // Check size
        if (size == initialCapacity) {
            resize();
        }

        // Copy up
        for (int j = size; j > index; j--) {
            filmArray[j] = filmArray[j-1];
        }

        // Insert
        filmArray[index] = film;
        size++;
    }

    public void delete(int index) {
        // Copy down
        for (int j = index; j < size - 1; j++) {
            filmArray[j] = filmArray[j + 1];
        }
        size--;
    }


    public Film get(int index) {
        return (Film)filmArray[index];
    }

    public void set(int index, Film film) {
        filmArray[index] = film;
    }



    // print the film in the filmArray
    public void displayTheFilms() {
        for (int i = 0; i < filmArray.length; i++) {
            System.out.println(filmArray[i].toString());

        }
    }


}
