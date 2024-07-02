
public class Persantage {
	public static void main(String args[])
    {
        int per=75;
        if(per>80)
        {
            System.out.println("Grade A");
        }
        else  if(per<80&&per>70)
        {
            System.out.println("Grade B");
        }
        else if(per<70&&per>60)
        {
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
