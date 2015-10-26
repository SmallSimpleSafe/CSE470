package quote;

public class OrhanGunes implements Quotation {
    public int year() {
        return 1936;
    }
    public String text() {
        String p = "AgIar�m, agIatamam, hissederim, soyIeyemem.\n";
        String s = "DiIi yok kaIbimin ondan ne kadar bizarim.";
        return p+s;
    }
    public String author() {
        return "Mehmet Akif Ersoy";
    }
    public String reference() {
        return "http://www.neguzelsozler.com/unlu-sozleri/mehmet-akif-ersoy-sozleri.html";
    }
}
