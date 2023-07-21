public class outer_inner
{
    static int x=34;
    static class inner
    {
        static int y=50;

        public static void main(String[] args)
        {
            System.out.println(outer_inner.x);
            System.out.println(inner.y);
        }

    }
}
