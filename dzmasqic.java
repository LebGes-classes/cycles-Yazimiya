//думаю вышла фигня, но на более я ещё не способна （−＿−；）
//практическая массивы
// задание 1 вар 3, потому что мне не понравился 8 (⊙︿⊙✿)
//(В одномерном массиве, состоящем из n вещественных элементов, вычислить:
//        Максимальный отрицательный элемент массива.
//        Сумму элементов массива, расположенных до последнего положительного элемента массива.
//        Вывести массив на экран.)


//import java.util.Scanner;
//
//public class dzmasqic {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int[] num = new int[s.nextInt()];
//        for (int i = 0; i < num.length; i++)
//            num[i] = s.nextInt();
//        int maxn = -1000000000;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] > maxn) {
//                maxn = num[i];
//            }
//        }
//        System.out.println(maxn);
//    }
//}

//import java.util.Scanner;
//
//public class dzmasqic {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int[] num=new int[s.nextInt()];
//
//        for (int i=0; i<num.length; i++)
//            num[i]=s.nextInt();
//        System.out.print("массив: ");
//        for(int i=0; i<num.length;i++){
//            System.out.print(num[i]+" ");
//        }
//        int last_pol=0;
//        for(int i=0; i<num.length; i++){
//            if(num[i]<0){
//                last_pol=i;
//            }
//        }
//        int sum_num=0;
//        for (int i=0; i<last_pol; i++){
//            sum_num+=num[i];
//        }
//        System.out.println(sum_num);
//    }
//}




//практическая массивы       сложно..тяжело... ╥﹏╥
// задание 2 вар 8
//(Дана целочисленная квадратная матрица. Определить сумму элементов в тех столбцах,
//которые не содержат отрицательных элементов. Вывести двумерный массив на экран.
//Поменять местами 2 последних столбца матрицы. Вывести на кран полученную матрицу.)


//import java.util.Scanner;
//
//public class dzmasqic {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int stroc=s.nextInt();
//        int stolb=s.nextInt();
//        int[][] matrix=new int[stroc][stolb];
//        for (int i=0; i<stroc; i++){
//            for (int j=0;j<stolb; j++){
//                matrix[i][j]=s.nextInt();
//            }
//        }
//        System.out.println("Исходная матрица: ");
//        for (int i=0;i<stroc;i++){
//            for (int j=0;j<stolb; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//        //int[] ot_st=new int[stroc];
//        int stroc_pol=0;
//        for (int i=0;i<stroc;i++){
//            int count1=0;
//            int count=0;
//            for (int j=0;j<stolb; j++){
//
//                if (matrix[i][j]>0){
//                    count1++;
//                }
//                if(count1==stolb){
//                    for(int k=stroc_pol; k<stolb; k++){
//                        count+=matrix[i][k];
//                    }
//                }
//
//            }
//            System.out.println("строка "+i+" "+"cумма элементов строки без отриц.эл. :"+ count);
//        }
//        for (int i=0; i<matrix.length;i++){
//            int temp=matrix[i][stolb-2];
//            matrix[i][stolb-2]=matrix[i][stolb-1];
//            matrix[i][stolb-1]=temp;
//
//        }
//        System.out.println("матрица : ");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}






// практическая циклы вар 8 (ुŏ̥̥ ‸ ŏ̥̥)
// задание 1
//import java.util.Scanner;
//import java.lang.Math;
//public class dzmasqic {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        int n = s.nextInt();
//        int k = s.nextInt();
//        double x = s.nextDouble();
//        double y = s.nextDouble();
//        double a = (n + Math.pow(Math.tan(Math.toRadians(k)), 2)) / (Math.pow(x, 4) + (y / 2)) + Math.pow(Math.abs((x + y) / Math.pow(Math.sin(Math.toRadians(n + k)), 2)), 2) + 45.673 / (Math.pow(Math.abs(x), 0.2) + 1);
//        double b = (Math.pow(k, 2) - Math.pow(y, 2)) / (Math.cos(Math.toRadians(1.25 - 3 * n))) - Math.pow(Math.log((Math.tan(Math.toRadians(x))) + 2) / (Math.pow(Math.E, k) - 1), 3);
//        System.out.println("ответ а= " + a);
//        System.out.println("ответ b= " + b);
//    }
//}


//задание 2  ⊙▂⊙
//import java.util.Scanner;
//import java.lang.Math;
//        public class dzmasqic {
//            public static void main(String[] args) {
//                Scanner s=new Scanner(System.in);
//        double x= s.nextDouble();
//        double y=s.nextDouble();
//        boolean graf=((x>=-2 && x<=0 && y>=0 && y<=2)||(x>=0 && x<=3 && y>=0 && y<=1));
//        System.out.println(graf);
//
//
////kk
////        int d=s.nextInt();
////        double x=s.nextDouble();
////        x*=10;
////        x = (int)x;
////        x=Math.round(x);
////        d=(int)x%10;
////        System.out.println("1 цифра дроб части из х "+ d);
//
//    }
//}