class Solution {
    public int[] maxSubsequence(int[] a, int k) {
        
        int n=a.length;
        int [] v=Arrays.copyOfRange(a,0,n);
        int [] ans=new int[k];
        
        Arrays.sort(v);
        HashMap<Integer, Integer> m=new HashMap< Integer, Integer>();
        
        for( int i=0;i<n-k;i++) m.put(v[i],m.getOrDefault(v[i], 0)+1);
        
        int i=0;
        for( int x:a){
            if( m.containsKey(x)){
                if(m.get(x)==1) m.remove(x);
                else
                m.put(x,m.get(x)-1);
            }
            else{
                ans[i++]=x;
            }
        }
        return ans;
    }
}