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

    public Film get(int index) {
        return (Film)filmArray[index];
    }

    public void set(int index, Film film) {
        filmArray[index] = film;
    }


    // Which is like insert, only in does the insert at the end of the array.
    public void add(Film film) {

        if (size == initialCapacity) {
            resize();
        }

        filmArray[size] = film;
        size++;
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

    //get number of elements it contains
    public int size() {
        return this.size;
    }

    public void delete(String filmTitle) {
        //find index number of Film ,searching by filmTitle
        int index = findTheFilmIndex(filmTitle);
        if(index != -1 ) {
            for (int i = index; i < filmArray.length-1 ; i++) {
                filmArray[i] = filmArray[i+1];
                index++;
            }

            size--;  // decrement size
        }else {
            System.out.println("Can't find the film :" + filmTitle);
        }

    }

    //linear searching algorithm
    public int findTheFilmIndex(String filmTitle) {
        for (int index = 0; index <= filmArray.length-1 ; index++) {
            if(filmTitle.equals(filmArray[index].getTitle())) {
                return index ; //if the film can find, it will return index number of filmArray
            }
        }
        return -1; //if can't find the film , it will return -1
    }



    // print the film in the filmArray
    public void displayTheFilms() {
        for (int i = 0; i < filmArray.length; i++) {
            System.out.println(filmArray[i].toString());

        }
    }


    //resize the list length. it doubles the length of the list.
    private void resize() {
        Film[] newFilmArray = new Film[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newFilmArray[i] = filmArray[i];
        }
        filmArray = newFilmArray;
        initialCapacity = initialCapacity * 2;
    }







}
