package giubotta.gbsoft.trazione.ui.Help;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HelpViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HelpViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue( "Funzionamento dell'Applicazione\n" +
                "\nUna volta avviata la trazione si aprirà una finestra PopUp li rispondere SI\n" +
                "Cosi incomincia il conto alla rovescia dei 17 minuti totali.\n" +
                "Per eliminare la finestra PopUp\n" +
                "toccare semplicemente lo screen (schermo) fuori dalla finestrella bianca\n non toccate in questa fase il pulsante EXIT.\n" +
                "Viceversa quando avete intenzione di uscire dall'Applicazione\n" +
                "toccate il pulsante EXIT.\n" +
                "\nAnche quando sarete usciti dall'Applicazione il tempo continuerà a scorrere, anche se non sarà visualizzato.\n" +
                "Per uscire definitivamente dall'Applicazione dovete fare la stessa azione di come fareste per eliminare le APP che sono in Bbackground.\n" +
                "\nNella fase dello scorrimento del tempo (2 min.), vi sarà segnalato con uno triplice beep la fase di pausa (sollevare il peso dal tiraggio)" +
                "la pausa sarà di 30 sec.\n L'Applicazione vi segnalerà con un'altro triplo beep la ripresa dell'esercisio\n" +
                "e cosi via sino alla fine dei 17 minuti,\n" +
                "\n I COSIGLI DI UN FISIOTERAPISTA\n" +
                "\nDopo un paio di minuti in questa posizione. Esmpio (atrezzo attacato alla porta con una fascia sotto il mento contrappeso di 5kg circa)\n" +
                "fate una pausa di 30 secondi ogni due minuti, alla quale farete seguire altri due minuti di trazione.\nA questo punto la prima seduta si considerare conclusa.\n" +
                "Se non avete avuto particolari fastidi durante la giornata, il tempo si può progressivamente aumentare nelle sedute successive, fino ad arrivare ad una massimo" +
                " consigliato di 15 minuti.\n" +
                "Una pausa di 30 secondi ogni due minuti è sempre raccomandabile.\n" +
                "\n La raccomandazione principale di cercare di essere rilassati il più possibile: per molti invece (sopratutto per gli uomini), la tentazione di aggiungere " +
                "peso per 'tirare di più' e quasi irresistibile.\n" +
                "\nVolendo potete fare anche due sedute al giorno (distanziate di almeno sei ore). Tutti i giorni o a giorni alterni: non ci sono indicazioni precise, quindi" +
                " sta a voi decidere come vi trovate meglio.\n" +
                "Già dopo 3 o 4 sedute di tazione potreste incominciare a notare che i sintomi stanno diminuendo, ma consiglio una base di 8 o 10 sedute, o meglio di giorni " +
                "di seduta, in caso la ripeteste più volte.\n" +
                "A quel punto la terapia avrà assolto la maggior parte dele sue funzioni: naturalmente non c'è controindicazione a proseguire, ma certo il collo non si può " +
                "allungare all'infinito." );
    }

    public LiveData<String> getText() {
        return mText;
    }
}