package com.mgaudin.ht.echo;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EchoHandler extends AbstractHandler {
    public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);

        String l = httpServletRequest.getReader().readLine();
        while (l != null) {
            httpServletResponse.getWriter().println(l);
            l = httpServletRequest.getReader().readLine();
        }

        request.setHandled(true);
    }
}
