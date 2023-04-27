package Bai1;
import java.io.*;
class LOG {
    private static LOG a = null;
    private LOG(){}
    public static LOG getInstance()
    {
        if(a==null)
        {
            a = new LOG();
        }
        return a;
    }
    public void writeLOG(int k)
    {
        if(k==3) 
        {
            // System.out.println("In danh sach san pham");
            try (FileWriter myWriter = new FileWriter("log.txt", true)) {
                myWriter.write("In danh sach san pham " + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==0) 
        {
            // System.out.println("Thoat chuong trinh");
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write("Thoat chuong trinh" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else if(k==1)
        {
            // System.out.println("Them xe may");
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write("Them xe may" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        else if(k==2)
        {
            // System.out.println("Them xe hoi");
            try (FileWriter myWriter = new FileWriter("log.txt",true)) {
                myWriter.write("Them xe hoi" + '\n');
                myWriter.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }    
    }
}
