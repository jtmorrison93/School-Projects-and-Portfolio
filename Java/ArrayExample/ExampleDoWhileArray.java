public class ExampleDoWhileArray
{
    public static void main(String [ ] arg)
    {
        int count = 0;
        int[] myGrades = {85,92,88,97,82,89,95};
        
        do
        {
            System.out.println(myGrades[count]);
            count++;
        } while (count < 7);
    }
}