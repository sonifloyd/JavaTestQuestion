# Annotation in java
Annotations start with ‘@’.
Annotations do not change action of a compiled program.
Annotations help to associate metadata (information) to the program elements i.e. instance variables, constructors, 
methods, classes, etc.
Annotations are not pure comments as they can change the way a program is treated by compiler.
# Categories of Annotations
1)Marker Annotations:
The only purpose is to mark a declaration. These annotations contain no members and do not consist any data. 
Thus, its presence as an annotation is sufficient. Since, marker interface contains no members, simply determining 
whether it is present or absent is sufficient. @Override is an example of Marker Annotation.
Example: - @TestAnnotation()

2)Single value Annotations:
These annotations contain only one member and allow a shorthand form of specifying the value of the member. 
We only need to specify the value for that member when the annotation is applied and don’t need to specify the name of
the member. However in order to use this shorthand, the name of the member must be value.
Example: - @TestAnnotation(“testing”);

3)Full Annotations:
These annotations consist of multiple data members/ name, value, pairs.
Example:- @TestAnnotation(owner=”Rahul”, value=”Class Geeks”)

Java defines seven built-in annotations.
Four are imported from java.lang.annotation: @Retention, @Documented, @Target, and @Inherited.
Three are included in java.lang: @Deprecated, @Override and @SuppressWarnings

