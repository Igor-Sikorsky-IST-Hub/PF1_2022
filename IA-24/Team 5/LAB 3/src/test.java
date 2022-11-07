public class test
{

    public static void question13()
    {
        System.out.println("Question 13:");

        boolean a = false;
        boolean b = false;        
        if (a=false) {
            System.out.println("a is false");
        } 
        if (b=true) {
            System.out.println("b is true");
        }
        if (a=b) {
            System.out.println("a = b");
        }       
    }

    public static void question14()
    {
        System.out.println("Question 14:");

        int a = 1;
        a++;
        ++a;        
        switch(a) {
            case 1: System.out.println("1");
            case 2: System.out.println("2");
            case 3: System.out.println("3");
            case 4: System.out.println("4");            
        }
    }

    public static void question15()
    {
        System.out.println("Question 15:");
        double sum = 0;                
        // Let's find: 1 + 1/2 + 1/3 + 1/4 + 1/5 + ...
        for(int i=1; i<10; i++) {
            sum = sum + 1/i;
        }
        System.out.println(sum > 1);
        System.out.println("sum = " + sum);

    }

    public static void main(String [] args)
    {
        System.out.println("Test for LAB 3");

        question13();
        question14();
        question15();

    }
}

