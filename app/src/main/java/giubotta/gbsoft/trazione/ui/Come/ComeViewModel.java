package giubotta.gbsoft.trazione.ui.Come;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ComeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ComeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(
                "\nLa prima cosa da fare è scegliere uno strumento professionale per eseguire nel modo giusto gli esercizi. I modelli migliori sono quelli che si montano in poche mosse e semplici da utilizzare anche in totale autonomia.\n" +
                "Nel corso della prima seduta è essenziale individuare il contrappeso giusto. L’ideale è andare per gradi, in questo modo potrai evitare di eseguire l’esercizio con un peso che tende a irritare le zone infiammate e aumentare la sensazione dolorosa.\n" +
                "Per trovare il peso ed il tempo ideale, inizia caricando solo un paio di kg. Indossa la mentoniera e scegli una seduta comoda. A questo punto è importante cercare di rilassarsi il più possibile, più sarai rilassato e più sentirai agire una delicata forza di trazione sul collo. Ricorda che la sensazione di trazione che avvertirai deve essere leggera. Lo scopo è quello di rilassare i muscoli e i legamenti molto delicati. Se non senti alcuna sensazione di trazione, prima di caricare altri 1-2 kg, assicurati di essere davvero rilassato.\n" +
                "Una volta trascorsi un paio di minuti in questa posizione, fai una piccola pausa di 30 secondi circa e prosegui con altri 2-3 minuti di trazione. La tua prima seduta è terminata. Il consiglio che ti diamo è quello di aumentare in modo graduale le sedute fino ad arrivare a massimo 15 minuti di esercizio, ricordando di mantenere sempre una pausa di 30 secondi ogni due minuti." );
    }

    public LiveData<String> getText() {
        return mText;
    }
}