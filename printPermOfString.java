/*write a code and print the permutation of string...in the given bellow
ABCD 
 ABC 
 ABD 
 AB 
 ACD 
 AC 
 AD 
 A 
 BCD 
 BC 
 BD 
 B 
 CD 
 C 
 D 
  */
  class Main {
    public static void printPerm(String str,int idx, String newString){
            if(idx==str.length()) {
                System.out.println(newString + " ");
                return;
            }
            char currChar = str.charAt(idx);
            printPerm(str, idx+1, newString+currChar);
            printPerm(str, idx+1, newString);
        } 
    public static void main(String[] args) {
            System.out.println("");
            String str="ABCD";
            printPerm(str,0," ");
        }
    }