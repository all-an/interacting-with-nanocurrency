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
        RpcQueryNode rpc = new RpcQueryNode();          // Using localhost:7076
        RpcQueryNode rpc2 = RpcServiceProviders.nanex(); // Using nanex.cc public API

        // Construct and execute the request, and obtain the response
        ResponseBalance balance = rpc.processRequest(new RequestAccountBalance(
                "nano_34qjpc8t1u6wnb584pc4iwsukwa8jhrobpx4oea5gbaitnqafm6qsgoacpiz"));

// Handle the result object however you wish (eg. print the balance)
        System.out.println("Account balance: " + balance.getTotal());


    }
}
