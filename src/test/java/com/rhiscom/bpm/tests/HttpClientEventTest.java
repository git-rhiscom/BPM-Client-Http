package com.rhiscom.bpm.tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.rhiscom.bpm.http.event.EventClientFactory;
import com.rhiscom.bpm.http.event.client.HttpEventClient;
import com.rhiscom.bpm.http.event.model.ProcessMessageEvent;

public class HttpClientEventTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void sendProcessMessage() {

	try {

	    HttpEventClient client = EventClientFactory.getHttpEventClient("http://localhost:8080");
	    ProcessMessageEvent processMessage = new ProcessMessageEvent();

	    processMessage.setOperatorMessageCode("009");
	    processMessage.setProcessCode("PROC001");
	    processMessage.setProcessState(ProcessMessageEvent.PROCESS_STATE_ERROR);
	    processMessage.setProcessText("PROCESO 1");
	    processMessage.setHost("127.0.0.1");
	    client.sendProcessMessageEvent(processMessage);

	} catch (Exception e) {

	    e.printStackTrace();

	}
    }
}
