package day22;

public class CanvaDayLinkGenerator {
    public static void main(String[] args) {
        String url = "https://learn.cybertekschool.com/courses/278/modules#";
        String msg = "This will lead you to day ";

        for (int day = 1; day <=22 ; day++) {
            System.out.println(msg + day);
            System.out.println(url+(day+3296));


        }
    }
}
