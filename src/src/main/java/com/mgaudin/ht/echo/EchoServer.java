package com.mgaudin.ht.echo;

import org.eclipse.jetty.server.Server;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.setHandler(new EchoHandler());

        server.start();
        server.join();
    }
}