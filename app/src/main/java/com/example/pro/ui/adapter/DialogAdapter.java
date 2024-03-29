package com.example.pro.ui.adapter;


import android.view.View;

import androidx.databinding.ViewDataBinding;



import com.purewhite.ywc.frame.R;
import com.purewhite.ywc.frame.databinding.AdapterDialogTwoBinding;
import com.purewhite.ywc.purewhitelibrary.adapter.recyclerview.BindAdapter;
import com.purewhite.ywc.purewhitelibrary.adapter.viewholder.BindHolder;

import java.util.List;

public class DialogAdapter extends BindAdapter<String> {

    public DialogAdapter(List<String> list) {
        super(list);
        addLayout(R.layout.adapter_dialog_two);
    }

    @Override
    protected void onData(BindHolder holder, int position, String s, int itemType) {
        ViewDataBinding binding = holder.getBinding();
        if (binding instanceof AdapterDialogTwoBinding)
        {
            initAdapterDialog(((AdapterDialogTwoBinding) binding),position,s);
        }
    }

    private void initAdapterDialog(AdapterDialogTwoBinding binding, int position, String s) {
        binding.dialogListText.setText(s);
        binding.viewLine.setVisibility(position==obtainDataCount()-1?View.GONE:View.VISIBLE);

    }


}
