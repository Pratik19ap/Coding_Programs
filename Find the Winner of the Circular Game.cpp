//Programmed in C++ | Author: Anshuman Pratik 
//func(n,k) depends on func(n-1,k) + k since, k extra rotation for next friend in Loop. If value exceeds N, then take mode(%) by n. Hence,[func(n-1,k)+k]%n gives winner.

class Solution {
public:
    int func(int n, int k){
        if(n==1)
            return 0; //Modulus range lies 0 to (n-1)
    
    return (func(n-1, k)+k) %n;
    }
    int findTheWinner(int n, int k) {
        int win = func(n,k);  //Results function with Indexing (0,1,2...n-1)
        return (win+1);
        
    }
};
