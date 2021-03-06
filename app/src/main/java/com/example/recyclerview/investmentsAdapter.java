package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class investmentsAdapter extends RecyclerView.Adapter<investmentsAdapter.ViewHolder> {

    List<investment> investmentList;

    public investmentsAdapter(List<investment> investmentList) {
        this.investmentList = investmentList;
    }

    @NonNull
    @Override
    public investmentsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.investment_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull investmentsAdapter.ViewHolder holder, int position) {
        holder.item_title.setText(investmentList.get(position).getTitle());
        holder.description.setText(investmentList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return investmentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item_title;
        TextView description;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }
}
