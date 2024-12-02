public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        for(int i= 0; i<str.length();i++){
            if(str.charAt(i)>'A'&& str.charAt(i)<'Z'){
                str=str.substring(0,i) + (str.charAt(i)+32) + str.substring(i+1, str.length());
            }
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if(str2.length()>str1.length())
            return false;
        int j;
       
        for(int i= 0;i<str1.length();i++){

            if(str1.charAt(i)==str2.charAt(0)){

                j=0;
                for(int k=i ;k<str1.length() && j<str2.length(); k++){
                    if(str1.charAt(k) != str2.charAt(j))
                        break;
                    j++;
                }
                if(j==str2.length())
                    return true;
            }

        }
        return false;
    }
}
