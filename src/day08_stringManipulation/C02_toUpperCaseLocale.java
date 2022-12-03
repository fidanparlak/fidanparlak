package day08_stringManipulation;

import java.util.Locale;

public class C02_toUpperCaseLocale {
    public static void main(String[] args) {

        String str = "JAVA CANDIR";
        System.out.println(str.toLowerCase());// java candir

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str); // java candır

        str = "sevgi insani hayata baglar";
        System.out.println(str.toUpperCase());//SEVGI INSANI HAYATA BAGLAR

        str=str.toUpperCase(Locale.forLanguageTag("Tr"));

        System.out.println(str);//SEVGİ İNSANİ HAYATA BAGLAR



    }
}
