import java.io.*;
class R_S{
    String s_name;
    String loc;
    String Sec_name;
}
class bild extends R_S{
    String b_name;
    int a_n;
}
class appart extends bild{
    int appartn;
    String owner;
    String m_n;
}
public class A2T4 {
    public static void main(String[] args) {
        R_S r=new R_S();
        bild b1=new bild();
        bild b2=new bild();
        bild b3=new bild();
        String l=null;
        try{
            BufferedReader b=new BufferedReader(new FileReader("A2T4.csv"));
            while((l=b.readLine())!=null){
                String []ap=l.split(",");
                System.out.println(ap[0]+" "+ap[1]+" "+ap[2]+" "+ap[3]);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
