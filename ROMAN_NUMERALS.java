import java.util.*;
class ROMAN_NUMERALS
{
public static void main(String[] args)    
{
   
   
    int z = 0;
    int j = 1;
    int s = 0;

    Scanner o = new Scanner(System.in);

    System.out.println("Enter your  number");
    String a= o.nextLine();

     a += 'P';

     

    while(true)
    {

        if(check(a.charAt(z)) >= check(a.charAt(j)))
            s = s + check(a.charAt(z)) + check(a.charAt(j));
        else
            s = s + (check(a.charAt(j)) - check(a.charAt(z)));

        if(z == (a.length()-2)|| j == (a.length()-2))
            break;
        else {
            z = z + 2;
            j = z + 1;
        }
    }

    System.out.println("Your Number is "+s);

}

public static int check(char c)
{
    switch(c)
    {
       case 'I' : return(1);
        case 'V' : return(5);
        case 'X' : return(10);
        case 'L' : return(50);
        case 'C' : return(10);
        case 'D' :return(500);      
        case 'M' : return(1000);
        case 'P' : return(0);           
        default:  return(0);

    }
}
}

