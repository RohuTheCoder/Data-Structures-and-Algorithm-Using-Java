public class PalindromeCheck {
    static boolean isPalindrome(String str,int start,int end)
    {
        if(start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end))
                &&(isPalindrome(str, start+1, end-1));
    }
    public static void main(String[] args) {
        String str1 = "abbcbba";
        String str2 = "abba";
        String str3 = "geeks";
        int start = 0;
        int end = str1.length()-1;
        boolean result = isPalindrome(str1,start,end);
        if(result == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
