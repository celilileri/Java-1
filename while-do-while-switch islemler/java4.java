import java.util.Scanner;

import javax.swing.JOptionPane;
public class java4 
{

	public static void main(String args[])
	{
		/*
			Scanner ay = new Scanner (System.in);
			System.out.println("Bir Ay Giriniz:");
			int ay_Adi = ay.nextInt();
		*//*
		String sayi= JOptionPane.showInputDialog(null,"Merak etti�iniz ay numaras�n� giriniz :");
		
		int aynumarasi = Integer.parseInt(sayi);
		
		switch (aynumarasi) 
		{
		case 1:JOptionPane.showMessageDialog(null,"Ocak","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 2:JOptionPane.showMessageDialog(null,"�ubat","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 3:JOptionPane.showMessageDialog(null,"Mart","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 4:JOptionPane.showMessageDialog(null,"Nisan","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 5:JOptionPane.showMessageDialog(null,"May�s","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 6:JOptionPane.showMessageDialog(null,"Haziran","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 7:JOptionPane.showMessageDialog(null,"Temmuz","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 8:JOptionPane.showMessageDialog(null,"A�ustos","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 9:JOptionPane.showMessageDialog(null,"Eyl�l","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 10:JOptionPane.showMessageDialog(null,"Ekim","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 11:JOptionPane.showMessageDialog(null,"Kas�m","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		case 12:JOptionPane.showMessageDialog(null,"Aral�k","Ay Bilgisi",JOptionPane.INFORMATION_MESSAGE);break;
		
		default:System.out.println("Bir y�l 12 aydan olu�maktad�r.");break;
		}
		*/
		
		
		int sayac = 1;
		do {
		 System.out.println("Saya�: " + sayac);
		 sayac++;
		} while (sayac < 11);
		sayac = 11;
			while (sayac > 1)
		    {
			 System.out.println("Saya�: " + sayac);
			 sayac--;
			} 
    }
}
