public class array_lcm
{
    public static void main(String[] args)
    {
        int arr[]={4,6,8,12,16};

        int i;
        for (i=1; ;i++)
        {
            if(i%arr[0]==0 && i%arr[1]==0 && i%arr[2]==0 && (i&arr[3])==0)
            {
                break;
            }
        }
        System.out.println("lCM of array:="+i);

    }
}

// {
//         int arr[]={4,6,8,12,16};
//
//         int i;
//         for (i=1; ;i++)
//         {
//         if(i%arr[0]==0 && i%arr[1]==0 && i%arr[2]==0 && (i&arr[3])==0)
//         {
//         break;
//         }
//         }
//         System.out.println("lCM of array:="+i);
//
//         }
