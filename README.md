# Thingworx-WebServer-Requests
Wrapper for requests to android webserver for Thingworx

# Create new Text object

     Text t = new Text(1) //An id parameter is required to be able to update/delete objects
                .setText("testing") //text to display
                .setColor(255,0,0) //text color
                .setSize(10) //text size
                .setX(10) //X coordinate
                .setY(50) // Y coordinate
                .add(); //add object

# Update existing text object

        t.setText("updated text").setColor(0,0,255).update(); //update object

# Delete existing text object

        t.delete(); //delete object

# Create new Image object

        Image i = new Image(2) //An id parameter is required to be able to update/delete objects
                .setUrl("https://theowinter.ch/images/headers/helloworld.jpg") //Image to add
                .setX(50) // X coordinate
                .setY(100) // Y coordinate
                .add(); //add object

# Update existing Image object

        i.setX(70).setY(100).update(); //update object

# Delete existing Image Object

      i.delete(); //delete object
