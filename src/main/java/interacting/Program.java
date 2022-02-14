package interacting;

import uk.oczadly.karl.jnano.rpc.RpcQueryNode;
import uk.oczadly.karl.jnano.rpc.exception.RpcException;
import uk.oczadly.karl.jnano.rpc.request.RpcRequest;
import uk.oczadly.karl.jnano.rpc.request.node.RequestAccountBalance;
import uk.oczadly.karl.jnano.rpc.request.wallet.RequestAccountCreate;
import uk.oczadly.karl.jnano.rpc.response.ResponseAccount;
import uk.oczadly.karl.jnano.rpc.response.ResponseBalance;
import uk.oczadly.karl.jnano.rpc.util.RpcServiceProviders;
import uk.oczadly.karl.jnano.websocket.NanoWebSocketClient;
import uk.oczadly.karl.jnano.websocket.topic.TopicConfirmation;

import java.io.IOException;
import java.net.Socket;

public class Program {
    public static void main(String[] args) throws RpcException, IOException, InterruptedException {
        NanoWebSocketClient ws = new NanoWebSocketClient(); // Defaults to localhost:7078
        ws.connect(); // Connect to the endpoint


    }
}
