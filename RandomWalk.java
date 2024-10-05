public class RandomWalk{
    public static void main (String[]args){
        int total = 0;
        int times = 0;
        int max = 0;
        while (times < 50){
            int counter = 0;
            double num = 0.0;
            while (num>=-3.5 && num<=3.5){
                num += (int)(Math.random()*2)*2-1;
                counter = counter += 1;
            }
            total += counter;
            if (counter>max){
                max = counter;
            }
            times += 1;
        }
        System.out.println((total/50.0) + " is the average");
        System.out.println(max + " is the maximum number of steps");
    }
}