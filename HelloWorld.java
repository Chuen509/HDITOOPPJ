/*********************************************
* Student: AU B.C. Dick (10682468), AENG-CS
* Course: OOP 2015 Semester 1
*
* HelloWorld.java: To print "Hello World" on the screen
**********************************************/


class HelloWorld { 
     public static void main(String[ ] args){ 
          System.out.print("Hello, Dr. Caffeine.");

          System.out.print("How do you do? ");
          System.out.print("My name is");
          System.out.print("Seattle Slew.");

          System.out.println("How do you do? ");
          System.out.println("My name is");
          System.out.println("Seattle Slew.");

          String name;
          name = new String("Espresso");
          System.out.println("Display by normal"); // normal
          System.out.println(name);

          System.out.println("Display by using method substring");
          System.out.println(name.substring(2,7));

          System.out.println("Display the length of the string by using methoh length()");
          System.out.println(name.length( ));

          int a, b, c = 1;
          a = b = 3;//c = 3;
          System.out.println("---------");
          System.out.println(a + " - " + b + " - " + c+ " - ");

          String text;
          text = new String();
          text = "I Love Java and Java loves me.";
          System.out.println("------------");
          System.out.println("Locate the index position of a substring by useing method indexOf");
          System.out.println("The substring is \" " + text + " \"-----");
          System.out.println("the position of \"J\" is " + text.indexOf("J"));
          System.out.println("the position of \"love\" is " + text.indexOf("love"));

          text = "test" + 1 + 2;
          System.out.println(text);
          text = 1 + 2 + "test";
          System.out.println(text);

     } 
}
