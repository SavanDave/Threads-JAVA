# Threads-JAVA

The code here is an example of runing multiple Thread objects together to simulate an event and gather meaningful information. 

In this case the event is a race between a rabbit and turtle, and the simulation returns the positiion and speed of each animal. In addition the rabbit and turtle objects will stop to eat, and the simulation will tell us when the animal has started eating and when it is done eating. 

Animal.java contains the run method for the Animal objects as well as the accessor and mutator methods of the the Animal class instance variables (food, position, speed). 

RaceTest.java runs the threads as well as instantiates the thread objects. 
