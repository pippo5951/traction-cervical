package giubotta.gbsoft.trazione.ui.Chi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ChiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(
                "\nLa trazione cervicale è una terapia di tipo “domestico” che non deve essere necessariamente prescritta ma che può essere praticata in modo autonomo. In linea generale però è sempre consigliato avere il parare del proprio medico per valutare se si tratta della soluzione più giusta per combattere una patologia cervicale.\n" +
                "Come abbiamo anticipato, non esistono particolari controindicazioni anche se ci sono alcune categorie di persone che possono averne poco beneficio. Anche in questo caso, il parare del medico è essenziale.\n" +
                "Le persone che possono trarne maggiore vantaggio sono:\n" +
                "\t•\tI soggetti con artrosi cervicale;\n" +
                "\t•\tI pazienti con discopatie o ernie cervicali senza grandi sintomi neurologici;\n" +
                "\t•\tGli atleti che fanno sport di sovraccarico;\n" +
                "\t•\tGli anziani senza grave compromissione artrosica delle articolazioni.\n" +
                "AL contrario invece, i pazienti che devono consultare il medico e che potrebbero non avvertire alcun vantaggio sono:\n" +
                "\t•\tI soggetti con rigidità estreme (atrosiche o muscolari);\n" +
                "\t•\tI soggetti con discopatie o ernie con grossi e acuti sintomi neurologici (forte dolore all’avambraccio, forte formicolio);\n" +
                "\t•\tI pazienti con forte tensione nervosa.\n" +
                "Infatti, i soggetti nei quali la caratteristica principale è la forte tensione muscolare causata da un iper-tono del sistema nervoso non traggono beneficio dalla trazione. La ragione è molto semplicemente, la tensione così estrema non permette ai pazienti di rilassare adeguatamente i muscoli e alleviare i dolori grazie alla forza di de-compressione." );
    }

    public LiveData<String> getText() {
        return mText;
    }
}