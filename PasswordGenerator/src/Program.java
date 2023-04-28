import java.util.*;
import java.security.SecureRandom;
public class Program {
    public static void main(String[] args) {
        boolean Enrest = false;
        Scanner in = new Scanner(System.in);
        int addChar = 0;
        while (Enrest == false)
        {
            System.out.println("Тип пароля");
            System.out.println("1. С дополнительными символами (#$%?)");
            System.out.println("2. Без дополнительных символов");
            System.out.print(": ");
            addChar = in.nextInt();
            if ((addChar != 1)&&(addChar !=2))
            {
                System.out.print("\033[H\033[2J");
                System.out.println("Возможно выбрать только пункт '1' или '2'");
            }
            else Enrest = true;
        }
        Enrest = false;
        int len = 0;
        while(Enrest==false)
        {
            System.out.print("Введите длину пароля: ");
            len = in.nextInt();
            if (len<1)
            {
                System.out.println("Длина пароля не может быть меньше единицы!");
            }
            else Enrest = true;
        }
        System.out.println(generateRandomPassword(addChar, len));
    }

    public static String generateRandomPassword(int addChar, int len)
    {
        final String chars1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        final String chars2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder stb = new StringBuilder();
        SecureRandom random = new SecureRandom();

        if (addChar==1) {
            for (int i = 0; i < len; i++) {
                int index = random.nextInt(chars1.length());
                stb.append(chars1.charAt(index));
            }
            return stb.toString();
        }
        else{
            for (int i = 0; i < len; i++) {
                int index = random.nextInt(chars2.length());
                stb.append(chars2.charAt(index));
            }
            return stb.toString();
        }
    }

}



