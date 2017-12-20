/**
 * Created by hexd on 2017/12/18.
 */
public class TestMain {
    public static void main(String [] args){
        System.out.println("aaling");
        Data data = new Data();
        data.setDimention(1);
        data.setType(2);

        double[] d = new double[]{1.1,2.4,5.6,0.2};
        data.setVector(d);
        System.out.println (data.toString());
        System.out.println (data.toString());
    }
}
