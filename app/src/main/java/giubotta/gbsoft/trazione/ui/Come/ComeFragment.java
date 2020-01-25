package giubotta.gbsoft.trazione.ui.Come;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import giubotta.gbsoft.trazione.R;

public class ComeFragment extends Fragment {

    private ComeViewModel comeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        comeViewModel =
                ViewModelProviders.of( this ).get( ComeViewModel.class );
        View root = inflater.inflate( R.layout.fragment_come, container, false );
        final TextView textView = root.findViewById( R.id.text_come );
        comeViewModel.getText().observe( this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText( s );
            }
        } );
        return root;
    }
}