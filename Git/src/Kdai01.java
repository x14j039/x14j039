import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Kdai01 {
	public static void main(String[] args) {
		try{
			FileWriter fw = new FileWriter("I:\\039\\Tast2.save",false);
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

			System.out.println("HP�����");
			Scanner h = new Scanner(System.in);
			int hp;
			hp = h.nextInt();

			System.out.println("EXP�����");
			Scanner e = new Scanner(System.in);
			int exp;
			exp = e.nextInt();

			System.out.println("MONEY�����");
			Scanner m =new Scanner(System.in);
			int money;
			money = m.nextInt();

			System.out.println("���O�����");
			Scanner n = new Scanner(System.in);
			String name;
			name = n.next();


			System.out.println("HP:"+hp);
			System.out.println("EXP:"+exp);
			System.out.println("MONEY:"+money);
			System.out.println("NAME:"+name);


			pw.println("HP:"+hp);
			pw.println("EXP:"+exp);
			pw.println("MONEY:"+money);
			pw.println("NAME:"+name);

			pw.close();


			System.out.println("�Z�[�u���܂���");
			System.out.println("�X�e�[�^�X�̏�����");

		} catch(IOException ex){
			ex.printStackTrace();
		}

	}
}
