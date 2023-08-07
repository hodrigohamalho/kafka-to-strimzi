package org.acme;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("kafka:camel-book")
            .log("Message received from camel-book : ${body}");
            // .log("    on the topic ${headers[kafka.TOPIC]}")
            // .log("    on the partition ${headers[kafka.PARTITION]}")
            // .log("    with the offset ${headers[kafka.OFFSET]}")
            // .log("    with the key ${headers[kafka.KEY]}");

        from("kafka:activemq-book")
            .log("Message received from activemq-book : ${body}");
            // .log("    on the topic ${headers[kafka.TOPIC]}")
            // .log("    on the partition ${headers[kafka.PARTITION]}")
            // .log("    with the offset ${headers[kafka.OFFSET]}")
            // .log("    with the key ${headers[kafka.KEY]}");

    }
    
}
