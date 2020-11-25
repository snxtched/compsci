class Main {
  public static void main(String[] args) {
    int count = 0;
    for(int i = 0; i<words.length; i++){  //runs through each word within the array 
           int value = 0;
        for(int k = 0; k<words[i].length(); k++){    // runs through each LETTER within the word
      value += letterPlacement(words[i].charAt(k)); // value is equal to the index of the letters added together
        }
         if(isTriangle(value)){ // if the value is a triangle add to the count
               count++;
            }       
          }
           System.out.println(count); // return count, should equal to 162
        }
   
  public static int letterPlacement(char x){ //index of alphabet
    for(int i =0; i<alpha.length; i++){ //goes throught the alphabet (27 times including the space so A = 1 instead of 0)
      if(alpha[i] == x ) // checks characters
      return i; //return index of alphabet letter
    }
    return 0; //does nothing but necessary to run
  }

public static boolean isTriangle(int c){ // checking if its a triangle number 1, 3, 6, 10 etc
  int a = 1;
  int b = 2; 
while(a<c){
  a+=b;
  b++;
      }
  return a==c;
}
 }