# JavaQAP3

Java QAP 3 - Inheritance 
Due November 21, 2024

# Problem 1:

**Person** - abstract superclass

attributes: name, age, gender 

implement constructors, getters, setters and methods for Person.java

**Teacher** - subclass (extends from Person)

attributes: subject, salary
attributes also include those initialized in Person

implement constructors, getters, setters and methods for Teacher.java

**Student** - subclass (extends from Person and inherited by CollegeStudent)

attributes: idNum, GPA
attributes also include those initialized in Person

implement constructors, getters, setters and methods for Student.java

**CollegeStudent** - subclass (inherits both Person and Student classes)

attributes: major, year
attributes also include those initialized in Person

implement constructors, getters, setters and methods for CollegeStudent.java

<img width="225" alt="image" src="https://github.com/user-attachments/assets/642e30cf-11bb-499c-9666-ca07f79cbcbd">


*initalize attributes for each subclass inlcuding those specified in the superclass Person, a toString() method in each subclass with the superclass toString() implemented and create objects for each class in a Demo.java. include screenshot of output in the problem1 folder.*

# Problem 2: 

**Point** - abstract superclass

attributes: x, y

implement constructors, getters, setters and methods for Point.java

**MoveablePoint** - subclass (extends from Point)

attributes: xSpeed, ySpeed 
attributes also include those initialized in Person

implement constructors, getters, setters and methods for MoveablePoint.java

<img width="468" alt="image" src="https://github.com/user-attachments/assets/ec3c9fc7-75e1-4a57-ab06-4f9685c9a868">

*initialzie attributes for MoveablePoint subclass including those specifed in Point superclass, a toString() method in each class and a Demo.java which created new Point and MoveablePoint objects, implements methods and displays results to the terminal. include screenshot of output in the problem2 folder.*

# Problem 3

**Shape** - abstract superclass

attributes: name

implement constructor, initialize abstract methods and toString() method to display Shape values.

**Circle** - subclass (extends from Shape

attributes: radius
attributes also include those initialized in Shape

implement constructor and abstract methods in Circle.java

**Ellipse** - subclass (extends from Shape)

attributes: majorAxis, minorAxis 
attributes also include those initialized in Shape

implement constructor and abstract methods in Ellipse.java

**Triangle** - subclass (extends from Shape)

attributes: side1, side2, side3
attributes also include those initialized in Shape

implement constructor and abstract methods in Triangle.java

**EquilateralTriangle** - subclass (inherits both Triangle and Shape)

attributes: side
attributes also include those initialized in Shape

implement constructor and abstract methods in EquilateralTriangle.java

![image](https://github.com/user-attachments/assets/98127012-7b59-4406-b704-4f573b1e6583)

*initalize attributes including those defined in the super class in each subclass, calculate perimeter and area for each subclass with the appropriate forumals for the corresponding shape. In Demo.java, create shape objects for each shape and display their perimeters and areas.*

# Problem 4 

*this problem includes all content from problem 3 including the implementation of a scaling interface.*

**Scalable.java** - Interface

scales an object (Shape) by a factor provided by the user.

**Shape** - abstract superclass (implements Scalable)

attributes: name

implement constructor, initialize abstract methods and toString() method to display Shape values.

**Circle** - subclass (extends from Shape

attributes: radius
attributes also include those initialized in Shape

implement constructor, abstract methods and a scale method to multiply radius by given factor in Circle.java

**Ellipse** - subclass (extends from Shape)

attributes: majorAxis, minorAxis 
attributes also include those initialized in Shape

implement constructor, abstract methods and scale method to multiply axis' by given factor in Ellipse.java

**Triangle** - subclass (extends from Shape)

attributes: side1, side2, side3
attributes also include those initialized in Shape

implement constructor, abstract methods and scale method to multiply sides by given factor in Triangle.java

**EquilateralTriangle** - subclass (inherits both Triangle and Shape)

attributes: side
attributes also include those initialized in Shape

implement constructor and abstract methods in EquilateralTriangle.java

![image](https://github.com/user-attachments/assets/dfb6e9ce-bae8-4bea-981e-f622254c7d70)

*initalize attributes including those defined in the super class in each subclass, calculate perimeter and area for each subclass with the appropriate forumals for the corresponding shape, and implement the scalable interface in classes that require it. In Demo.java, create shape objects for each shape and display their perimeters and areas before and after scaling.*
