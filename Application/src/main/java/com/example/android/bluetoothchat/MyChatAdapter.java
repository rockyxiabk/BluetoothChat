package com.example.android.bluetoothchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by y7un on 2016/5/4.
 */
public class MyChatAdapter extends BaseAdapter {
    private Context context;
    private List<ChatMessage> list;

    public MyChatAdapter(Context context, List<ChatMessage> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        int ret = 0;
        if (null != list && list.size() > 0)
            ret = list.size();
        return ret;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        ChatMessage chatMessage = list.get(position);
        switch (chatMessage.getType()) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return -1;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ChatMessage chatMessage = list.get(position);
        switch (chatMessage.getType()) {
            case 0:
                return sendView(position, convertView, parent);
            case 1:
                return receiveView(position, convertView, parent);
            default:
                return null;
        }
    }

    private View sendView(int position, View convertView, ViewGroup parent) {
        SendViewHolder holder = null;
        if (null == convertView) {
            convertView = LayoutInflater.from(context).inflate(R.layout.sendmessage, parent, false);
            holder = new SendViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = ((SendViewHolder) convertView.getTag());
        }
        ChatMessage message = list.get(position);
        holder.sendName.setText(message.getName());
        holder.sendMessage.setText(message.getMessage());
        return convertView;
    }

    private View receiveView(int position, View convertView, ViewGroup parent) {
        ReceiveViewHolder holder = null;
        if (null == convertView) {
            convertView = LayoutInflater.from(context).inflate(R.layout.receivemessage, parent, false);
            holder = new ReceiveViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = ((ReceiveViewHolder) convertView.getTag());
        }
        ChatMessage message = list.get(position);
        holder.receiveName.setText(message.getName());
        holder.receiveMessage.setText(message.getMessage());
        return convertView;
    }

    static class ReceiveViewHolder {
        @Bind(R.id.receive_name)
        TextView receiveName;
        @Bind(R.id.receive_message)
        TextView receiveMessage;

        ReceiveViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    static class SendViewHolder {
        @Bind(R.id.send_name)
        TextView sendName;
        @Bind(R.id.send_message)
        TextView sendMessage;

        SendViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
