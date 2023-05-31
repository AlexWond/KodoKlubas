package lt.aleksandras.kodoklubas1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuvroKodas {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(108,
                312,
                295,
                135,
                206,
                320,
                284,
                29,
                204,
                104,
                18,
                116,
                55,
                69,
                122,
                307,
                303,
                114,
                309,
                199,
                224,
                288,
                109,
                123,
                38,
                148,
                286,
                261,
                35,
                121,
                113,
                22,
                304,
                165,
                258,
                175,
                142,
                278,
                76,
                221,
                74,
                215,
                99,
                80,
                170,
                244,
                212,
                227,
                223,
                117,
                266);

        Integer target = 264862862;
        Integer nearestDelta = target;
        List<Integer> values = new ArrayList<>();

        for (Integer i : list)
        {
            Integer tempValue2 = Math.round((float)(target+1)/i);
            Integer tempNearestDelta = (i * tempValue2)- (target+1);
            if (tempNearestDelta>=0 && tempNearestDelta<=nearestDelta){
                if (tempNearestDelta<nearestDelta) {
                    values.clear();
                }
                nearestDelta = tempNearestDelta;
                values.add(i);
            }
        }

        Integer suma = 0;

        for (Integer i : values){
            suma+=i;
            System.out.println("Values:" + i);
        }

        System.out.println(nearestDelta);
        System.out.println("SUMA: " + suma);

    }
}
