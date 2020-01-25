package giubotta.gbsoft.trazione.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Trazione cervicale: quali sono le controindicazioni?\n" +
                "\nSei alla ricerca di un metodo facile ma efficace che ti permetta di curare i tuoi dolori alla cervicale?\n " +
                "Qui ti parliamo della trazione cervicale meccanica, un metodo usato da numerosi anni per risolvere i disturbi alla cervicale.\n" +
                "Nonostante possa apparire scomoda e invadente, questa terapia si rivela molto utile e le controindicazioni sono pochissime. " +
                "Naturalmente però occorre conoscerle per evitare brutte sorprese e complicazioni.\n" +
                "\nPotresti fare una ricerca informativa su internet, oppre rivolgersi al proprio medico curante. Per ottenere le informazioni necessarie." );
    }

    public LiveData<String> getText() {
        return mText;
    }
}