public class SubstringString {

    public static void main(String[] args) {
        String str = "Ok this is not as long!";

        int index1 = str.indexOf("ok");
        int index2 = str.indexOf('t');
        int index3 = str.indexOf('n', 3);
        int index4 = str.indexOf("as", 1);


        System.out.println(str.substring(11, 22));
        }

    }
