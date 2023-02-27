package org.example;

public class JunitDemo {
    public static void main(String[] args)
    {
        int numberSquared = square(3);
        System.out.println("3 squared is " + numberSquared);

        int numberOfA = countA("Sabres");
        System.out.println("There is " + numberOfA + " A in the word Sabres");
    }
    public static int square(int x)
    {
        return x*x;
    }

    public static int countA(String word)
    {
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i)=='a' || word.charAt(i)=='A'){
                count++;
            }
        }
        return count;
    }
}