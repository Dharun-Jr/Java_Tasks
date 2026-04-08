  public static boolean isAnagram(String s, String t) {
        char[] f1=new char[26];
        char[] f2=new char[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            f1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            f2[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(f1,f2))
        {
            return true;
        }
      
            return false;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));
    }
}
