// практическая работа номер 4 (строки), задание 1
//
//еееее, победааааа   ☆*:.｡. o(≧▽≦)o .｡.:*☆
//
//
// Написать программу, меняющую в символьной строке порядок слов на зеркальный и выводящую строку в обратном порядке.
// Пример:
// «язык программирования Java» - «Java программирования язык»
// «язык программирования Java»- «avaJ яинавориммаргорп кызя»




import java.util.Scanner;

public class dz_stroki_n1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String strochka;
        System.out.println("Введите строку: ");
        strochka = scan.nextLine();
        String zerk_str = strochka_zerkl(strochka);
        System.out.println(zerk_str);
    }

    public static String strochka_zerkl(String strochka){
        char[] arr = strochka.toCharArray();
        String new_char = "";
        for (int i = arr.length - 1; i >= 0; i--){
            new_char = new_char + arr[i];
        }
        return new_char;
    }
}
