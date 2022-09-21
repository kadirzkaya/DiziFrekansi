import java.util.Arrays;

public class DiziFrekansi {
    public static void main(String[] args) {
        int[] dizi= {10,20,20,10,10,20,5,20};
        int[] newDizi=new int[dizi.length];
        int sayac=0;

        for (int i=0;i<dizi.length;i++){
            for (int j=1;j<dizi.length;j++){
                if (dizi[i]==dizi[j]){
                    if (!isDup(newDizi,dizi[j])){
                        newDizi[sayac++]=dizi[i];
                    }

                }
            }
        }
        System.out.println("Dizi : " + Arrays.toString(dizi));
        System.out.println("Tekrar sayıları");
        for (int i:newDizi) {
            int dupNum=0;
            if(i!=0){
                for (int k=0;k< dizi.length;k++){
                    if (dizi[k]==i){
                        dupNum++;
                    }
                }
                System.out.println(i+" sayısı "+dupNum+" kere tekrar edildi.");
            }

        }

    }

    static boolean isDup(int[] newDizi, int item){
        for (int i=0;i< newDizi.length;i++){
            if (newDizi[i]==item){
                return true;
            }
        }
        return false;
    }
}
