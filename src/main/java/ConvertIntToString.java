public class ConvertIntToString {
    public static void main(String[] args) {
        int value = 20;
        String strVal = "20";
        String finalValue = strVal.concat(Integer.toString(value));
        System.out.println(finalValue);
    }

}
