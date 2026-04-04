class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] b=new int[26];
        int slen=s.length();
        int plen=p.length();
        for(int i=0;i<plen;i++){
            b[p.charAt(i)-'a']++;
        }
        
        List<Integer> res=new ArrayList<>();
        int[] a=new int[26];
        for(int r=0;r<slen;r++){
            a[s.charAt(r)-'a']++;
            if(Arrays.equals(a,b)){
                res.add(r-plen+1);
                a[s.charAt(r-plen+1)-'a']--;
            }
            else if(r>=plen-1)
            a[s.charAt(r-plen+1)-'a']--;
        }
        return res;
    }
}