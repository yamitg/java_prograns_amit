import java.sql.SQLOutput;

public class Stringcases
{
    public static void main(String[] args) {
//        Ques.1 := Find the length of the string.
//        Answer:=
        String name = "Amit Kumar";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

//        Ques.2 := To make all the letters in lower case.
//        Answer:=
        String lowerString = name.toLowerCase();
        System.out.println(lowerString);


//         Ques.3 := To make all the letters in Upper case.
////        Answer:=
        String upperString = name.toUpperCase();
        System.out.println(upperString);

//        Ques.4 := STring trim();
//        Answer:=
        String sentence = "    i am coder block coder     .";       // cancel the space before and afterv the line.
        String trimedString = sentence.trim();
        System.out.println(trimedString);

//          int value1=name.substring();
        System.out.println(name.substring(3));  //  Start from index number:=3


//         subString();   ------>  Starting and ending number are include but show only starting.
        System.out.println(name.substring(3, 10));
        System.out.println(name.substring(3, 9));

//        Ques.5 := Replace the letter in word or sentence.
//        Answer:=
        System.out.println(name.replace('i', 'q'));
        System.out.println(name.replace("mi", "er"));      // used "" instead of ''


//        Ques.6 := if STring Starts with "ha" is or  isn't . Give us true and false .
//        Answer :=

        System.out.println(name.startsWith("ha"));

//        Ends with "ry" give us true nmad false;
        System.out.println(name.endsWith("ty"));
        System.out.println(name.endsWith("ar"));

//        Ques. 7:= Position of a Chatractor in a String.
//        Answer:
        System.out.println(name.charAt(7));

//        Find Index of a String Charactor.

//        int index1 =name.indexOf(m);
        System.out.println(name.indexOf("m"));
        System.out.println(name.indexOf("m",3));
        System.out.println(name.lastIndexOf("a"));      // In last where is A standands .
        System.out.println(name.lastIndexOf("arr"));    // if "arr" is not in string than it give us -1 .
        System.out.println(name.lastIndexOf("arr",4));    // if "arr" is not in string than it give us -1 in 4 index only
        System.out.println(name.equals("Amit Kumar"));       // equals to string name is equal to Amit kumar its give us true otherwise False .
        System.out.println(name.equals("Amit KuMar"));      //false
        System.out.println(name.equalsIgnoreCase("Amit KUMar"));      // Only match the value if it is lower case or upper case  doen't matter .

        System.out.println( " i am escape sequence \"double quote");
        System.out.println( " i am escape sequence \\double quote");
        System.out.println( " i am escape sequence \tdouble quote");
        System.out.println( " i am escape sequence \'double quote");


        System.out.println();

    }
}
