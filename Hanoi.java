
// JAVA recursive function to
// solve tower of hanoi puzzle

import java.io.*;
import java.math.*;
import java.util.*;
class Hanoi {
 
    // Driver code
    public static void main(String args[])
    {
        int N = 2;
 
        // A, B and C are names of towers
        toh(N, 'A', 'C', 'B');
    }
    static void toh(int topN, char from, char inter, char to)
    {
        if (topN == 0) {
            return;
        }
        toh(topN - 1, from, to, inter);
        System.out.println("Move disk " + topN + " from tower " + from + " to tower " + inter);
        toh(topN - 1, to, inter, from);
    }
}
 