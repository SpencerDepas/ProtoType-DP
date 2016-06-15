# ProtoType-DP

Creational pattern 

The prototype pattern is used for creating objects by cloning other objects.

This is often used when the creation of an object is expensive. Like the retrieval of information from a database. WIth the clone we can then modify the data.

Description
This pattern is like a master record. You have one master that has all the finished work. You then copy the master to make duplicates for the masses. You do not spend time recreating and mixing the record again to make a new record.


USAGE
The prototype pattern is good to use when you need a copy of an object but you can't afford the run time to make a new one.


BENEFITS
You do not need to use the expensive new paramter.


QUESTIONS
Why can I not just copy?


shallow copying:
shallow copying creates a new instance of the same class and copies all the fields to the new instance and returns it. Object class provides a clone method and provides support for the shallow copying.
  



Deep copying:
A deep copy occurs when an object is copied along with the objects to which it refers. Below image shows obj1 after a deep copy has been performed on it. Not only has obj1 been copied, but the objects contained within it have been copied as well. We can use Java Object Serialization to make a deep copy. Unfortunately, this approach has some problems too(detailed examples). 


Notes

*Java Clone is not reliable.
