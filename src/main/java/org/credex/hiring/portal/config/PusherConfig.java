package org.credex.hiring.portal.config;
import com.pusher.rest.Pusher;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PusherConfig {

    @Value("${pusher.appId}")
    private String appId;

    @Value("${pusher.key}")
    private String key;

    @Value("${pusher.secret}")
    private String secret;

    @Bean
    public Pusher pusher() {
        Pusher pusher =  new Pusher("1576246", "2f86dc269c7f0d0b636b", "0c8c5d2561acab44642b");
        pusher.setCluster("ap2");
        pusher.setEncrypted(true);
        return pusher;
    }
}


