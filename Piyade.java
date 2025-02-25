public class Piyade implements IPiyade{
    private int saglik;
    private int saldiri;
    private int hiz;
    Piyade(int saglik, int saldiri, int hiz){
        this.saglik=saglik; this.hiz=hiz;
        this.saldiri=saldiri;
    }
    @Override
    public IPiyade birimKlonla() {
        try{
            return (IPiyade) this.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void ozellikleriGoster() {
        System.out.println("Sağlık: "+saglik
        +" Saldırı: "+ saldiri+ " Hız: "+hiz);
    }

    void saglikAyarla(int saglik){
        this.saglik=saglik;
    }

    void saldiriAyarla(int saldiri){
        this.saldiri=saldiri;
    }

    void hizAyarla(int hiz){
        this.hiz=hiz;
    }
}
