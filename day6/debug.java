public class debug {
  
public class LearnjavaBasics // x Wrong: Class name can't contain spaces

// 2. x Wrong: Missing opening brace
// x Wrong: Class body not opened with {

public static void main(String []args) // x Wrong: Incorrect main method syntax

// 4. x Wrong: Invalid variable name and missing semicolon
int numOne = 5 // x Wrong: No space in variable names, missing semicolon

// 5. x Wrong: Type mismatch
double marks = "95.5"; // x Wrong: Assigning String to double

// 6. x Wrong: Value too big for int
int smallNum = 1234567890123; // x Wrong: Value exceeds int range

// 7. > Correct but confusing: Shows type casting
float f = (int)10.75; // > Correct: Type cast to int, but value truncated

// 8. x Wrong: Type promotion causes error
byte b = 10;
b = b + 1; // x Wrong: b + 1 is int, needs cast back to byte

// 9. x Wrong: Final variable cannot be changed
final double PI = 3.14;
PI = 3.1415; // x Wrong: Cannot reassign final variable

// 10. x Wrong: Wrong string syntax
String s1 = 'Hello'; // x Wrong: Use double quotes for strings

// 11. x Wrong: Comparing strings using ==
String name1 = "Ranjith";
String name2 = new String("Ranjith");
if(name1 == name2) {
    System.out.println("Names match"); // x Wrong: Use .equals() for content comparison
}

// 12. x Wrong: Incorrect array declaration
int[5] numbers = {1, 2, 3, 4, 5}; // x Wrong: Size not allowed in this way

// 13. x Wrong: Array index out of bounds
System.out.println(numbers[5]); // x Wrong: Index 5 does not exist

// 14. x Wrong: Variable not declared
System.out.println(age); // x Wrong: 'age' not defined

// 15. x Wrong: Invalid operator
System.out.println(a => b); // x Wrong: Should be a >= b

// 16. x Wrong: Assignment instead of condition
if(a = b) { // x Wrong: Use == for comparison
    System.out.println("Equal");
}

// 17. x Wrong: Misleading block logic
if(a > b)
    System.out.println("A is greater");
    System.out.println("This always prints"); // x Wrong: Needs braces

// 18. x Wrong: Logical operator misuse
if(a && b) { // x Wrong: Not boolean expressions
    System.out.println("Error");
}

// 19. > Correct logic but x Poor formatting
int score = 85;
if(score > 90)
    System.out.println("A grade");
else
    if(score > 75)
    System.out.println("B grade");
    else
    System.out.println("C grade"); // x Wrong: Confusing indentation

// 20. x Wrong: Declaration inside loop without braces
for(int i = 0; i < 5; i++) 
    int temp = i * 2; // x Wrong: Must use {}

int[] nums = {1, 2, 3};
// 21. > Correct syntax but x Logic doesn't change original array
for(int x : nums) 
    x = x * 2; // x Wrong: This won't modify nums array

// 22. x Wrong: Infinite loop logic
int i = 0;
while(i != 10) {
    i = i + 2; // x Wrong: Will never be exactly 10
}

// 23. x Wrong: Invalid operator
while(i => 0) { // x Wrong: Invalid syntax, should be >=
    i--;
}

// 24. x Wrong: Unused variable
int unused = 100; // x Wrong: Not used

// 25. x Wrong: Bad formatting
String name="Ranjith";System.out.println( "Welcome "+name);// x Wrong: Messy formatting

// 26. > Valid but confusing
int sum, Sum, sUm; // > Correct but not recommended

// 27. x Wrong: Uninitialized local variable
int result;
System.out.println(result); // x Wrong: Must initialize before use

// 28. x Wrong: Return outside of method
return 0; // x Wrong: Can't return outside method

// 29. > Legal but confusing
public static void main(String args[]) {
    System.out.println("Main 2"); // > Works, but avoid multiple mains unnecessarily
}

// 30. x Wrong: Variable redeclared
int x = 10;
int x = 20; // x Wrong: Already declared

// 31. x Wrong: Invalid modifier combination
private public int value = 5; // x Wrong: Cannot combine private and public

// 32. x Wrong: Incomplete method
public void greet(String name // x Wrong: Missing closing parenthesis and method body

// 33. x Wrong: Wrong return type
public String getAge() {
    return 25; // x Wrong: Returning int, should return String
}

// 34. x Wrong: Calling non-static from static
public void sayHello() {
    System.out.println("Hello!");
}
public static void main(String args[]) {
    sayHello(); // x Wrong: Non-static method called from static context
}

// 35. x Wrong: Wrong method name
int max = Math.Max(5, 10); // x Wrong: Should be Math.max

// 36. x Wrong: Ternary operator incomplete
String eligible = (age > 18) ? "Yes" : ; // x Wrong: Missing false value

// 37. > Valid syntax
for(; i < 5; i++) {
    System.out.println(i); // > Correct: init is optional in for-loop
}

// 38. x Wrong: Cannot add char and String directly like this
char ch = 'a';
int num = ch + "1"; // x Wrong: Cannot add char and String like this

// 39. x Wrong: Looping error
int arr[] = {10, 20, 30};
for(int j = 1; j <= arr.length; j++) {
    System.out.println(arr[j]); // x Wrong: Index out of range, use j = 0 and j < length
}

// 40. > Correct single-line for loop
for(int k = 0; k < 5; k++) System.out.println("K=" + k); // > Correct

// 41. x Wrong: NullPointerException
String s2 = null;
System.out.println(s2.length()); // x Wrong: Will throw exception

// 42. x Wrong: == used instead of equals
String a1 = "java";
String a2 = "JAVA";
if(a1.toLowerCase() == a2.toLowerCase()) {
    System.out.println("Equal"); // x Wrong: Use .equals() for comparison
}

// 43. x Wrong: Extra semicolon ends if
if(score > 90); {
    System.out.println("Excellent"); // x Wrong: Semicolon terminates if prematurely
}

// 44. x Wrong: Invalid escape sequence
System.out.println("Path: C:\newfolder"); // x Wrong: Use double backslashes (\\)

// 45. > Valid but tricky logic
String output = "Value: " + 5 + 3; // > Result: Value: 53 (left to right)


// 46. > Correct ternary nesting but complex
int val = 5;
String msg = val < 10 ? val > 3 ? "Good" : "Bad" : "Okay"; // > Valid, but hard to read

// 47. x Wrong: Variable redeclared
int data = 5;
{
    int data = 10; // x Wrong: Already declared in same scope
}

// 48. x Wrong: Can't increment boolean
boolean flag = true;
flag++; // x Wrong: ++ not valid on boolean

// 49. x Wrong: String remains unchanged
String test = "abc";
test.concat("def");
System.out.println(test); // x Wrong: concat() returns new String, original unchanged

// 50. x Wrong: 'continue' used outside loop
continue; // x Wrong: Only valid inside loops
}
