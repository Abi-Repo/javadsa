public class palindromeornot {
    static void main() {
        int x = 120;

        boolean result = palindromenumber(x);
        System.out.println(result);
    }
    static boolean palindromenumber(int x) {

        String str = String.valueOf(x);
        String og = "";
        for (int i = 0; i < str.length() ; i++) {
            og = String.valueOf(str.charAt(i)) + og;
        }
        if(og.equals(str)){
            return true;
        }
        return false;
    }
}
