package lpi.server.rmi;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

    private static Registry Registry;
    public static Registry registry;

    public static void main(String[] args) throws IOException {
		System.out.println("Welcome to RST test TCP Server. Press ENTER to shutdown.");

		try (RmiServer server = new RmiServer(args)) {
			server.run();
			System.in.read();
		}
		
		System.out.println("The server was shut down.");
		////
        /*if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            String name = "lpi.server.rmi";
            RmiServer engine = new RmiServer();
        //    System.getProperty("lpi.server.rmi","localhost");
            IServer stub =(IServer) UnicastRemoteObject.exportObject(engine, 0);
            registry = LocateRegistry.createRegistry(0);
            //Registry registry = null;
            //assert registry != null;
            registry.rebind("lpi.server.rmi",stub);
           //sessionTimer.schedule(new SessionCleanupTask(), CLEANUP_DELAY_MS, CLEANUP_DELAY_MS);
            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }*/
    }
	}

