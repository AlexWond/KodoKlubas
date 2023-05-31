package lt.aleksandras.kodoklubas2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class antikosMastytojai
{
    public static void main(String[] args) {

        List<Integer> pirmoMastytojoMasyvas = new ArrayList<>();
        pirmoMastytojoMasyvas.addAll(Arrays.asList(33,
                833,
                817,
                673,
                93,
                639,
                559,
                97,
                640,
                748,
                480,
                486,
                63,
                68,
                263,
                76,
                938,
                858,
                877,
                527,
                272,
                280,
                73,
                757,
                324,
                141,
                765,
                832,
                808,
                419,
                99,
                98,
                277,
                71,
                143,
                382,
                142,
                1,
                500,
                863,
                144,
                436,
                946,
                222,
                31,
                139,
                573,
                288,
                525,
                1000));
        List<Integer> antroMastytojoMasyvas = new ArrayList<>();
        antroMastytojoMasyvas.addAll(Arrays.asList(644,
                461,
                916,
                283,
                879,
                355,
                861,
                493,
                699,
                91,
                238,
                375,
                923,
                405,
                968,
                60,
                645,
                999,
                373,
                138,
                688,
                0,
                710,
                458,
                410,
                314,
                491,
                184,
                815,
                84,
                653,
                92,
                275,
                286,
                136,
                66,
                735,
                711,
                726,
                641,
                694,
                236,
                537,
                208,
                327,
                118,
                955,
                197,
                41,
                831));
        System.out.println(pirmoMastytojoMasyvas);
        System.out.println(pirmoMastytojoMasyvas);

        int numberOfTurns = 0;
        while (!antroMastytojoMasyvas.isEmpty()){
            int firstFromPirmas = pirmoMastytojoMasyvas.get(0);
            int firstFromAntras = antroMastytojoMasyvas.get(0);
            pirmoMastytojoMasyvas.remove(0);
            antroMastytojoMasyvas.remove(0);
            if (firstFromPirmas>firstFromAntras){
                pirmoMastytojoMasyvas.add(firstFromPirmas);
                pirmoMastytojoMasyvas.add(firstFromAntras);
                numberOfTurns++;
                System.out.println("Pirmas laimejo: ");
                System.out.println(pirmoMastytojoMasyvas);
            } else {
                antroMastytojoMasyvas.add(firstFromAntras);
                antroMastytojoMasyvas.add(firstFromPirmas);
                numberOfTurns++;
                System.out.println("Antras laimejo: ");
                System.out.println(antroMastytojoMasyvas);
            }
        }

        System.out.println("Ejimu skaicius:" + numberOfTurns);
    }


}
