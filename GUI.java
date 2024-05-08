package shop;
// * This code was generated with love by Window Builder VS Code extension. * //

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class GUI {
  static ArrayList <Customer> CUSTOMER = new  ArrayList<>();
  public static void main(String[] args) {
    ArrayList<Coffee> coffeeList = new ArrayList<>();
    ArrayList <Espresso> espressoList = new ArrayList<>();
    ArrayList<Premium> premiumList = new ArrayList<>();
    ArrayList<Regular> regularList = new ArrayList<>();
    ArrayList<Customer> customerList = new ArrayList<>();

    JFrame frame = new JFrame("coffee shop");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 15; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;



        JLabel label_0 = new JLabel("ARE YOU A REGULAR OR PREMIUM CUSTOMER?");
    constraints.gridx = -2;
    constraints.gridy = 10;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(label_0, constraints);

    frame.add(panel);
    frame.setVisible(true);



      //REGULAR BUTTON



    JButton button_regular = new JButton("REGULAR");
    button_regular.setPreferredSize(new Dimension(118, 123));

    constraints.gridx = -2;
    constraints.gridy = 11;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(button_regular, constraints);




      //after REGULAR button clciks 




    button_regular.addActionListener((ActionListener) new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("REGULAR")){

          //NEW FRAME 


          JFrame frame = new JFrame("INFO FRAME ");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(600, 400);

          JPanel panel = new JPanel(new GridBagLayout());
          GridBagConstraints constraints = new GridBagConstraints();

          // Fill the layout with placeholders
          for (int row = 0; row < 20; row++) {
              for (int col = 0; col < 15; col++) {
                  constraints.gridx = col;
                  constraints.gridy = row;
                  constraints.weightx = 1.0;
                  constraints.weighty = 1.0;
                  constraints.fill = GridBagConstraints.BOTH;

                  Component filler = Box.createRigidArea(new Dimension(0, 0));
                  panel.add(filler, constraints);
              }
          }

          constraints.weightx = 0;
          constraints.weighty = 0;
          constraints.fill = GridBagConstraints.NONE;
          constraints.anchor = GridBagConstraints.NORTHWEST;


      //input information

          JLabel first_name = new JLabel("ENTER FIRST NAME:");
          constraints.gridx = -3;
          constraints.gridy = 8;
          constraints.gridwidth = 2;
          constraints.gridheight = 2;
          panel.add(first_name, constraints);


          JTextField text_field_0 = new JTextField(15);
          text_field_0.setPreferredSize(new Dimension(133, 23));
          constraints.gridx = -3;
          constraints.gridy = 9;
          constraints.gridwidth = 5;
          constraints.gridheight = 5;

          panel.add(text_field_0, constraints);


          //attaching text field to first name 




          JLabel last_name = new JLabel("ENTER LAST NAME:");
          constraints.gridx = -3;
          constraints.gridy = 10;
          constraints.gridwidth = 2;
          constraints.gridheight = 2;
          panel.add(last_name, constraints);

          JTextField text_field_1 = new JTextField(15);
          text_field_1.setPreferredSize(new Dimension(133, 23));
          constraints.gridx = -3;
          constraints.gridy = 11;
          constraints.gridwidth = 5;
          constraints.gridheight = 5;
          panel.add(text_field_1, constraints);


          //attached last name 


          JLabel phone_number = new JLabel("ENTER YOUR PHONE NUMBER:");
          constraints.gridx = -3;
          constraints.gridy = 12;
          constraints.gridwidth = 2;
          constraints.gridheight = 2;
          panel.add(phone_number, constraints);

          JTextField text_field_2 = new JTextField(15);
          text_field_2.setPreferredSize(new Dimension(133, 23));
          constraints.gridx = -3;
          constraints.gridy = 13;
          constraints.gridwidth = 5;
          constraints.gridheight = 5;
          panel.add(text_field_2, constraints);


          //attached phonenumber


          frame.add(panel);
          frame.setVisible(true);

          String firstName = text_field_0.getText();
          String lastName = text_field_1.getText();
          String phoneNumber = text_field_2.getText();

          //COMPILE USING NEXT BUTTON 

          JButton button_next = new JButton("NEXT");
        button_next.setPreferredSize(new Dimension(120, 61));

        constraints.gridx = 0;
        constraints.gridy = 11;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(button_next, constraints);

        frame.add(panel);
        frame.setVisible(true);


        button_next.addActionListener((ActionListener)new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {

            String firstName = text_field_0.getText();
            String lastName = text_field_1.getText();
            String phoneNumber = text_field_2.getText();

          if(e.getActionCommand().equals("NEXT")){
            //dialog box 
            //first name last name phone number 
            //yes or no 
            Object[] options = {"Yes",
                    "No", "Cancel"
                    };
int n = JOptionPane.showOptionDialog(frame,

    "IS THIS CORRECT " + "\n" + firstName + "\n" + lastName + "\n" + phoneNumber,
    "A Silly Question",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,
    options,
    options[2]);

    if ( n == JOptionPane.YES_OPTION){

      //new window 

      JFrame frame = new JFrame("CE FRAME");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600, 400);

      JPanel panel = new JPanel(new GridBagLayout());
      GridBagConstraints constraints = new GridBagConstraints();

      // Fill the layout with placeholders
      for (int row = 0; row < 20; row++) {
          for (int col = 0; col < 15; col++) {
              constraints.gridx = col;
              constraints.gridy = row;
              constraints.weightx = 1.0;
              constraints.weighty = 1.0;
              constraints.fill = GridBagConstraints.BOTH;

              Component filler = Box.createRigidArea(new Dimension(0, 0));
              panel.add(filler, constraints);
          }
      }

      constraints.weightx = 0;
      constraints.weighty = 0;
      constraints.fill = GridBagConstraints.NONE;
      constraints.anchor = GridBagConstraints.NORTHWEST;




      //coffee menu button:regular

ArrayList<Coffee> coffeeList;
ArrayList<Regular> regularList;
ArrayList<Customer> customerList;



      JButton button_coffee = new JButton("COFFEE");
      button_coffee.setPreferredSize(new Dimension(119, 120));

      constraints.gridx = -1;
      constraints.gridy = 11;
      constraints.gridwidth = 4;
      constraints.gridheight = 4;
      panel.add(button_coffee, constraints);

      // open coffee menu



      button_coffee.addActionListener((ActionListener)new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
ArrayList <Coffee> coffeeList;
ArrayList <Customer> customerList;
int priceTotal = text_field_0.getSelectionStart();
int priceTax = text_field_1.getSelectionStart();
int priceFinal = text_field_2.getSelectionStart();


      JFrame frame = new JFrame("Coffee");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 15; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;




    Coffee coffee = new Coffee(firstName, lastName, phoneNumber, phoneNumber);




    JRadioButton radio_button_0 = new JRadioButton("LIGHT");
    JRadioButton radio_button_1 = new JRadioButton("MEDIUM");
    JRadioButton radio_button_2 = new JRadioButton("DARK");
    JRadioButton radio_button_none = new JRadioButton("none");
    JRadioButton radio_button_milk = new JRadioButton("Milk");
    JRadioButton radio_button_heavy = new JRadioButton("heavy cream");
    JRadioButton radio_button_syrup = new JRadioButton("classic syrup");
    radio_button_0.setPreferredSize(new Dimension(99, 16));
    radio_button_0.setSelected(false);
    constraints.gridx = -6;
    constraints.gridy = 5;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_0, constraints);



    radio_button_0.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){


        if(e.getActionCommand().equals("LIGHT")){


        //shut off buttons
          radio_button_1.setEnabled(false);
          radio_button_2.setEnabled(false);                                   


        } 
        }


    });


    //JRadioButton radio_button_1 = new JRadioButton("MEDIUM");
    radio_button_1.setPreferredSize(new Dimension(99, 16));
    radio_button_1.setSelected(false);
    constraints.gridx = -6;
    constraints.gridy = 6;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_1, constraints);

    //medium to text field 

    radio_button_1.addActionListener((ActionListener)new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("MEDIUM")){


          radio_button_0.setEnabled(false);
          radio_button_2.setEnabled(false);


        }
      }

    });

    //JRadioButton radio_button_2 = new JRadioButton("DARK");
    radio_button_2.setPreferredSize(new Dimension(99, 16));
    radio_button_2.setSelected(false);
    constraints.gridx = -6;
    constraints.gridy = 8;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_2, constraints);



    radio_button_2.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){


        radio_button_0.setEnabled(false);
        radio_button_1.setEnabled(false);
      }

    });



    //JRadioButton radio_button_none = new JRadioButton("none");
    radio_button_none.setPreferredSize(new Dimension(99, 16));
    radio_button_none.setSelected(false);
    constraints.gridx = -1;
    constraints.gridy = 10;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_none, constraints);



    radio_button_heavy.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
       radio_button_none.setEnabled(false);
       radio_button_milk.setEnabled(false);
       radio_button_syrup.setEnabled(false);
      } 


          });





    //JRadioButton radio_button_heavy = new JRadioButton("heavy cream");
    radio_button_heavy.setPreferredSize(new Dimension(99, 16));
    radio_button_heavy.setSelected(false);
    constraints.gridx = -1;
    constraints.gridy = 10;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_heavy, constraints);

    radio_button_heavy.addActionListener((ActionListener)new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
 radio_button_none.setEnabled(false);
 radio_button_milk.setEnabled(false);
 radio_button_syrup.setEnabled(false);
} 


    });

    //JRadioButton radio_button_milk = new JRadioButton("Milk");
    radio_button_milk.setPreferredSize(new Dimension(99, 16));
    radio_button_milk.setSelected(false);
    constraints.gridx = 0;
    constraints.gridy = 10;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_milk, constraints);
    radio_button_milk.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
       radio_button_none.setEnabled(false);
       radio_button_heavy.setEnabled(false);
       radio_button_syrup.setEnabled(false);
      } 


          });

    //JRadioButton radio_button_syrup = new JRadioButton("RadioButton");
    radio_button_syrup.setPreferredSize(new Dimension(99, 16));
    radio_button_syrup.setSelected(false);
    constraints.gridx = 0;
    constraints.gridy = 14;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_syrup, constraints);
    radio_button_syrup.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
       radio_button_none.setEnabled(false);
       radio_button_milk.setEnabled(false);
       radio_button_heavy.setEnabled(false);
      } 


          });










    JButton button_0 = new JButton("CLEAR");
    button_0.setPreferredSize(new Dimension(54, 27));
    button_0.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
       radio_button_0.setEnabled(true);
       radio_button_1.setEnabled(true);
       radio_button_2.setEnabled(true);
       radio_button_heavy.setEnabled(true);
       radio_button_milk.setEnabled(true);
       radio_button_none.setEnabled(true);
       radio_button_syrup.setEnabled(true);
      } 


          });

    constraints.gridx = -6;
    constraints.gridy = 12;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(button_0, constraints);

    JButton button_1 = new JButton("SAVE");
    button_1.setPreferredSize(new Dimension(200, 100));

    constraints.gridx = -6;
    constraints.gridy = 15;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(button_1, constraints);

    //save button 
    //create action listener that adds to array list 
    //shows price at the end

    button_1.addActionListener((ActionListener) new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        //info and choices into an array list 
        //array <object> = new array(parameters)

        JFrame frame = new JFrame("Final window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Fill the layout with placeholders
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 15; col++) {
                constraints.gridx = col;
                constraints.gridy = row;
                constraints.weightx = 1.0;
                constraints.weighty = 1.0;
                constraints.fill = GridBagConstraints.BOTH;

                Component filler = Box.createRigidArea(new Dimension(0, 0));
                panel.add(filler, constraints);
            }
        }

        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTHWEST;


        JTextArea final_order = new JTextArea(15, 20);
        final_order.setPreferredSize(new Dimension(100, 51));
        constraints.gridx = 0;
        constraints.gridy = 10;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(final_order, constraints);



        final_order.append("This is your order " + text_field_0.getText() );



//add action listener for final order










        frame.add(panel);
        frame.setVisible(true);


        ArrayList <Customer> regularList = new ArrayList<>();

        //parameter should be first name, last name, phone number, coffee type, total
        Regular regular = new Regular(firstName, lastName, phoneNumber, phoneNumber);
      Coffee coffee = new Coffee(firstName, lastName, phoneNumber, phoneNumber);
      regularList.add(regular);

        for(Customer customer:regularList){
          final_order.append(customer.toString());




          {
            if (radio_button_2.isSelected()) {
              final_order.append((coffee.getdarkRoast()));
            };
            if(radio_button_0.isSelected()){
              final_order.append((coffee.getlightRoast()));
            }
            if(radio_button_1.isSelected()){
              final_order.append((coffee.getmediumRoast()));
            };
            if(radio_button_none.isSelected()){
              final_order.append((coffee.getNone()));
            };
            if(radio_button_heavy.isSelected()){
              final_order.append((coffee.getHeavyCream()));
            };
            if(radio_button_syrup.isSelected()){
              final_order.append((coffee.getSyrup()));
            }
            if(radio_button_milk.isSelected()){
              final_order.append((coffee.getHeavyCream()));
            }
          }

        }
      }


    });




    frame.add(panel);
    frame.setVisible(true);
  }
});



      //espresso menu (regular)



      JButton button_espresso = new JButton("ESPRESSO");
      button_espresso.setPreferredSize(new Dimension(120, 119));

      constraints.gridx = 1;
      constraints.gridy = 11;
      constraints.gridwidth = 4;
      constraints.gridheight = 4;
      panel.add(button_espresso, constraints);

      JLabel label_ce = new JLabel("COFFEE OR ESPRESSO?");
      constraints.gridx = 0;
      constraints.gridy = 6;
      constraints.gridwidth = 2;
      constraints.gridheight = 2;
      panel.add(label_ce, constraints);

      frame.add(panel);
      frame.setVisible(true);






      button_espresso.addActionListener((ActionListener)new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){


      JFrame frame = new JFrame("ESPRESSO");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 15; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;





    // espresso buttons 


    JRadioButton radio_button_0 = new JRadioButton("LATTE");
    JRadioButton radio_button_1 = new JRadioButton("MOCHA");
    JRadioButton radio_button_2 = new JRadioButton("AMERICANO");
    //JRadioButton radio_button_mocha = new JRadioButton("Mocha");
    JRadioButton radio_button_whole = new JRadioButton("Whole Milk");
    JRadioButton radio_button_almond = new JRadioButton("Almond Milk");
    JRadioButton radio_button_whip = new JRadioButton("Whipped Cream");
    JRadioButton radio_button_none = new JRadioButton("none");
    radio_button_0.setPreferredSize(new Dimension(99, 16));
    radio_button_0.setSelected(false);
    constraints.gridx = -6;
    constraints.gridy = 5;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_0, constraints);

    radio_button_0.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        radio_button_1.setEnabled(false);
          radio_button_2.setEnabled(false);


      }
    });


    //JRadioButton radio_button_1 = new JRadioButton("MOCHA");
    radio_button_1.setPreferredSize(new Dimension(99, 16));
    radio_button_1.setSelected(false);
    constraints.gridx = -6;
    constraints.gridy = 6;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_1, constraints);

    radio_button_1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
       radio_button_0.setEnabled(false);
       radio_button_2.setEnabled(false);

      }
    });

    //JRadioButton radio_button_2 = new JRadioButton("AMERICANO");
    radio_button_2.setPreferredSize(new Dimension(99, 16));
    radio_button_2.setSelected(false);
    constraints.gridx = -6;
    constraints.gridy = 8;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_2, constraints);

    radio_button_2.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
        radio_button_0.setEnabled(false);
        radio_button_1.setEnabled(false);

      }
    });

    //JRadioButton radio_button_whole = new JRadioButton("Whole Milk");
        radio_button_whole.setPreferredSize(new Dimension(99, 16));
        radio_button_whole.setSelected(false);
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(radio_button_whole, constraints);
        radio_button_whole.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
           radio_button_almond.setEnabled(false);


          }
        });
        //JRadioButton radio_button_almond = new JRadioButton("Almond Milk");
        radio_button_almond.setPreferredSize(new Dimension(99, 16));
        radio_button_almond.setSelected(false);
        constraints.gridx = 3;
        constraints.gridy = 7;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(radio_button_almond, constraints);

        radio_button_almond.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
           radio_button_whole.setEnabled(false);

          }
        });


        //JRadioButton radio_button_whip = new JRadioButton("Whipped Cream");
        radio_button_whip.setPreferredSize(new Dimension(99, 16));
        radio_button_whip.setSelected(false);
        constraints.gridx = 6;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(radio_button_whip, constraints);
        radio_button_whip.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
           radio_button_none.setEnabled(false);
          }
        });

        //JRadioButton radio_button_none = new JRadioButton("none");
        radio_button_none.setPreferredSize(new Dimension(99, 16));
        radio_button_none.setSelected(false);
        constraints.gridx = 6;
        constraints.gridy = 4;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(radio_button_none, constraints);
        radio_button_none.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
           radio_button_almond.setEnabled(false);
           radio_button_whole.setEnabled(false);
           radio_button_whip.setEnabled(false);


          }
        });



    JButton button_clear = new JButton("CLEAR");
    button_clear.setPreferredSize(new Dimension(54, 27));

    constraints.gridx = -6;
    constraints.gridy = 12;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(button_clear, constraints);
    button_clear.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
      radio_button_0.setEnabled(true);
      radio_button_1.setEnabled(true);
      radio_button_2.setEnabled(true);
      radio_button_almond.setEnabled(true);
      radio_button_none.setEnabled(true);
      radio_button_whip.setEnabled(true);
      radio_button_whole.setEnabled(true);

      }
    });

    JButton button_1 = new JButton("SAVE");
    button_1.setPreferredSize(new Dimension(200, 100));

    constraints.gridx = -6;
    constraints.gridy = 15;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(button_1, constraints);

    //when clicking save open new frame
    button_1.addActionListener((ActionListener) new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        //info and choices into an array list 
        //array <object> = new array(parameters)

        JFrame frame = new JFrame("Final window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Fill the layout with placeholders
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 15; col++) {
                constraints.gridx = col;
                constraints.gridy = row;
                constraints.weightx = 1.0;
                constraints.weighty = 1.0;
                constraints.fill = GridBagConstraints.BOTH;

                Component filler = Box.createRigidArea(new Dimension(0, 0));
                panel.add(filler, constraints);
            }
        }

        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTHWEST;


        JTextArea final_order = new JTextArea(15, 20);
        final_order.setPreferredSize(new Dimension(100, 51));
        final_order.setEditable(false);
        constraints.gridx = 0;
        constraints.gridy = 10;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(final_order, constraints);



        final_order.append("This is your order " + text_field_0.getText() );



//add action listener for final order










        frame.add(panel);
        frame.setVisible(true);


        ArrayList <Customer> regularList = new ArrayList<>();

        //parameter should be first name, last name, phone number, coffee type, total
        Regular regular = new Regular(firstName, lastName, phoneNumber, phoneNumber);
      Espresso espresso = new Espresso(firstName, lastName,phoneNumber);

      regularList.add(regular);

        for(Customer customer:regularList){
          final_order.append(customer.toString());




          {
            if (radio_button_2.isSelected()) {
              final_order.append((espresso.getMocha()));
            };
            if(radio_button_0.isSelected()){
              final_order.append((espresso.getLatte()));
            }
            if(radio_button_1.isSelected()){
              final_order.append((espresso.getMocha()));
            };
            if(radio_button_none.isSelected()){
              final_order.append((espresso.getNone()));
            };
            if(radio_button_whole.isSelected()){
              final_order.append((espresso.getWhole()));
            };
            if(radio_button_whip.isSelected()){
              final_order.append((espresso.getWhip()));
            }
            if(radio_button_almond.isSelected()){
              final_order.append((espresso.getAlmond()));
            }
          }

        }
      }


    });






    frame.add(panel);
    frame.setVisible(true);

  }
}
      );
  }
  }



        }

      }

        );
      }
    }
  });


        //PREMIUM BUTTON

    JButton button_premium = new JButton("PREMIUM");
    button_premium.setPreferredSize(new Dimension(118, 123));
    constraints.gridx = 0;
    constraints.gridy = 15;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(button_premium, constraints);



    //after PREMIUM button clicks



    button_premium.addActionListener((ActionListener) new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
       if(e.getActionCommand().equals("PREMIUM")){

        // new frame

    JFrame frame = new JFrame("INFO FRAME ");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints constraints = new GridBagConstraints();

    // Fill the layout with placeholders
    for (int row = 0; row < 20; row++) {
        for (int col = 0; col < 15; col++) {
            constraints.gridx = col;
            constraints.gridy = row;
            constraints.weightx = 1.0;
            constraints.weighty = 1.0;
            constraints.fill = GridBagConstraints.BOTH;

            Component filler = Box.createRigidArea(new Dimension(0, 0));
            panel.add(filler, constraints);
        }
    }

    constraints.weightx = 0;
    constraints.weighty = 0;
    constraints.fill = GridBagConstraints.NONE;
    constraints.anchor = GridBagConstraints.NORTHWEST;

    //input information  


    JLabel first_name = new JLabel("ENTER FIRST NAME:");
    constraints.gridx = -3;
    constraints.gridy = 8;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(first_name, constraints);

    JTextField text_field_0 = new JTextField(15);
    text_field_0.setPreferredSize(new Dimension(133, 23));
    constraints.gridx = -3;
    constraints.gridy = 9;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(text_field_0, constraints);

    JLabel last_name = new JLabel("ENTER LAST NAME:");
    constraints.gridx = -3;
    constraints.gridy = 10;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(last_name, constraints);

    JTextField text_field_1 = new JTextField(15);
    text_field_1.setPreferredSize(new Dimension(133, 23));
    constraints.gridx = -3;
    constraints.gridy = 11;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(text_field_1, constraints);

    JLabel phone_number = new JLabel("ENTER YOUR PHONE NUMBER:");
    constraints.gridx = -3;
    constraints.gridy = 12;
    constraints.gridwidth = 2;
    constraints.gridheight = 2;
    panel.add(phone_number, constraints);

    JTextField text_field_2 = new JTextField(15);
    text_field_2.setPreferredSize(new Dimension(133, 23));
    constraints.gridx = -3;
    constraints.gridy = 13;
    constraints.gridwidth = 5;
    constraints.gridheight = 5;
    panel.add(text_field_2, constraints);

    frame.add(panel);
    frame.setVisible(true);


    //compile premium customer 

    JButton button_next = new JButton("NEXT");
        button_next.setPreferredSize(new Dimension(120, 61));

        constraints.gridx = 0;
        constraints.gridy = 11;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(button_next, constraints);
        frame.add(panel);
        frame.setVisible(true);


        button_next.addActionListener((ActionListener)new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {


            String firstName = text_field_0.getText();
            String lastName = text_field_1.getText();
            String phoneNumber = text_field_2.getText(); 

            if(e.getActionCommand().equals("NEXT")){
              //dialog box 
              //first name last name phone number 
              //yes or no 
              Object[] options = {"Yes",
                      "No", "Cancel"
                      };
  int n = JOptionPane.showOptionDialog(frame,

      "IS THIS CORRECT " + "\n" + firstName + "\n" + lastName + "\n" + phoneNumber,
      "A Silly Question",
      JOptionPane.YES_NO_CANCEL_OPTION,
      JOptionPane.QUESTION_MESSAGE,
      null,
      options,
      options[2]);

      if ( n == JOptionPane.YES_OPTION){

        //new window 

        JFrame frame = new JFrame("CE FRAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Fill the layout with placeholders
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 15; col++) {
                constraints.gridx = col;
                constraints.gridy = row;
                constraints.weightx = 1.0;
                constraints.weighty = 1.0;
                constraints.fill = GridBagConstraints.BOTH;

                Component filler = Box.createRigidArea(new Dimension(0, 0));
                panel.add(filler, constraints);
            }
        }

        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTHWEST;



        //coffee menu button:premium




        JButton button_coffee = new JButton("COFFEE");
        button_coffee.setPreferredSize(new Dimension(119, 120));

        constraints.gridx = -1;
        constraints.gridy = 11;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(button_coffee, constraints);

        // open coffee menu
        button_coffee.addActionListener((ActionListener)new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){


        JFrame frame = new JFrame("Coffee");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600, 400);

      JPanel panel = new JPanel(new GridBagLayout());
      GridBagConstraints constraints = new GridBagConstraints();

      // Fill the layout with placeholders
      for (int row = 0; row < 20; row++) {
          for (int col = 0; col < 15; col++) {
              constraints.gridx = col;
              constraints.gridy = row;
              constraints.weightx = 1.0;
              constraints.weighty = 1.0;
              constraints.fill = GridBagConstraints.BOTH;

              Component filler = Box.createRigidArea(new Dimension(0, 0));
              panel.add(filler, constraints);
          }
      }

      constraints.weightx = 0;
      constraints.weighty = 0;
      constraints.fill = GridBagConstraints.NONE;
      constraints.anchor = GridBagConstraints.NORTHWEST;


      JRadioButton radio_button_2 = new JRadioButton("DARK");
      JRadioButton radio_button_1 = new JRadioButton("MEDIUM");
      JRadioButton radio_button_none = new JRadioButton("none");
      JRadioButton radio_button_milk = new JRadioButton("Milk");
      JRadioButton radio_button_heavy = new JRadioButton("heavy cream");
      JRadioButton radio_button_syrup = new JRadioButton("classic syrup");
      JRadioButton radio_button_0 = new JRadioButton("LIGHT");
      radio_button_0.setPreferredSize(new Dimension(99, 16));
      radio_button_0.setSelected(false);
      constraints.gridx = -6;
      constraints.gridy = 5;
      constraints.gridwidth = 4;
      constraints.gridheight = 4;
      panel.add(radio_button_0, constraints);

      radio_button_0.addActionListener((ActionListener)new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){





          //shut off buttons
            radio_button_1.setEnabled(false);
            radio_button_2.setEnabled(false);                                   


          } 



      });

      //JRadioButton radio_button_1 = new JRadioButton("MEDIUM");
      radio_button_1.setPreferredSize(new Dimension(99, 16));
      radio_button_1.setSelected(false);
      constraints.gridx = -6;
      constraints.gridy = 6;
      constraints.gridwidth = 4;
      constraints.gridheight = 4;
      panel.add(radio_button_1, constraints);

      radio_button_1.addActionListener((ActionListener)new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){

          radio_button_0.setEnabled(false);
          radio_button_2.setEnabled(false);                                   


        }
      });



      //JRadioButton radio_button_2 = new JRadioButton("DARK");
      radio_button_2.setPreferredSize(new Dimension(99, 16));
      radio_button_2.setSelected(false);
      constraints.gridx = -6;
      constraints.gridy = 8;
      constraints.gridwidth = 4;
      constraints.gridheight = 4;
      panel.add(radio_button_2, constraints);

      radio_button_2.addActionListener((ActionListener)new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
          radio_button_0.setEnabled(false);
          radio_button_1.setEnabled(false);                                   


        }
      });
      //JRadioButton radio_button_milk = new JRadioButton("MILK");
    radio_button_milk.setPreferredSize(new Dimension(99, 16));
    radio_button_milk.setSelected(false);
    constraints.gridx = 0;
    constraints.gridy = 10;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_milk, constraints);

    radio_button_milk.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){

        radio_button_heavy.setEnabled(false);
        radio_button_syrup.setEnabled(false);      
        radio_button_none.setEnabled(false);                             


      }
    });



    //JRadioButton radio_button_heavy = new JRadioButton("heavy");
    radio_button_heavy.setPreferredSize(new Dimension(99, 16));
    radio_button_heavy.setSelected(false);
    constraints.gridx = -1;
    constraints.gridy = 10;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_heavy, constraints);

    radio_button_heavy.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){

        radio_button_milk.setEnabled(false);
        radio_button_syrup.setEnabled(false);    
        radio_button_none.setEnabled(false);                               


      }
    });

    //JRadioButton radio_button_syrup = new JRadioButton("syrup");
    radio_button_syrup.setPreferredSize(new Dimension(99, 16));
    radio_button_syrup.setSelected(false);
    constraints.gridx = 0;
    constraints.gridy = 14;
    constraints.gridwidth = 4;
    constraints.gridheight = 4;
    panel.add(radio_button_syrup, constraints);
    radio_button_syrup.addActionListener((ActionListener)new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){

        radio_button_heavy.setEnabled(false);
        radio_button_milk.setEnabled(false);                  
        radio_button_none.setEnabled(false);                 


      }
    });



      JButton button_0 = new JButton("CLEAR");
      button_0.setPreferredSize(new Dimension(54, 27));

      constraints.gridx = -6;
      constraints.gridy = 12;
      constraints.gridwidth = 2;
      constraints.gridheight = 2;
      panel.add(button_0, constraints);
      button_0.addActionListener((ActionListener)new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){

          radio_button_0.setEnabled(true);
          radio_button_1.setEnabled(true);     
          radio_button_2.setEnabled(true);     
          radio_button_milk.setEnabled(true);     
          radio_button_heavy.setEnabled(true); 
          radio_button_syrup.setEnabled(true); 
          radio_button_none.setEnabled(true);                           


        }
      });

      JButton button_1 = new JButton("SAVE");
      button_1.setPreferredSize(new Dimension(200, 100));

      constraints.gridx = -6;
      constraints.gridy = 15;
      constraints.gridwidth = 2;
      constraints.gridheight = 2;
      panel.add(button_1, constraints);


      //action listener that opens  final frame
      button_1.addActionListener((ActionListener) new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
          //info and choices into an array list 
          //array <object> = new array(parameters)

          JFrame frame = new JFrame("Final window");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(600, 400);

          JPanel panel = new JPanel(new GridBagLayout());
          GridBagConstraints constraints = new GridBagConstraints();

          // Fill the layout with placeholders
          for (int row = 0; row < 20; row++) {
              for (int col = 0; col < 15; col++) {
                  constraints.gridx = col;
                  constraints.gridy = row;
                  constraints.weightx = 1.0;
                  constraints.weighty = 1.0;
                  constraints.fill = GridBagConstraints.BOTH;

                  Component filler = Box.createRigidArea(new Dimension(0, 0));
                  panel.add(filler, constraints);
              }
          }

          constraints.weightx = 0;
          constraints.weighty = 0;
          constraints.fill = GridBagConstraints.NONE;
          constraints.anchor = GridBagConstraints.NORTHWEST;


          JTextArea final_order = new JTextArea(15, 20);
          final_order.setPreferredSize(new Dimension(100, 51));
          final_order.setEditable(false);
          constraints.gridx = 0;
          constraints.gridy = 10;
          constraints.gridwidth = 4;
          constraints.gridheight = 4;
          panel.add(final_order, constraints);

          final_order.append("This is your order " + text_field_0.getText() );


        frame.add(panel);
        frame.setVisible(true);


        ArrayList <Customer> regularList = new ArrayList<>();
        //parameter should be first name, last name, phone number, coffee type, total
        Regular regular = new Regular(firstName, lastName, phoneNumber, phoneNumber);
      Coffee coffee = new Coffee(firstName, lastName, phoneNumber, phoneNumber);
      //Premium premium = new Premium(firstName, lastName, phoneNumber, n);
      regularList.add(regular);

        for(Customer customer :regularList){
          final_order.append(customer.toString());

          {
            if (radio_button_2.isSelected()) {
              final_order.append((coffee.getdarkRoast()));

            };
            if(radio_button_0.isSelected()){
              final_order.append((coffee.getlightRoast()));
            }
            if(radio_button_1.isSelected()){
              final_order.append((coffee.getmediumRoast()));
            };
            if(radio_button_none.isSelected()){
              final_order.append((coffee.getNone()));
            };
            if(radio_button_heavy.isSelected()){
              final_order.append((coffee.getHeavyCream()));
            };
            if(radio_button_syrup.isSelected()){
              final_order.append((coffee.getSyrup()));
            }
            if(radio_button_milk.isSelected()){
              final_order.append((coffee.getHeavyCream()));
            }
            //final_order.getText();
            //Premium premium = new Premium(phoneNumber, phoneNumber, phoneNumber, n);
            //premium.prepare(phoneNumber);
            //final_order.append(coffee.prepare());
        }
      }
    }

    });






      frame.add(panel);
      frame.setVisible(true);
    }
  });

        //espresso menu (premium)

        JButton button_espresso = new JButton("ESPRESSO");
        button_espresso.setPreferredSize(new Dimension(120, 119));

        constraints.gridx = 1;
        constraints.gridy = 11;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(button_espresso, constraints);

        JLabel label_ce = new JLabel("COFFEE OR ESPRESSO?");
        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        panel.add(label_ce, constraints);

        frame.add(panel);
        frame.setVisible(true);



        // espresso menu


        button_espresso.addActionListener((ActionListener)new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){


        JFrame frame = new JFrame("ESPRESSO");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600, 400);

      JPanel panel = new JPanel(new GridBagLayout());
      GridBagConstraints constraints = new GridBagConstraints();

      // Fill the layout with placeholders
      for (int row = 0; row < 20; row++) {
          for (int col = 0; col < 15; col++) {
              constraints.gridx = col;
              constraints.gridy = row;
              constraints.weightx = 1.0;
              constraints.weighty = 1.0;
              constraints.fill = GridBagConstraints.BOTH;

              Component filler = Box.createRigidArea(new Dimension(0, 0));
              panel.add(filler, constraints);
          }
      }

      constraints.weightx = 0;
      constraints.weighty = 0;
      constraints.fill = GridBagConstraints.NONE;
      constraints.anchor = GridBagConstraints.NORTHWEST;




      JRadioButton radio_button_1 = new JRadioButton("MOCHA");
      JRadioButton radio_button_2 = new JRadioButton("AMERICANO");
      //JRadioButton radio_button_mocha = new JRadioButton("Mocha");
      JRadioButton radio_button_whole = new JRadioButton("Whole Milk");
      JRadioButton radio_button_almond = new JRadioButton("Almond Milk");
      JRadioButton radio_button_whip = new JRadioButton("Whipped Cream");
      JRadioButton radio_button_none = new JRadioButton("none");
      JRadioButton radio_button_0 = new JRadioButton("LATTE");
      radio_button_0.setPreferredSize(new Dimension(99, 16));
      radio_button_0.setSelected(false);
      constraints.gridx = -6;
      constraints.gridy = 5;
      constraints.gridwidth = 4;
      constraints.gridheight = 4;
      panel.add(radio_button_0, constraints);


            radio_button_0.addActionListener((ActionListener)new ActionListener(){
              @Override
              public void actionPerformed(ActionEvent e){
                radio_button_1.setEnabled(false);
                radio_button_2.setEnabled(false);

              }
            });

            //use method from a class?



      //JRadioButton radio_button_1 = new JRadioButton("AMERICANO");
      radio_button_1.setPreferredSize(new Dimension(99, 16));
      radio_button_1.setSelected(false);
      constraints.gridx = -6;
      constraints.gridy = 6;
      constraints.gridwidth = 4;
      constraints.gridheight = 4;
      panel.add(radio_button_1, constraints);

      radio_button_1.addActionListener((ActionListener)new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
          radio_button_0.setEnabled(false);
       radio_button_2.setEnabled(false);

        }
      });


      //medium action listener 

      //JRadioButton radio_button_2 = new JRadioButton("CAPPUCINO ");
      radio_button_2.setPreferredSize(new Dimension(99, 16));
      radio_button_2.setSelected(false);
      constraints.gridx = -6;
      constraints.gridy = 8;
      constraints.gridwidth = 4;
      constraints.gridheight = 4;
      panel.add(radio_button_2, constraints);


      radio_button_2.addActionListener((ActionListener)new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){


          radio_button_0.setEnabled(false);
          radio_button_1.setEnabled(false);


        }

      });

      //whole milk
      radio_button_whole.setPreferredSize(new Dimension(99, 16));
        radio_button_whole.setSelected(false);
        constraints.gridx = 3;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(radio_button_whole, constraints);
        radio_button_whole.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
           radio_button_almond.setEnabled(false);


          }
        });
// almond milk
         radio_button_almond.setPreferredSize(new Dimension(99, 16));
        radio_button_almond.setSelected(false);
        constraints.gridx = 3;
        constraints.gridy = 7;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(radio_button_almond, constraints);

        radio_button_almond.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
           radio_button_whole.setEnabled(false);

          }
        });

      //whip cream
        radio_button_whip.setPreferredSize(new Dimension(99, 16));
        radio_button_whip.setSelected(false);
        constraints.gridx = 6;
        constraints.gridy = 1;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(radio_button_whip, constraints);
        radio_button_whip.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
           radio_button_none.setEnabled(false);
          }
        });

        radio_button_none.setPreferredSize(new Dimension(99, 16));
        radio_button_none.setSelected(false);
        constraints.gridx = 6;
        constraints.gridy = 4;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(radio_button_none, constraints);
        radio_button_none.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e){
           radio_button_almond.setEnabled(false);
           radio_button_whole.setEnabled(false);
           radio_button_whip.setEnabled(false);


          }
        });



      JButton button_0 = new JButton("CLEAR");
      button_0.setPreferredSize(new Dimension(54, 27));

      constraints.gridx = -6;
      constraints.gridy = 12;
      constraints.gridwidth = 2;
      constraints.gridheight = 2;
      panel.add(button_0, constraints);

      button_0.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        radio_button_0.setEnabled(true);
        radio_button_1.setEnabled(true);
        radio_button_2.setEnabled(true);
        radio_button_almond.setEnabled(true);
        radio_button_none.setEnabled(true);
        radio_button_whip.setEnabled(true);
        radio_button_whole.setEnabled(true);

        }
      });


      //clear action listener

      JButton button_1 = new JButton("SAVE");
      button_1.setPreferredSize(new Dimension(200, 100));

      constraints.gridx = -6;
      constraints.gridy = 15;
      constraints.gridwidth = 2;
      constraints.gridheight = 2;
      panel.add(button_1, constraints);


      button_1.addActionListener((ActionListener) new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
          //info and choices into an array list 
          //array <object> = new array(parameters)

          JFrame frame = new JFrame("Final window");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(600, 400);

          JPanel panel = new JPanel(new GridBagLayout());
          GridBagConstraints constraints = new GridBagConstraints();

          // Fill the layout with placeholders
          for (int row = 0; row < 20; row++) {
              for (int col = 0; col < 15; col++) {
                  constraints.gridx = col;
                  constraints.gridy = row;
                  constraints.weightx = 1.0;
                  constraints.weighty = 1.0;
                  constraints.fill = GridBagConstraints.BOTH;

                  Component filler = Box.createRigidArea(new Dimension(0, 0));
                  panel.add(filler, constraints);
              }
          }

          constraints.weightx = 0;
          constraints.weighty = 0;
          constraints.fill = GridBagConstraints.NONE;
          constraints.anchor = GridBagConstraints.NORTHWEST;


          JTextArea final_order = new JTextArea(15, 20);
          final_order.setPreferredSize(new Dimension(100, 51));
          final_order.setEditable(false);
          constraints.gridx = 0;
          constraints.gridy = 10;
          constraints.gridwidth = 4;
          constraints.gridheight = 4;
          panel.add(final_order, constraints);

          final_order.append("This is your order " + text_field_0.getText() );

        frame.add(panel);
        frame.setVisible(true);


        ArrayList <Customer> premiumList = new ArrayList<>();
        //parameter should be first name, last name, phone number, coffee type, total
        Regular regular = new Regular(firstName, lastName, phoneNumber, phoneNumber);
        Espresso espresso = new Espresso(firstName, lastName,phoneNumber);
      premiumList.add(regular);

        for(Customer customer :premiumList){
          final_order.append(customer.toString());

          {
            if (radio_button_2.isSelected()) {
              final_order.append((espresso.getMocha()));
            };
            if(radio_button_0.isSelected()){
              final_order.append((espresso.getLatte()));
            }
            if(radio_button_1.isSelected()){
              final_order.append((espresso.getMocha()));
            };
            if(radio_button_none.isSelected()){
              final_order.append((espresso.getNone()));
            };
            if(radio_button_whole.isSelected()){
              final_order.append((espresso.getWhole()));
            };
            if(radio_button_whip.isSelected()){
              final_order.append((espresso.getWhip()));
            }
            if(radio_button_almond.isSelected()){
              final_order.append((espresso.getAlmond()));
            }
        }
      }
    }

    });

      //save action listener 


      
      frame.add(panel);
      frame.setVisible(true);
    }
  }
        );
    }
    }



          }

        }

          );
        }
      }
    });}}












