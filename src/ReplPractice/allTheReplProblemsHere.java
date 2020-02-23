package ReplPractice;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class allTheReplProblemsHere {

    public static void main(String[] args) {

    }

    public static int[] do_switch(int[] i)
    {
int temp=i[0];
i[0]=i[i.length-1];
i[i.length-1]=temp;
return i;
    }
}
