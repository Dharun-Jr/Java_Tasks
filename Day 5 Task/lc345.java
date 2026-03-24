class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] arr = s.toCharArray();

        while(start < end){
            while(start<end){
                char c = arr[start];
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    break;
                }
                start++;
            }
            while(end>=0){
                char c = arr[end];
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    break;
                }
                end--;
            }
            if(start<end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
        
    }
}
