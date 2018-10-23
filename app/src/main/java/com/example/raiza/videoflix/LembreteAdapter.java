package com.example.raiza.videoflix;

import android.content.Context;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

class LembreteAdapter extends RecyclerView.Adapter<LembreteAdapter.ViewHolder>{
    private Cursor cursor;
    public LembreteAdapter(Cursor c){
        cursor = c;
    }

    public void setCursor(Cursor c){
        cursor = c;
        notifyDataSetChanged();

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View serieView = inflater.inflate(R.layout.serie_layout,parent,false);
        ViewHolder holder = new ViewHolder(serieView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int idxTitulo = cursor.getColumnIndexOrThrow(SeriesContract.Lembrete.COLUMN_NAME_TITULO);

        int idxAutor = cursor.getColumnIndexOrThrow(SeriesContract.Lembrete.COLUMN_NAME_TEMPORADA);

        int idxEp = cursor.getColumnIndexOrThrow(SeriesContract.Lembrete.COLUMN_NAME_EP);

        cursor.moveToPosition(position);
        holder.txtTitulo.setText(cursor.getString(idxTitulo));
        holder.txtTemporada.setText(cursor.getString(idxAutor));
        holder.txtEp.setText(String.valueOf(cursor.getString(idxEp)));
    }

    @Override
    public int getItemCount() {
        return cursor.getCount();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView txtTitulo;
        public TextView txtTemporada;
        public TextView txtEp;

        public ViewHolder(View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.lembrete_txt_titulo);
            txtTemporada = itemView.findViewById(R.id.lembrete_txt_temporada);
            txtEp = itemView.findViewById(R.id.lembrete_txt_ep);
        }
    }

}


