### Know your Java version
    java --version

#### Note: Classpath is where our java classes are.

### Ways to run our Java classes
### First go to src dir
cd src

javac Main.java

java Main

### you can also run it directly from project root directory
javac ./src/Main.java

java -classpath ./src Main

### Now Playing with Package Test
javac ./src/Test/Main.java

java -classpath ./src Test.Main


### Now create a class called Test1 with Package A.B.C but put it in src dir
javac ./src/Test1.java

it compiles fine but we can not run it.

java -classpath ./src A.B.C.Test1

