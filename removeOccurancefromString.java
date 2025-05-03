//WAP to print the removeOccurance of the given string ....

//example of given the string is
// Bijay Prasad Chauhan
//the output is:
// Bijy Prsd Chuhn
class Main {
    public static void main(String[] args) {
        System.out.println("The removeOccurance. ");
        //Taking the string of my choice...
        String str="BijAy prasad Chauhan";
        //function calling for removeOccurance...
        String ans=removeOccurance(str,0);
        //print the removeOccurance
        System.out.print(" "+ans );
    }
    public static String removeOccurance(String str,int idx){
        //base case
        if(idx==str.length()){
            return " ";
        }
        //recursion calling ....
        String ans=removeOccurance(str,idx+1);
        //taking the currCharacter from the string 
        char currChar=str.charAt(idx);
        
        //compare the current character from a and return the removeOcuurance string....
        if(currChar!='a'&& currChar!='A'){
            return currChar+ans;
        }else{
            return ans;
        }
    }
}