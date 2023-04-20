package guiInterface;

import javax.swing.*;
import javax.swing.JOptionPane;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import smartair.sensorService.getDataRequest;
import smartair.sensorService.getDataResponse;
import smartair.sensorService.sensorServiceGrpc;
import smartair.sensorService.sensorServiceGrpc.sensorServiceBlockingStub;
import smartair.sensorService.inputDataRequest;
import smartair.sensorService.inputDataResponse;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuiSmartAirInterface extends JFrame implements ActionListener {
    // Declare components
    private JLabel label1, label2, label3, label4;
    private JButton button;
    public JTextField textField1, textField2, textField3;
	JTextArea textField4;
    
	final Logger logger = Logger.getLogger("ClientLogger");
	
    public void DrawGuiInterface (String outputMessage) {
        // Set up the frame
        setTitle("Air Pollution Detector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create the components
        label1 = new JLabel("Threshold CO Detection");
        textField1 = new JTextField(5);
        textField1.setText("350.56");
        JLabel ppmLabel1 = new JLabel("ppm");

        label2 = new JLabel("Timestamp input:");
        textField2 = new JTextField(5);
        textField2.setEditable(true);
       
        JLabel hourLabel = new JLabel("24h");
       

        label3 = new JLabel("Current CO Reading:");
        textField3 = new JTextField(5);
        textField3.setEditable(true);
        JLabel ppmLabel2 = new JLabel("ppm");

        label4 = new JLabel("Output Message:");
        textField4 = new JTextArea(10, 40);
        textField4.setText(outputMessage);
        textField4.setEditable(false); // Make the text area read-only
        
        button = new JButton("Analyse Data");
        button.addActionListener(this);
        setVisible(true);

        // Add the components to the frame
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5); // Add space around the components
        panel.add(label1, c);
        c.gridx = 1;
        panel.add(textField1, c);
        c.gridx = 2;
        panel.add(ppmLabel1, c);
        c.gridx = 0;
        c.gridy = 1;
        panel.add(label2, c);
        c.gridx = 1;
        panel.add(textField2, c);
        c.gridx = 2;
        panel.add(hourLabel, c);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(label3, c);
        c.gridx = 1;
        panel.add(textField3, c);
        c.gridx = 2;
        panel.add(ppmLabel2, c);
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        panel.add(button, c);
        c.gridx = 0;
        c.gridy = 4;
        c.fill = GridBagConstraints.HORIZONTAL; // Stretch the message text area horizontally
        c.anchor = GridBagConstraints.PAGE_END; // Anchor the message text area to the bottom of the frame
        panel.add(new JScrollPane(textField4), c);

        add(panel);
        		
     

        // Display the frame
        setVisible(true);
    }
    
    public void actionPerformed (ActionEvent ae) {
    	
    	String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		sensorServiceBlockingStub  blockingStub = sensorServiceGrpc.newBlockingStub(channel);
				
	   
	    
	    try {
	    	 double timestamp = Double.parseDouble(textField2.getText());
	    	 float coReading = Float.parseFloat(textField3.getText());
	    	 inputDataRequest request = inputDataRequest.newBuilder().setCurrentTimeStamp(timestamp).setCoReading(coReading).build();
	    	 
	    	inputDataResponse response = blockingStub.inputData(request);
	    	String output;
	        if (response.getDataRegistred()) {
	        	 output = "Data Registered successfully";
	        }else {
	        	 output = "Data Not Registered";
	        }
	    	
			this.DrawGuiInterface(output); 	 

	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return; 
		    
	    } finally {
	    	//shutdown channel
	    	try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	  }
    

    public static void main(String[] args) {
    	
    	 
    	 
    	 
       GuiSmartAirInterface guismartairinterface =  new GuiSmartAirInterface();
       
       guismartairinterface.DrawGuiInterface("");
        
       
        
        		
        	
        	
        
    }
}



