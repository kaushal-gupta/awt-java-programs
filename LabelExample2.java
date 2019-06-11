import java.awt.*;  
import java.awt.event.*;  


public class LabelExample2  implements ActionListener
  {  
	Frame f=new Frame("Label Example");

    TextField tf; Label l; Button b;  
    LabelExample2()
	{  
        tf=new TextField();  
        tf.setBounds(50,50, 150,20);  
        l=new Label();  
        l.setBounds(50,100, 250,20);      
        b=new Button("Find IP");  
        b.setBounds(50,150,60,30);  
        b.addActionListener(this);    
        f.add(b);f.add(tf);f.add(l);    
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
  	}

  
    public void actionPerformed(ActionEvent e)
    {  
        try
	{  
        String host=tf.getText();  
        String ip=java.net.InetAddress.getByName(host).getHostAddress();  
        l.setText("IP of "+host+" is: "+ip);  
        }
	catch(Exception ex)
	{
	System.out.println(ex);
	}  
    }  

	    public static void main(String[] args) 
		{  
        	new LabelExample2();  
   	 	}  
};  