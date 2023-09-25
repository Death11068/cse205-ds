class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getActual(s).equals(getActual(t));
    }

    public String getActual(String input){
        StringBuilder actualString = new StringBuilder();
        int hashcounter = 0;

        for(int i = input.length -1 ; i >= 0; i--){
            if(input.charAt(i) == '#'){
                hashcounter++;
                continue;
            }

            if(hashcounter > 0){
                hashcounter--;
            }else{
                actualString.insert(0,input.charAt(i));
            }
        }
        return actualString.toString();

    }
}