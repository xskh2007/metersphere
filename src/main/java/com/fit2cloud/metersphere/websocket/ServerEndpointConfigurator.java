package com.fit2cloud.metersphere.websocket;

import com.fit2cloud.metersphere.user.SessionUtils;

import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

public class ServerEndpointConfigurator extends ServerEndpointConfig.Configurator {
    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        // 将用户信息存储到socket的配置里
        System.out.println(SessionUtils.getUser());
        sec.getUserProperties().put("user", SessionUtils.getUser());
        super.modifyHandshake(sec, request, response);
    }
}
