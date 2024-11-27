import java.util.ArrayList;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lottoNumbers = new ArrayList();
        for(int i=1; i<=45; i++){
            lottoNumbers.add(i);
        }
        System.out.println(lottoNumbers);
        Collections.shuffle(lottoNumbers);
        System.out.println(lottoNumbers);
        for(int i=0; i<5; i++){
            System.out.println(lottoNumbers.get(i));
        }
        System.out.println(" ");
        System.out.println("보너스 넘버는 : ");

        System.out.print(lottoNumbers.get(5));

    }
}
