package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int l = args.length;
        int[] a = new int[l];
        int evenCount = 0, oddCount = 0;
        System.out.println("Initial numbers: ");
        for (int i = 0; i < l; i++) {
            System.out.print(args[i] + " "); //Print out initial array of strings
            a[i] = Integer.parseInt(args[i]);
            if (a[i] % 2 == 0)
                evenCount++; //Counting how many even numbers exist within initial array
            else
                oddCount++; //Counting how many odd numbers exist within initial array
        }
        System.out.println("\nHappy numbers: ");
        for (int i = 0; i < l; i++) {
            int sum1 = 0, sum2 = 0;
            if (args[i].length() % 2 == 0)
            {
            for (int j = 0; j < args[i].length() / 2; j++) {
                sum1 += (int) args[i].charAt(j) - 48; // 0-9 chars are at 48-57 lines in character map
                sum2 += (int) args[i].charAt(args[i].length() - j - 1) - 48;
            }
                if (sum1==sum2)
                    System.out.print(args[i]+" ");
            }
        }
        System.out.println("\n3-digit numbers with all digits unique: ");
        for (int i = 0; i < l; i++) {
            int c=0;
            if (args[i].length() == 3) {
                for (int j=0; j<args[i].length()-1; j++)
                    if (args[i].charAt(j)!=args[i].charAt(j+1) )
                        c++;
                if (c==2) //two checks performed as True for 3-digit numbers
                        System.out.print(args[i]+" ");
            }
        }
        System.out.println("\nNumbers entirely divided by 3 or by 8: ");
        for (int i = 0; i < l; i++)
        {
            if (a[i]%3==0 || a[i]%8==0)
                System.out.print(a[i]+" ");
        }
        System.out.println("\nNumbers entirely divided by 5 and by 7: ");
        for (int i = 0; i < l; i++)
        {
            if (a[i]%5==0 && a[i]%7==0)
                System.out.print(a[i]+" ");
        }
        int[] even = new int[evenCount]; //Declaring arrays with known count of even
        int[] odd = new int[oddCount];   //and odd numbers
        evenCount = 0;
        oddCount = 0;
        for (int i = 0; i < l; i++) {
            if (a[i] % 2 == 0)
                even[evenCount++] = a[i];
            else
                odd[oddCount++] = a[i];
        }
        System.out.println("\nEven numbers: ");
        for (int i = 0; i < evenCount; i++)
            System.out.print(even[i] + " ");

        System.out.println("\nOdd numbers: ");
        for (int i = 0; i < oddCount; i++)
            System.out.print(odd[i] + " ");
        int max = 0, min = 0;
        for (int i = 0; i < l - 1; i++) {
            if (a[i + 1] > a[max])
                max = i + 1;
            if (a[i + 1] < a[min])
                min = i + 1;
        }
        System.out.println("\nMax number: " + a[max] + " Min number: " + a[min]);
        System.out.print("Numbers equal to half summerized neighbour numbers: ");
        for (int i=1; i<args.length-1; i++)
        {
            if (a[i]==(a[i-1]+a[i+1])/2 )
                System.out.print(a[i]+" ");
        }
    }
}
