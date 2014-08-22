package com.rhiscom.bpm.http.event.client;

import java.io.IOException;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.apache.http.client.ClientProtocolException;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.rhiscom.bpm.http.event.model.ProcessMessageEvent;

public class BPMHttpEventClient implements HttpEventClient {

    private String url;

    public BPMHttpEventClient(String endPoint) {
	url = endPoint;

    }

    @Override
    public void sendProcessMessageEvent(ProcessMessageEvent processMessageEvent) throws ClientProtocolException,
	    IOException {
	ResteasyClient client = new ResteasyClientBuilder().build();

	ResteasyWebTarget target = client.target(url
		+ "/vigia-bpm-web/rest/ConsoleServerRestService/processmessage/send");

	Response response = target.request().post(Entity.entity(processMessageEvent, "application/json"));

	if (response.getStatus() != 200) {
	    throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
	}
    }

}
