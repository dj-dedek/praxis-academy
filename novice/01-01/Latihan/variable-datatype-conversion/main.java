package variable-datatype-conversion;

public class main {
    public static void main(String[] args) {

        int n = Integer.parseInt("5");
        
        String s = Integer.toString(9);

        double d = Double.parseDouble("0.5");

        float f = (float)0.001;

        double dub = (double)0.7f;


        String nums = "22";

        int num = ytc.StringToInt(nums);

        int i = 99;

        String is = ytc.IntToString(i);

    /*

        float range: from 1.40129846432481707e-45 to 3.40282346638528860e+38
        double range: from 1.7e-308 to 1.7e+308
        double = 8 bytes of storage space, float = 4 bytes of storage space

    */
    }
}