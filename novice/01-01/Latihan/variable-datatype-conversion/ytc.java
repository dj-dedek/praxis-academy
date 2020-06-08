package variable-datatype-conversion;

public static int StringToInt(String s)
{
    return Integer.parseInt(s);
}

public static String IntToString(int n)
{
    return Integer.toString(n);
}

public static int DoubleToInt(double d)
{
    return (int)Math.round(d);
}

public static int FloatToInt(float f)
{
    return (int)Math.round(f);
}

public static String DoubleToString(double d)
{
    return Double.toString(d);
}

public static Double StringToDouble(String s)
{
    return Double.parseDouble(s);
}