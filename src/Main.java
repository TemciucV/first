
public class Main {

    public static void main(String[] args) {

        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

        Double[] str=new Double[args.length];
        for(int i=0;i<args.length;i++){
            str[i]=Double.valueOf(args[i]);
            System.out.println(str[i]);
        }

        findAverage(str);


    }
    public static double findAverage(Double[] args){
       double sum=0;
       int count=0;
        for(int i=0;i<args.length;i++){
            sum+=args[i];
            System.out.println(sum);
            count++;
        }
        return sum/count;
    }
}
