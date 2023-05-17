package Manager;

public class Manager {
    private String[] movies = new String[0];
    private int limit;

    public Manager() {
        this.limit = 5;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int result;
        if (movies.length < limit) {
            result = movies.length;
        } else {
            result = limit;
        }

        String[] tmp = new String[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
