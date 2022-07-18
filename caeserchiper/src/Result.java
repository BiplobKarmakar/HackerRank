public class Result {
    public static String caesarCipher(String s, int k)
    {
        // Write your code here okffng-Qwvb
        String result="";
        String s1=s.toLowerCase ();
        for(int i=0;i<s.length ();i++)
        {
            char ch=s.charAt (i);
            if(Character.isAlphabetic(ch))
            {
                int base=Character.isLowerCase (ch)?'a':'A';
                int b=(int)((ch-base+k)%26+base);
                result=result+(char)(b);

            }
            else
            {
              result =result+ch;
            }

            //isalpha()
           // result =result+(s.charAt (i)+k);
        }

        return result;

    }
    public static void main(String[] args) {

       String s= "middle-Outz";
       int k=2;


       // if(!Character.isAlphabetic(c)) return c;
       // int base = Character.isLowerCase(c) ? 'a' : 'A';
       // return (char)((c + k - base) % 26 + base);
       // char  a='y';
        //int con=(int)a;
        //int b=(int)((a-'a'+2)%26+'a');
        System.out.println (caesarCipher (s,k));


    }
}
