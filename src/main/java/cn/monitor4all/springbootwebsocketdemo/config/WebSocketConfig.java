package cn.monitor4all.springbootwebsocketdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;


@Configuration
@EnableWebSocketMessageBroker
//@EnableWebSocketMessageBroker用于启用我们的WebSocket服务器。
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //我们注册一个websocket端点，客户端将使用它连接到我们的websocket服务器。
        registry.addEndpoint("/ws").withSockJS();
        //withSockJS()是用来为不支持websocket的浏览器启用后备选项，使用了SockJS。
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //我们配置一个消息代理，用于将消息从一个客户端路由到另一个客户端
        registry.setApplicationDestinationPrefixes("/app");
        //定义了以“/app”开头的消息应该路由到消息处理方法
        // Enables a simple in-memory broker
        registry.enableSimpleBroker("/topic");
        //定义了以“/topic”开头的消息应该路由到消息代理。消息代理向订阅特定主题的所有连接客户端广播消息。
        //   Use this for enabling a Full featured broker like RabbitMQ
        /*
        registry.enableStompBrokerRelay("/topic")
                .setRelayHost("localhost")
                .setRelayPort(61613)
                .setClientLogin("guest")
                .setClientPasscode("guest");
        */
    }
}
