public class PrintAllPermutations {
    public static void main(String[] args) {
        String s ="ABCD";
        int i = 0;
        permute(s.toCharArray(),i);
    } 
    static void permute(char[] s,int i)
    {
        if(i==s.length-1)
        {
            System.out.println(String.valueOf(s));
            return;
        }
        for(int j=i;j<s.length;j++)
        {
            swap(s,i,j);
            permute(s, i+1);
            swap(s,i,j);
        }
    }
    static void swap(char[] s,int i,int j)
    {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }   
}
