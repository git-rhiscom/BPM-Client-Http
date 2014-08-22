package com.rhiscom.bpm.http.event.client;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.rhiscom.bpm.http.event.model.ProcessMessageEvent;

public interface HttpEventClient {

    void sendProcessMessageEvent(ProcessMessageEvent atnEvent) throws ClientProtocolException, IOException;

}
