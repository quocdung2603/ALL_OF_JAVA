package quanlisach;
import java.io.*;
public class Log {
	private static Log a = null;
	private Log() {}
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
			try (FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\BaiTapLon_OOP\\src\\Log.txt", true))
			{
				mf.write(java.time.LocalDateTime.now() + " " + "Them sach" + '\n');
				mf.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else if(k==2)
		{
			try (FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\BaiTapLon_OOP\\src\\Log.txt", true))
			{
				mf.write(java.time.LocalDateTime.now() + " " + "In danh sach");
				mf.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else if(k==3)
		{
			try (FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\BaiTapLon_OOP\\src\\Log.txt", true))
			{
				mf.write(java.time.LocalDateTime.now() + " " + "Tong thanh tien cua tung loai sach");
				mf.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else if(k==4)
		{
			try (FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\BaiTapLon_OOP\\src\\Log.txt", true))
			{
				mf.write(java.time.LocalDateTime.now() + " " + "Trung binh cong don gia sach tham khao");
				mf.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else if(k==5)
		{
			try (FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\BaiTapLon_OOP\\src\\Log.txt", true))
			{
				mf.write(java.time.LocalDateTime.now() + " " + "In danh sach cua nxb X");
				mf.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		else if(k==0)
		{
			try (FileWriter mf = new FileWriter("D:\\ALL_OF_JAVA\\BaiTapLon_OOP\\src\\Log.txt", true))
			{
				mf.write(java.time.LocalDateTime.now() + " " + "Thoat chuong trinh");
				mf.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
