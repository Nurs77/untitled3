package day43;

import day42.Movie;

public class MovieUtil {

    public static void main(String[] args) {



       Movie m1 = new Movie("Joker", 2.2, "Drama");
        Movie m2 = new Movie("Frozen_2", 1.5, "Family");
//        Movie m3 = new Movie("Pursuit of Happiness", 2.0, "Drama");
        printMovieInformation(m1);

        printMovieInformation(m2);
        printShoerterMovieName(m1,m2);
        Movie result = getJokerMovie();
        System.out.println("Name is: " + result.getName());

    }
    public static Movie getJokerMovie(){
        Movie jokerMovie = new Movie("Joker", 2.5 , "Drama");
        return jokerMovie;

    }

    public static void printMovieInformation(Movie movieObj){
        System.out.print("Movie name is: "+movieObj.getName());
        System.out.print(", movie lenght: "+ movieObj.getLength());
        System.out.println(", movie type is: " +movieObj.getType());
    }
    public static void printShoerterMovieName(Movie movieObj1, Movie movieObj2){
        if(movieObj1.getLength()<movieObj2.getLength()){
            System.out.println("shorter movie is "+movieObj1.getName());
        }else {
            System.out.println("shorter movie is "+movieObj2.getName());
        }
    }
    public static void printShorterMovieName(){

    }
}
