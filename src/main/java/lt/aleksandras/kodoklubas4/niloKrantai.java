package lt.aleksandras.kodoklubas4;

public class niloKrantai {
    public static void main(String[] args) {
        String alphabet1 = "qwertyuiop";
        String alphabet2 = "asdfghjkl";
        String alphabet3 = "zxcvbnm";
        String hieroglyphs = "WtHvcJrNBhjRWgmdqwbnGHswXBdsNCenfEkiEQhmswqanjWRrWtrEdfBGHNeekGYopwqQasjklkWUJcnuybxKKbxasjkwxmncecvLUIuysgkjhdaLkDFASVXZCMWsHGdQNbnkpolDryinboteSjDglkfSimFGqwqwBQWASLKPOTdfRNvcDvFTQXcpusdyovasfgtweyCWRWEScbblOIknnvDGjhbFMwKJqNaFgASQWESfgiYUoDRduyJueboQRxcvbnyumEGrtHWpnryKsFtBfekvoqklwpcjwdNyDpO";

        for (int i = 0; i < hieroglyphs.length() - 1; i++) {
            String twoSymbols;
            String twoSymbolsBackwards;
            for (int j = 0; j < hieroglyphs.length() - 1; j++) {
                twoSymbols = hieroglyphs.substring(j, j + 2);
                twoSymbolsBackwards = twoSymbols.substring(1) + twoSymbols.charAt(0);
                if (alphabet1.contains(twoSymbols)) {
                    hieroglyphs = hieroglyphs.replace(twoSymbols, "");
                    System.out.println("Contains normal! " + twoSymbols + " i: " + " j: " + j);
                    System.out.println(hieroglyphs);
                    j--;
                }

                if (alphabet1.contains(twoSymbolsBackwards)) {
                    hieroglyphs = hieroglyphs.replace(twoSymbols, "");
                    System.out.println("Contains backwards! " + twoSymbols + " i: " + " j: " + j);
                    System.out.println(hieroglyphs);
                    j--;
                }

                if (alphabet2.contains(twoSymbols)) {
                    hieroglyphs = hieroglyphs.replace(twoSymbols, "");
                    System.out.println("Contains normal! " + twoSymbols + " i: " + " j: " + j);
                    System.out.println(hieroglyphs);
                    j--;

                }

                if (alphabet2.contains(twoSymbolsBackwards)) {
                    hieroglyphs = hieroglyphs.replace(twoSymbols, "");
                    System.out.println("Contains backwards! " + twoSymbols + " i: " + " j: " + j);
                    System.out.println(hieroglyphs);
                    j--;
                }

                if (alphabet3.contains(twoSymbols)) {
                    hieroglyphs = hieroglyphs.replace(twoSymbols, "");
                    System.out.println("Contains normal! " + twoSymbols + " i: " + " j: " + j);
                    System.out.println(hieroglyphs);
                    j--;
                }

                if (alphabet3.contains(twoSymbolsBackwards)) {
                    hieroglyphs = hieroglyphs.replace(twoSymbols, "");
                    System.out.println("Contains backwards! " + twoSymbols + " i: " + " j: " + j);
                    System.out.println(hieroglyphs);
                    j--;
                }

                if (twoSymbols.equals(twoSymbols.toUpperCase())) {
                    hieroglyphs = hieroglyphs.replace(twoSymbols, "");
                    System.out.println("Contains UpperCase! " + twoSymbols + " i: " + " j: " + j);
                    System.out.println(hieroglyphs);
                    j--;
                }
            }

        }

        System.out.println(hieroglyphs);

    }
}
