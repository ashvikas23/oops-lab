import java.util.*;

class mtables extends Thread
{
    int n;

    mtables(int n)
    {
        this.n = n;
    }

    public void run()
    {
        for(int i = 0; i <= n; i++)
        {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class prime extends Thread
{
    int n;

    prime(int n)
    {
        this.n = n;
    }

    public void run()
    {
        System.out.println("Prime numbers are:");
        int count = 0;
        int num = 2;

        while(count < n)
        {
            int factors = 0;

            for(int i = 1; i <= num; i++)
            {
                if(num % i == 0)
                {
                    factors++;
                }
            }

            if(factors == 2)
            {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}

class thread
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int muln, primen;

        System.out.println("Enter n:");
        muln = sc.nextInt();
        mtables t1 = new mtables(muln);

        System.out.println("Enter n:");
        primen = sc.nextInt();
        prime t2 = new prime(primen);

        t1.start();
        t2.start();
    }
}
