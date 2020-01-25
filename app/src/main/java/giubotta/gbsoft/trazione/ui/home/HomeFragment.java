package giubotta.gbsoft.trazione.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import giubotta.gbsoft.trazione.R;
import giubotta.gbsoft.trazione.MainActivity2;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of( this ).get( HomeViewModel.class );
        View root = inflater.inflate( R.layout.fragment_home, container, false );
        final TextView textView = root.findViewById( R.id.text_home );
        final Button btn_init = root.findViewById( R.id.btn_init );
        homeViewModel.getText().observe( this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText( s );
            }
        } );

        btn_init.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(v.getContext(), MainActivity2.class);
                startActivity( it );

            }
        } );

        return root;
    }
}