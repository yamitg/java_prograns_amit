package array_programs;

public class fruit_drive
{
    public static void main(String[] args)
    {
        fruit_class f[]=new fruit_class[5];
//        f[0].
        f[0]=new fruit_class(500,"green",10);
        f[1]=new fruit_class(600,"brown",5);
        f[2]=new fruit_class(700,"red",8);
        f[3]=new fruit_class(800,"orange",9);
        f[4]=new fruit_class(900,"Yellow",2);
//        f[0].display_details();
//        f[1].display_details();
//        f[2].display_details();
//        f[3].display_details();
//        f[4].display_details();
        for (int i=0;i<f.length;i++)
        {
            f[i].display_details();
        }


    }
}
