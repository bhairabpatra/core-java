package org.exception.handel.innerclass;

public class Outer {
    private static int age = 20;
    private String name = "bhairab";

    class inner {
        void display() {
            System.out.println("This is inner class - " + name);

        }

        static class StaticClass {
            public void StaticNested() {
                System.out.println("This is Static Nested Class:" + age);
            }
        }

        public void localInner() {
            int localVar = 30;
            class localInnerClass {
                void display() {
                    System.out.println("This is localInner class  -> " + (localVar + 10));
                }
            }
            localInnerClass localInnerClass = new localInnerClass();
            localInnerClass.display();
        }

        void anonymousInnerClass() {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Anonymous inner class implementing Runnable");
                }
            }).start();

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Inside run method of anonymous inner class");
                }
            };

            // Thread ka constructor jisme runnable object pass kiya gaya hai
            Thread thread = new Thread(runnable);
            thread.start();
        }

        public static void main(String[] args) {
            Outer outer = new Outer();
            inner inner = outer.new inner();

            inner.display();
            int age1 = outer.age;


        }
    }
    }
//    Member Inner Class:
//        This is the most common type of inner class.
//        It is defined at the member level of a class, just like methods or variables.
//        It can access all members of the outer class (including private members) and can be instantiated only with an instance of the outer class.
//
//
//    Static Nested Class:
//        This type of inner class is also defined at the member level of a class, but it is declared as static.
//        This means it can be instantiated without an instance of the outer class.
//        It cannot access non-static members of the outer class.
//
//    Local Inner Class:
//        This class is defined within a block of code, typically within a method body.
//        It has access to all members of the enclosing class and can also access local variables of the enclosing method
//	      if they are final or effectively final.
//
//
//    Anonymous Inner Class:
//        This is a special type of local inner class that does not have a name.
//        It is typically used for implementing interfaces or extending classes on the fly.