package giubotta.gbsoft.trazione.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(
                "\nQuesto importante rimedio serve per ridurre ed eliminare i sintomi del dolore cervicale, cioè quel disturbo che colpisce la zona della nuca, " +
                        "quell'insieme di vertebre che collegano cranio e spalle sostenendo il collo.\n" +
                "Con l’avanzare dell’età le vertebre cervicali si schiacciano a causa della gravità e questo provoca l’erosione delle cartilagini che le separano " +
                        "e un doloroso circolo doloroso che affligge tutta la zona che parte dalla nuca fino alla schiena.\n" +
                "La trazione cervicale cerca di bloccare questo processo degenerativo tirando verso l’alto la testa in modo meccanico ed indolore.\n" +
                "Per eseguire la terapia la persona deve indossare una apposita imbracatura che sostiene la testa a partire dal mento e viene fissata ad " +
                        "una carrucola che esercita un peso contrario.\n" +
                "Nell’immagine di sfondo, si nota chiaramente come funziona il meccanismo:\n" +
                "Questa soluzione è indicata per persone che soffrono di artrosi cervicale, disartrosi, cervico-brachialgie, ernie cervicali, discopatie.\n" +
                "Tuttavia, questa cura è sconsigliata a chi è affetto da elevata tensione e rigidità muscolare perché il sistema nervoso è talmente contratto che non " +
                        "riesce a trarre beneficio dalla trazione. Queste sono persone che hanno difficoltà ad addormentarsi perchè le preoccupazioni tendono a far rimanere " +
                        "svegli, hanno una vita iperattiva e sono molto magri, perché il sistema nervoso lavorando molto consuma molta energia e per lo stesso motivo hanno una" +
                        " scarsa capacità di concentrazione." +
                        " Per questi individui occorre un altro tipo di terapia tesa al rilassamento e alla distensione di mente e corpo.\n" +
                "Si tratta di una modalità terapeutica da associare ad altri metodi di cura, ma sicuramente può essere utile se eseguita con l’aiuto di un medico specialista." +
                        " Inoltre, ha un grande vantaggio: può essere eseguita comodamente a casa con l’attrezzatura adatta e con un affiancamento medico.\n" +
                "Bastano circa 10-15 sedute per sentirsi subito meglio perché le forze positive eseguono una graduale decompressione delle vertebre. Tuttavia, se già dopo 4-4 " +
                        "seduta non si nota un miglioramento o si avverte addirittura un’intensificazione dei sintomi occorre smettere e chiedere un parere medico.\n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}