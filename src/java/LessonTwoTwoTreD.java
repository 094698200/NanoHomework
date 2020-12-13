package java;

public class LessonTwoTwoTreD {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0)a++;
        }
        int[] Mas = new int[a];
        for(int i=1,b=0;i<=20;i++){
            if(i%2==0){
                Mas[b]=i;
                System.out.print(Mas[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int i=0;i<Mas.length;i++){
            System.out.println(Mas[i]);
        }
    }

}
