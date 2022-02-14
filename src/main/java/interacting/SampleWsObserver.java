package interacting;

import uk.oczadly.karl.jnano.websocket.WsObserver;

public class SampleWsObserver implements WsObserver {
    @Override
    public void onOpen(int httpStatus) {
        System.out.println("WebSocket connected!");
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("WebSocket disconnected!");
    }

    @Override
    public void onSocketError(Exception ex) {
        ex.printStackTrace();
    }
}
