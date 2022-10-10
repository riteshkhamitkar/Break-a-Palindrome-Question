class Solution {
    public String breakPalindrome(String palindrome) {
      if(palindrome.length()==1) return "";
      StringBuffer sbr = new StringBuffer(palindrome);
     	for(int i=0; i<palindrome.length()/2; i++){
        if(palindrome.charAt(i)!='a'){
          sbr.setCharAt(i,'a');
          break;
        }
      }
      if(palindrome.contentEquals(sbr)) sbr.setCharAt(palindrome.length()-1,'b');
      return sbr.toString();
    }
}
