package com.pb.korotkaya.hw14_3.Network;

public interface TCPConnectionListener {

    public void onConnectionReady(TCPConnection tcpConnection);

    public  void onReceiveString(TCPConnection tcpConnection, String value);

    public void onDisconnect(TCPConnection tcpConnection);

    public void onException(TCPConnection tcpConnection, Exception e);
}

