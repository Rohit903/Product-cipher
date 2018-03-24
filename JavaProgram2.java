/* Java Program Example - Find Frequency of Character */
		
import java.util.Scanner;

public class JavaProgram2
{
   public static void main(String args[])
   {
        int ci, i, j, k, l=0;
        String str, str1;
        char c, ch;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        str=scan.nextLine();
        int kk;
	int s;
	StringBuffer str11 = new StringBuffer();
	//char sf[]=new char[str.length()];
	for(int ki=0;ki<str.length();ki++)
	{
		s=(str.charAt(ki)+5)%123;
		if(s>=97 && s<=123)
		{
			//System.out.println(s);		
			str11.append((char)s);
		}
		else 
		{
			str11.append((char)(s+97));
		}
		
	}
/*	for(int ko=97;ko<123;ko++)
	{
		System.out.println((char)ko);
	}

	System.out.println("w value:"+(char)('w'+0));*/
	System.out.println("Encrypted strings:");
	System.out.println(str11);
        i=str11.length();
	System.out.println("THE FREQUENCY TABLE IS:");
        for(c='A'; c<='z'; c++)
        {
            k=0;
            for(j=0; j<i; j++)
            {
                ch = str11.charAt(j);
	//	kk=(ch + 5);

                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println("The character " + c + " has occurred " + (float)k/i*100  + "%  of the string length");
            }
        }
   }
}
