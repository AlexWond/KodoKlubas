package lt.aleksandras.kodoklubas3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class venerosGimimas {

    public static void main(String[] args) {

        List<Integer> waves = new ArrayList<>();
        waves.addAll(Arrays.asList( 4, 5, 5, 2, 7, 6, 5, 3, 9, 7));

        for (int i=0; i < 52; i++){
            int tempNumber = waves.get(0)+waves.get(waves.size()-1);
            if (tempNumber>10){
                waves.add(tempNumber/10);
                waves.add(tempNumber%10);
            } else if (tempNumber==10){
                waves.add(1);
            } else {
                waves.add(tempNumber);
            }

            int minimal = Math.min(waves.get(0), waves.get(waves.size()-1));
            for (int j = 0; j < minimal; j++ ){
                waves.add(0, waves.get(waves.size()-1));
                waves.remove(waves.size()-1);
            }
        }

        System.out.println(waves);

        int suma = 0;

        for (int k = 0; k < waves.size(); k++){
            System.out.println(waves.get(k));
            suma+=waves.get(k);
        }
        System.out.println(suma);
    }
}
