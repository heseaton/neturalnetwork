import java.util.Arrays;

/**
 * Created by hexd on 2017/12/18.
 */
public class Data {
    private double[] vector;
    private int type;
    private int dimention;

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDimention() {
        return dimention;
    }

    public void setDimention(int dimention) {
        this.dimention = dimention;
    }

    public Data(double[] vector, int type, int dimention) {
        this.vector = vector;
        this.type = type;
        this.dimention = dimention;
    }

    public Data() {
    }

    @Override
    public String toString() {
        return "Data{" +
                "vector=" + Arrays.toString(vector) +
                ", type=" + type +
                ", dimention=" + dimention +
                '}';
    }
}
