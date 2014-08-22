package com.rhiscom.bpm.http.event;

import com.rhiscom.bpm.http.event.client.BPMHttpEventClient;
import com.rhiscom.bpm.http.event.client.HttpEventClient;

public class EventClientFactory {

    public static HttpEventClient getHttpEventClient(String url) {
	return new BPMHttpEventClient(url);

    }

}
