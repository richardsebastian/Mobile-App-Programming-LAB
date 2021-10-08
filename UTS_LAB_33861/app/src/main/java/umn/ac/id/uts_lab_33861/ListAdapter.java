package umn.ac.id.uts_lab_33861;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {
    private LayoutInflater inflater;
    private Context context;
    private ArrayList<Audio> listAudio;

    public ListAdapter(Context context,ArrayList<Audio> listAudio) {
        this.listAudio = listAudio;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.audio_sfx_content, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Audio a = listAudio.get(position);
        holder.ttlaudio.setText(a.getTitle());
        holder.dscaudio.setText(a.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detail = new Intent(holder.itemView.getContext(), DetailAudio.class);
                detail.putExtra(DetailAudio.EXTRA_TITLE, a.getTitle().toString());
                detail.putExtra(DetailAudio.EXTRA_DESC, a.getDescription().toString());
                detail.putExtra(DetailAudio.EXTRA_URI, a.getSoundUri().toString());
                holder.itemView.getContext().startActivity(detail);
            }
        });
        holder.dltaudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return listAudio.size();
    }
    public void delete(int pos){
        listAudio.remove(pos);
        notifyItemRemoved(pos);
        notifyItemRangeChanged(pos, listAudio.size());
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgaudio;
        TextView ttlaudio, dscaudio;
        ImageButton dltaudio;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgaudio = itemView.findViewById(R.id.imgaudio);
            ttlaudio = itemView.findViewById(R.id.ttlaudio);
            dscaudio = itemView.findViewById(R.id.dscaudio);
            dltaudio = itemView.findViewById(R.id.dltaudio);
        }
    }
}
