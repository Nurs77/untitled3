package day15;

public class SubStringPractice {
    public static void main(String[] args) {
        String movie = "Lord Of The Ring";
        String wordOf = movie.substring(5, 7);
        System.out.println("wordOf = " + wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("word The = " + wordThe);

        int startingPoint = movie.indexOf(" ")+1;
        int endingPoint = movie.length();

        System.out.println("Second word till last : " + movie.substring(startingPoint, endingPoint));
        //if you include only one location it will run from that location untill the end
        String secondToLast = movie.substring(5);

        // reverse Lord of the Ring to ring of the lord

        System.out.println(movie.substring(12 )+" " +movie.substring(5,7)+" "+ movie.substring(8,11)+" "+movie.substring(0,4));
    }
}
