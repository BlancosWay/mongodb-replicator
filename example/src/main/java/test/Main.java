package test;

import flipkart.mongo.replicator.bootstrap.ReplicatorBootstrap;
import flipkart.mongo.replicator.core.interfaces.IReplicationHandler;
import flipkart.mongo.replicator.core.model.ReplicationEvent;

/**
 * Created by pradeep on 09/10/14.
 */
public class Main {

    public static void main(String args[]) throws Exception {

        ReplicatorBootstrap bootstrap = new ReplicatorBootstrap("w3-cart-svc10.nm.flipkart.com", 27200, new Test());
        bootstrap.initialize();
    }

    public static class Test implements IReplicationHandler {

        @Override
        public void replicate(ReplicationEvent replicationEvent) {
            System.out.println(replicationEvent.operation);
        }
    }

}
