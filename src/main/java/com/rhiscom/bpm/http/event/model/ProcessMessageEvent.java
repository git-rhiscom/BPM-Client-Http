package com.rhiscom.bpm.http.event.model;

public class ProcessMessageEvent {
    public static final int PROCESS_STATE_START = 1;
    public static final int PROCESS_STATE_FINISH = 2;
    public static final int PROCESS_STATE_WARNING = 3;
    public static final int PROCESS_STATE_INFO = 4;
    public static final int PROCESS_STATE_ERROR = 9;
    public static final int PROCESS_STATE_FATAL_ERROR = 10;

    private String processCode; // largo 3. Id asociado a un proceso
    private String operatorMessageCode; // largo 4.
    private int processState; // largo 2. Estado del proceso
    private String processText; // largo 127. Descripcion del mensaje.
    private String host;

    public String getProcessCode() {
	return processCode;
    }

    public void setProcessCode(String processCode) {
	this.processCode = processCode;
    }

    public String getOperatorMessageCode() {
	return operatorMessageCode;
    }

    public void setOperatorMessageCode(String operatorMessageCode) {
	this.operatorMessageCode = operatorMessageCode;
    }

    public int getProcessState() {
	return processState;
    }

    public void setProcessState(int processState) {
	this.processState = processState;
    }

    public String getProcessText() {
	return processText;
    }

    public void setProcessText(String processText) {
	this.processText = processText;
    }

    public String getHost() {
	return host;
    }

    public void setHost(String host) {
	this.host = host;
    }

}
