public class RandomWalk{
    public static void main (String[]args){
        double num = 0.0;
        int counter = 0;
        int total = 0;
        int times = 0;
        int max = 0;
        while (times < 50){
            while (num>=-3.5 && num<=3.5){
                num += (int)(Math.random()*2)*2-1;
                counter += 1;
                times += 1;
            }
            total += counter;
            if (counter>max){
                max = counter;
            }
        }
        System.out.println((total/50) + " is the average");
        System.out.println(max + " is the maximum number of steps");
    }
}