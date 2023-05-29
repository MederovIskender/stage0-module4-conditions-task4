package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = first;
        if (second>max){
            max = second;
        }
        if (third>max){
            max=third;
        }
        System.out.println(max);
    }
}
