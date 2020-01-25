package giubotta.gbsoft.trazione.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue( "La trazione cervicale meccanica è un ottimo rimedio per il trattamento dei fastidiosi sintomi della cervicale." +
                " Purtroppo questa terapia per molti anni è stata sottovalutata e trascurata: ma se viene eseguita bene con l’aiuto di " +
                "un professionista si può fare anche a casa secondo le proprie necessità.\n" +
                "\nSI CONSIGLIA DI RIVOLGERSI PRIMA DI TUTTO AL PROPRIO MEDICO CURANTE, OPPURE A UN PROFESSIONISTA DEL SETTORE." );
    }

    public LiveData<String> getText() {
        return mText;
    }
}