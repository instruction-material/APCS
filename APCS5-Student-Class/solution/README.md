# Student class reference

Run `javac Main.java Student.java && java Main`. The four examples move from elementary to middle school, middle to high school, and high school to college. A grade of 13 stays at college.

The constructor initializes the two names and starting grade. The grade is private and changes only through `passGrade`. The school type is computed from the current grade, so an advancement does not require updating a separate property.
