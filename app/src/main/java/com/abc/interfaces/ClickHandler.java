package com.abc.interfaces;

/**
 * Created by Anand on 21-09-2016.
 */
public interface ClickHandler {
    public void onClickHandle(int position);
    public void sendFriendRequest(int position);
    public void denyFriendREquest(int position);
    public void acceptFriendRequest(int position);
    public void removeFriendREquest(int position);

}
