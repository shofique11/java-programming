//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //mutable onject
//        StringBuffer stringBuffer = new StringBuffer("Shofique");
//        stringBuffer.append(" Shahariar");
//        System.out.println(stringBuffer);
        //immutable object
//        String message = new String("Java");
//        message.concat(" Programming");
//        System.out.println(message);

//        String str = "python";
//        String updateString = str + ".com";
//        str = str.concat(" Programming");
//        System.out.println(str);
//        System.out.println(updateString);

        //Check stringBuilder is faster than StringBuffer
        long st,et;
        StringBuffer str1 = new StringBuffer();
        st = System.currentTimeMillis();
        for(int i =0; i<1000000; i++)
        {
            str1.append("Testing StringBuffer");
        }
        et = System.currentTimeMillis();
        System.out.println("Buffer taking time: "+ (et - st)+ " Milli Seconds");
        StringBuilder str2 = new StringBuilder();
        st = System.currentTimeMillis();
        for(int j=0; j<1000000; j++)
        {
            str2.append("Testing StringBuilder");
        }
        et = System.currentTimeMillis();
        System.out.println("Builder taking time: "+ (et - st) + " Milli Seconds");

    }
}