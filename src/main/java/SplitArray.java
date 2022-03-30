public class SplitArray {

    public static void main(String[] args) {
        String strValue = "Carl,Susie,Fredrick,Bob,Erik";

        String[] convertedStringArray = strValue.split(",");

        for(int i=0; i < convertedStringArray.length; i++){
            System.out.println(convertedStringArray[i]);
        }
    }
}
