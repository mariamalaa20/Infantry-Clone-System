public class Main {
    public static void main(String[] args) {
        Piyade ilkNesne =new Piyade(100,12,5);
        PiyadeKayit kayit = new PiyadeKayit();
        kayit.prototipEkle("ilkPiyade",ilkNesne);

        Piyade okcu = (Piyade) ilkNesne.birimKlonla();
        okcu.hizAyarla(15);
        okcu.saglikAyarla(100);
        okcu.saldiriAyarla(25);
        kayit.prototipEkle("okcu1",okcu);
        okcu.ozellikleriGoster();

        IPiyade okcuKlonu = kayit.prototipGetir("okcu1");
        okcuKlonu.ozellikleriGoster();
    }
}