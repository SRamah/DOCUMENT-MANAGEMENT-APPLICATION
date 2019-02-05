package interfaceGraphique;

import chrriis.dj.nativeswing.swtimpl.NativeInterface;

public class mainHolder {
	
	public static void main( final String[] args ) {

		
		NativeInterface.open();  

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	
            public void run() {
            	
            	
            	System.out.println("ok");
//            	snappy.setSize(new Dimension(1024,700));
            }
        } );
		
        NativeInterface.runEventPump(); 
       
	}
}
