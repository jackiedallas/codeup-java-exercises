package movies;
import util.Input;

import java.util.Arrays;
import java.util.Objects;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    private static Movie[] movieDB = findAll();


    public static Movie[] addMovie(Movie[] movieArray, Movie newMovie) {
        Movie[] newMovies = Arrays.copyOf(movieArray, movieArray.length + 1);
        newMovies[newMovies.length - 1] = newMovie;
        return newMovies;
    }

    public static void choiceOne() {

        for (Movie movie : movieDB) {
            System.out.println(movie.getName());
        }
    }

    public static void choiceTwo() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getCategory(), "drama")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void choiceThree() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getCategory(), "musical")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void choiceFour() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getCategory(), "scifi")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void choiceFive() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getCategory(), "horror")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void choiceSix() {
        for (Movie movie : movieDB) {
            if (Objects.equals(movie.getCategory(), "comedy")) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void choiceSeven() {
        Input input = new Input();
        System.out.print("What's the name of the movie? ");
        String userMovieName = input.getString();
        System.out.println("userMovieName = " + userMovieName);
        System.out.print("What's the genre of your the movie? ");
        String userMovieGenre = input.getString();
        System.out.println("userMovieGenre = " + userMovieGenre);

        Movie newUserMovie = new Movie(userMovieName, userMovieGenre);
        movieDB = addMovie(movieDB, newUserMovie);
        for (Movie movie : movieDB) {
            System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
        }
    }

    public static void main(String[] args) {

        boolean confirm;
        do {
            Input input = new Input();

            System.out.print("0 - exit \n" +
                    "1 - view all movies \n" +
                    "2 - view movies in the drama category \n" +
                    "3 - view all movies in the musical category \n" +
                    "4 - view all movies in the scifi category \n" +
                    "5 - view all movies in the horror category \n" +
                    "6 - view all movies in the comedy category \n" +
                    "7 - add a movie \n"
            );
            System.out.print("What would you like to do? ");
            int userChoice = input.getInt();

            if (userChoice == 1) {
                choiceOne();
            } else if (userChoice == 2) {
                choiceTwo();
            } else if (userChoice == 3) {
                choiceThree();
            } else if (userChoice == 4) {
                choiceFour();
            } else if (userChoice == 5) {
                choiceFive();
            } else if (userChoice == 6) {
                choiceSix();
            } else if (userChoice == 7) {
                choiceSeven();
            }

            input.getString();
            System.out.print("Do you want to continue? [Y/N] ");
            String userConfirm = input.getString();
            confirm = userConfirm.equalsIgnoreCase("y");
        } while(confirm);

    }
}
