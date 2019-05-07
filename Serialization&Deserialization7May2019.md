# Serialization and Deserialization
Serialization is a mechanism of converting the state of an object into a byte stream. 
Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. 
This mechanism is used to persist the object.

The byte stream created is platform independent. 
So, the object serialized on one platform can be deserialized on a different platform.

To make a Java object serializable we implement the java.io.Serializable interface.
The ObjectOutputStream class contains writeObject() method for serializing an Object.
public final void writeObject(Object obj)
                       throws IOException
  The ObjectInputStream class contains readObject() method for deserializing an object.
  public final Object readObject()
                  throws IOException,
               ClassNotFoundException
# Advantages of Serialization
1. To save/persist state of an object.
2. To travel an object across a network.

Serializable is a marker interface (has no data member and method). It is used to “mark” java classes so 
that objects of these classes may get certain capability. Other examples of marker interfaces are:- Cloneable and Remote.
# Points to remember
1. If a parent class has implemented Serializable interface then child class doesn’t need to implement it 
but vice-versa is not true.
2. Only non-static data members are saved via Serialization process.
3. Static data members and transient data members are not saved via Serialization process.So, if you don’t want to save 
value of a non-static data member then make it transient.
4. Constructor of object is never called when an object is deserialized.
5. Associated objects must be implementing Serializable interface.


