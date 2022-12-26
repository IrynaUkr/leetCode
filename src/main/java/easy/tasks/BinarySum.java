package easy.tasks;

public class BinarySum {
    public static String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int pointerA = a.length() - 1;
        int pointerB = b.length() - 1;
        int dec = 0;
        while (pointerA >= 0 || pointerB >= 0|| dec ==1) {
            int aSign=0;
            int bSign = 0;
            if(pointerA>=0){
                aSign=a.charAt(pointerA) - 48;
            }
            if(pointerB>=0){
                bSign = b.charAt(pointerB) - 48;
            }

            int digitSum = aSign + bSign + dec;
            if (digitSum < 2) {
                sum.append(digitSum);
                dec = 0;
            } else if(digitSum == 2) {
                sum.append(0);
                dec = 1;
            }else{
                sum.append(1);
                dec = 1;
            }
            pointerB--;
            pointerA--;
        }
        sum.reverse();
        return sum.toString();
    }

    public static void main(String[] args) {
        //"11110"
        String s = addBinary("1111", "1111");
        System.out.println(s);
    }

}
