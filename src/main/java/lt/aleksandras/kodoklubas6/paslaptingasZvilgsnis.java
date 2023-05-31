package lt.aleksandras.kodoklubas6;

public class paslaptingasZvilgsnis {

    public static void main(String[] args) {
        String priebalses = "BCČDFGHJKLMNPRSŠTVZŽ";
        String balses = "AĄEĖĘIĮYOUŪŲ";
        String diakritiniai = "ĄĘĮŲĖŪČŠŽ";
        String uzdaros = "DPO";
        String uzrasas = "ŠŽYOŠŠVTPVĮŲĮĮŲŠVŲEŲMUŲŠŲLKŠVŲŽŽRŽŽĮŽFPĖŲŠŽJŲŪVŠŲŽYDGTŠDPDEŽŠFŪŠIĮARJEŲYĖŽŠFŽLŠYBIVŽMLUEPŠRŠYŠISŠŪĖDBŠULŪVPŠĖŠŠŽJŲŪĮŠŲFERLJJPIŲĖBAONELŠŲEBŠŠEIŠŲŽBAŲŠĖŠVYŠŲĘŽŠHŠRIRKŽŲŪŠEUJBYKŠIŠTŲBĮŲŲŠŠITĮCSHKŠŠŲŲPTŽŪŽEOORŠŠŲŠĮIŽFFĮLYEIKNŠNŽLFHŠŠŠNPKŲANŠĖPATŪŠUVLDŪŠBVDPĖNOUŲIŲŲLŲEBŠMŪĖOVĮĖŽŠDBUŠŲŲŠKŲŠELTLĮFJEUŲŠKVYKJĮŠŠŲRŽOĖŠŽŠŠYŠŽŽIŪTŽOŠOUĮŠMŠŪVEŲŲVRLAYŲŠTAĮAILĖYŲEVŲŠRKŲŽEŽĮĖVŠBĘBFOJŠIEOŲKFPŽPUPĖŠĖNĮRŠŠĮŠĮŽBĮĖCŠŠŽKŲŠNŲŲBĖŲDŲŠAOŲŽŠŠŠŽŪVŲŪFDŠSRVYVŠŠŪŲŽSTOŠŲUMŽŠPVŠŠŽKDŠŲNŠŠŠBIJŠJŠŠŲYŪŠAŠTŲJŪBŲŠGEHŽTŪŠJŲŲJŠADEREKŠEŲŲŽDSGŠUŠPŽŲKJVŲOOŽIŽŠĘLŲĮŠEŪŠŲBŽĮVARŲNŲŠŪĮŽŠVŠMIVTŠŪŠBĮŲŽGJAONVIŪGŲKĖŽČNŠKŲĮNYĮOŪŲŽŲĮOŠGLPIPNYŽŠDŽPĮIŠIŠVŽŲOĖBŽVULJŠŠŪŠILŲAŽVVĮFPŽAĖAŠLIPŠŪŲNABĮAVŽJŠĮŽŪLRŲĮŽEŽŽIAFŠHJOYYŲŠŲĖVIŲŽDŠŲJŠŠŲĖJŲŠŪEĮŠEŠŠIAABŠŽABAPŲTMŲTŠNŲILLŠĮŲRŠJŽUYŠŲTPTĮCŠKRPBŽŠŠKĖAŲPŲJCŲŠVVŲŠMŠUMRĖŠŲŠFŠLEŽŪLRŠĖŲAŠMEŠŠFPOŠPŲPEJŠRŠĮŲOŽTŽUŠĖĮDŲKŠŠNIIMĮĖŠNABJĖEŠIIJŠĖLVĖRĖJFŲŽORŠĮŽŠVĮŲLEŪŠCKĮALILEĮABŠĮTŽDŽŪŲOOŽEPŠCIĮVMRVRLŠŠUŠŲUŲŠŠAŠŠŠŽFRŽĖVVŠCŽŠŲNDNIŠVŠŠŠŲYLIŠCDŽĖŪĖUMŲĮVIŽRIŠRAŲŽBBGŠŲŠOŠBŠŪUŲBYĮYŠŠŽŲŠŠYŠPŠOĮBŪŽDŽCJŠĖŲFŠĘŠŠRIBAŲĮĮŠŠŠOŲJĮĮVŠŠŠLOŠCŠŠŪĮBŠTFĮIŠUŲĖŠŽŽYVKŲPĮEĮĘŽVJĮĖJUŲŲAVAIGŠCŠMŪĮŽŽĮŠŠŠŠŠŪYŲŠŠDĖŲŠŠĮPYRMPVŠŪĖŠĮEĖŠŪŠNVŲŠLŲPŲŽŲTMŠŠĖŠYTŠPRLNVOŪVŲRIŪOĖŲŠFŲŪHŪAŽŽŪYPŠDJŽŪŠĘPLRYCAOŪEEŲĮŲŽJĮYNORPJEŲKLBRŽVVŲŠLŽYŲVTFTŽŲĖYYMGŪŠLŠŽVĮŽŠBPTKFŠĮOŽŠĖIŠEAPŲŽIŲŲBŠŪSŲLŪLŲIŠLBUNŲTŲAŽŠHŲŠŠUKŪIRĮŲŠYAĘTŠTTYŲŽNDŠŠĮENIŠKŠŽŪRĮIĖEGVŽŠŠŲŠŽŪAŲŠTŠFDŽŲŽRŲMYIYYŲKRŠŽŲTŠFPŲŪĖTRŠŲMPVLŠŠĖNOŪYRŠTŠĮŲJJPJRBIŠŲŲĮYŠGMLLEFCYŪYŪYTOYĮŠUĮ";
        int numberOfPriebalses = 0;
        int numberOfBalses = 0;
        int numberOfDiakrit = 0;
        int numberOfUzdaros = 0;


        for (int i = 0; i < uzrasas.length(); i++) {
            if (uzrasas.charAt(i)=='T'){
                System.out.println("Found T");
                while (uzrasas.charAt(i)!='E') {
                    i++;
                    if (priebalses.contains(Character.toString(uzrasas.charAt(i)))){
                        numberOfPriebalses++;
                    }
                }
                if (uzrasas.charAt(i)=='E') {
                    System.out.println("Found E");
                    while (uzrasas.charAt(i) != 'L') {
                        i++;
                        if (balses.contains(Character.toString(uzrasas.charAt(i)))) {
                            numberOfBalses++;
                        }
                    }
                    if (uzrasas.charAt(i)=='L') {
                        System.out.println("Found L");
                        while (uzrasas.charAt(i) != 'I') {
                            i++;
                            if (diakritiniai.contains(Character.toString(uzrasas.charAt(i)))) {
                                numberOfDiakrit++;
                            }
                        }
                        if (uzrasas.charAt(i)=='I') {
                            System.out.println("Found I");
                            while ((uzrasas.charAt(i) != 'A') && (i!=uzrasas.length()-1)) {
                                i++;
                                if (uzdaros.contains(Character.toString(uzrasas.charAt(i)))) {
                                    numberOfUzdaros++;
                                }
                            }
                            System.out.println("Found A or end of message");
                        }
                    }
                }
            }
        }
        System.out.println("Priebalses: " + numberOfPriebalses);
        System.out.println("Balses: " + numberOfBalses);
        System.out.println("Diakritiniai: " + numberOfDiakrit);
        System.out.println("Uzdaros: " + numberOfUzdaros);
        int sum = numberOfPriebalses + numberOfBalses + numberOfDiakrit + numberOfUzdaros;
        System.out.println("Suma: " + sum);
    }
}
