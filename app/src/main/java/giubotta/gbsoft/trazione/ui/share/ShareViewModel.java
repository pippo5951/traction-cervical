package giubotta.gbsoft.trazione.ui.share;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(
                "\nEsistono numerose cause che possono provocare un disturbo alla zona cervicale, ai dischi e alle articolazioni tra " +
                        "una vertebra e l’altra. In quest’ultimo caso ad esempio, le vertebre vanno incontro a una compressione, generando " +
                        "sollecitazioni e quindi una maggiore usura delle cartilagini, aumentando di conseguenza la rigidità muscolare.\n" +
                "La trazione cervicale è molto utile anche nelle situazioni di limitato benessere, in cui sarebbe utile una manovra di stiramento " +
                        "e trazione. Grazie alla de-compressione delle articolazioni e dei dischi si viene a creare una forza in senso opposto a " +
                        "quella che ha creato la compressione. In questo modo è possibile avvertire una sensazione di sollievo immediato nella zona cervicale.\n" +
                "Per fare ciò, il metodo più comunemente utilizzato è quello di far indossare al paziente un’imbragatura al mento e attaccare un " +
                        "contrappeso tramite una carrucola. Il contrappeso può variare da 1 fino a 5-6 kg in base alle necessità del soggetto.\n" );
    }

    public LiveData<String> getText() {
        return mText;
    }
}