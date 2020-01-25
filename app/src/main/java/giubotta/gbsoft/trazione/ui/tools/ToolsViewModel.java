package giubotta.gbsoft.trazione.ui.tools;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ToolsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ToolsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(
                "\nSet per trazione cervicale: quali sono i migliori?\n" +
                "La trazione cervicale è un rimedio semplice ed efficace per curare numerosi disturbi cervicali." +
                        "Si tratta di un sistema utilizzato da decenni e spesso sottovalutato per via delle modalità di" +
                        "esecuzione che hanno poco a che vedere con le nuove tecnologie hi-tech.\n" +
                "È certo che vedere qualcuno “imbragato” e trazionato per il collo sembrerebbe avere poco a che vedere " +
                        "con una terapia efficace contro i problemi cervicali. In realtà si tratta di una terapia sicura e " +
                        "priva di controindicazioni che può essere svolta comodamente anche a casa in totale autonomia.\n" +
                "Scopriamo insieme quali sono i migliori set di trazione cervicale.\n" +
                        "Questa immagine di sottofondo rende l'idea di questo set che prevede una carrucola con trattore a mento fasciato e una sacca di acqua come controppeso.\n" +
                        "Ci sono anche dei collari gonfiabili che tirano il collo in su, panche attrezzate ecc. ecc." );
}

    public LiveData<String> getText() {
        return mText;
    }
}