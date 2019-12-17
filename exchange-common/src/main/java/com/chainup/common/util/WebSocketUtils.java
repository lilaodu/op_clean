package com.chainup.common.util;

import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.java_websocket.client.DefaultSSLWebSocketClientFactory;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebSocketUtils extends WebSocketClient {

	private static Logger log = LoggerFactory.getLogger(WebSocketUtils.class);

	private static WebSocketUtils wsclient = null;
	private static String msg = "";

	public WebSocketUtils(URI serverURI) {
		super(serverURI);
	}

    public WebSocketUtils(URI serverUri, Draft draft) {
        super(serverUri, draft);
    }

    public WebSocketUtils(URI serverUri, Map<String, String> headers, int connecttimeout) {
        super(serverUri, new Draft_17(), headers, connecttimeout);
    }
	
	@Override
	public void onOpen(ServerHandshake handshakedata) {
		log.info("opened connection");
	}

	@Override
	public void onMessage(String message) {
		log.info("received:" + message);
	}

	@Override
	public void onMessage(ByteBuffer socketBuffer) {
		try {
			String marketStr = CommonUtils.byteBufferToString(socketBuffer);
			String market = CommonUtils.uncompress(marketStr).toLowerCase();
			if (market.contains("ping")) {
				String tmp = market.replace("ping", "pong");
				wsclient.send(market.replace("ping", "pong"));
			} else {
				msg = market;
			}
		} catch (IOException e) {
			log.error("received error:" + e.getMessage());
		}
	}
	
	public String getReceiveMsg(){
		return msg;
	}
	
	@Override
	public void onClose(int code, String reason, boolean remote) {
		log.info("Connection closed by " + (remote ? "remote peer" : "us") + " Code: " + code + " Reason: " + reason);
	}

	@Override
	public void onError(Exception ex) {
		log.error("websocket connection error:" + ex.getMessage());
	}

	public static Map<String, String> getWebSocketHeaders() throws IOException {
		Map<String, String> headers = new HashMap<String, String>();
		return headers;
	}

	private static void trustAllHosts(WebSocketUtils appClient) {
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return new java.security.cert.X509Certificate[] {};
			}

			public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			}

			public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
			}
		} };

		try {
			SSLContext sc = SSLContext.getInstance("TLS");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			appClient.setWebSocketFactory(new DefaultSSLWebSocketClientFactory(sc));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebSocketUtils executeWebSocket(String url,String sendMsg) throws Exception {
		wsclient = new WebSocketUtils(new URI(url), getWebSocketHeaders(), 1000);
		trustAllHosts(wsclient);
		wsclient.connectBlocking();
		wsclient.send(sendMsg);
		log.info("send:" + sendMsg);
		return wsclient;
	}

}
