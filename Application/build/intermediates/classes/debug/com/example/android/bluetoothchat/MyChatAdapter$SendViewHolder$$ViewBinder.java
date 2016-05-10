// Generated code from Butter Knife. Do not modify!
package com.example.android.bluetoothchat;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MyChatAdapter$SendViewHolder$$ViewBinder<T extends com.example.android.bluetoothchat.MyChatAdapter.SendViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131296288, "field 'sendName'");
    target.sendName = finder.castView(view, 2131296288, "field 'sendName'");
    view = finder.findRequiredView(source, 2131296289, "field 'sendMessage'");
    target.sendMessage = finder.castView(view, 2131296289, "field 'sendMessage'");
  }

  @Override public void unbind(T target) {
    target.sendName = null;
    target.sendMessage = null;
  }
}
