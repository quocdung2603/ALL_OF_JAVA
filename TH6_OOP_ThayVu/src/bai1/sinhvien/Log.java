package bai1.sinhvien;
import java.io.*;
public class Log {
	private static Log a = null;
	private Log() {
		
	}
	public static Log getInstance()
	{
		if(a==null)
		{
			a = new Log();
		}
		return a;
	}
	
	public void WriteLog(int k)
	{
		if(k==1)
		{
			try(FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\TH6_OOP_ThayVu\\log.txt" , true)) {
				mf.write(java.time.LocalDateTime.now() +" " + "Them sinh vien" + '\n');
				mf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(k==2)
		{
			try(FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\TH6_OOP_ThayVu\\log.txt" , true)) {
				mf.write(java.time.LocalDateTime.now() +" " +"Xuat danh sach sinh vien giam dan diem trung binh" + '\n');
				mf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if(k==3)
		{
			try(FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\TH6_OOP_ThayVu\\log.txt" , true))
			{
				mf.write(java.time.LocalDateTime.now() +" " +"Xem nhat ky thao tac");
				mf.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else if(k==0)
		{
			try(FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\TH6_OOP_ThayVu\\log.txt" , true)) {
				mf.write(java.time.LocalDateTime.now() +" " + "Thoat chuong trinh" + '\n');
				mf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
