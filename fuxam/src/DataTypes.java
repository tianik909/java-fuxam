/**
 * Created by anik on 6/22/16.
 *
 * here I will learn about data types
 * such as int , double , float , char , bool , long
 */
public class DataTypes {
    public static void main(String[] args) {



        //int stands for integer
        int NormalNumber = 9;

        System.out.println(NormalNumber);
        //this prints out the value of NormalNumber

        //float stands for floating point number
        float FloatNumber = 9.1f;
        System.out.println(FloatNumber);
        /*this prints out the value of FloatNumber
        *NOTE : I added 'f' after the float number
        *REASON : java assumes float to be double by default
        * so to override it , I added the 'f' at the end
        */

        double DoubleNumber = 9.1;
        System.out.println(DoubleNumber);
        //SEE!!! no 'f' this time , you got it

        boolean BoolNumber = true;
        System.out.println(BoolNumber);
        /*NOTE : I must type boolean not "bool"
         *trying to assign 1 or 0 will result into error
         * because it will be treated as Integer
         */


    }
}
