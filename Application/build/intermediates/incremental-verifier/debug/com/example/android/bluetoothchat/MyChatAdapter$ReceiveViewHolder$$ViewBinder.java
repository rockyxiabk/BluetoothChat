// Generated code from Butter Knife. Do not modify!
package com.example.android.bluetoothchat;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MyChatAdapter$ReceiveViewHolder$$ViewBinder<T extends com.example.android.bluetoothchat.MyChatAdapter.ReceiveViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296286, "field 'receiveName'");
    target.receiveName = finder.castView(view, 2131296286, "field 'receiveName'");
    view = finder.findRequiredView(source, 2131296287, "field 'receiveMessage'");
    target.receiveMessage = finder.castView(view, 2131296287, "field 'receiveMessage'");
  }

  @Override public void unbind(T target) {
    target.receiveName = null;
    target.receiveMessage = null;
  }
}
