import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;



class FileManager
{
    static public File createFile()
    {
        File f = new File("C:\\\\Users\\\\ustjavafsdb113\\\\Desktop\\\\GIT\\\\Java-FSD\\\\Mock Programming Questions\\\\Questions\\\\Notepad\\\\21-10-22\\\\visitors.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        return f;
    }
    static public void writeFile(File fw,String record) throws Exception
    {
        
        
         Path fileName = Path.of( "C:\\Users\\ustjavafsdb113\\Desktop\\GIT\\Java-FSD\\Mock Programming Questions\\Questions\\Notepad\\21-10-22\\visitors.txt");
         
            
              
                 BufferedWriter out = new BufferedWriter(new FileWriter("C:\\\\Users\\\\ustjavafsdb113\\\\Desktop\\\\GIT\\\\Java-FSD\\\\Mock Programming Questions\\\\Questions\\\\Notepad\\\\21-10-22\\\\visitors.txt",true));
                 out.write(record+"\n");    
                 out.close();
    }
    static int i=0;
    static String a[]=new String[10];
    static public String[] readFile(File f) throws Exception
    {
        Scanner sc = new Scanner(f);
         
         
        while (sc.hasNextLine())
        {
            a[i]=sc.nextLine();
            
          
          i++;
        }
        return a;
    }
}




public class visitors_details{



   public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        char d;
        FileManager fi=new FileManager();
        File fw=fi.createFile();
        String a[]=new String[10];
        
        do
        {
System.out.print("\nEnter name : ");



String n=sc.next();
System.out.print("\nEnter phone number : ");
String p=sc.next();
System.out.print("\nEnter email : ");
String e=sc.next();
String text=n+","+p+","+e+";"+"\n";



fi.writeFile(fw, text);
System.out.println("Do you want to enter another record y/n");
d=sc.next().charAt(0);
        }while(d=='y');
        a=fi.readFile(fw);
        for(int i=0;i<fi.i;i++)
        System.out.println(a[i]);
    }



}