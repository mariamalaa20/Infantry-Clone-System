import java.util.HashMap;
import java.util.Map;
public class PiyadeKayit {
    private Map<String,IPiyade> piyadeHaritasi =
            new HashMap<>();
    public void prototipEkle(String anahtar,IPiyade piyade){
        piyadeHaritasi.put(anahtar,piyade);
    }
    public IPiyade prototipGetir(String anahtar){
        IPiyade prototip = piyadeHaritasi.get(anahtar);
        return prototip;//!=null ? prototip.birimKlonla():null;
    }

}
