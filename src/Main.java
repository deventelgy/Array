public class Main {
    public static void main(String[] args)
    {
        float[] theValues = new float[3];
        theValues[0]=10.0f;
        theValues[1]=20.0f;
        theValues[2]=30.0f;
        float suma = 0.0f;

        for(int i=0;i<theValues.length;i++)
            suma+=theValues[i];
        System.out.println("La suma es: "+suma);
    }
}