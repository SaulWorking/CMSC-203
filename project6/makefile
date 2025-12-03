# www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html


JFXLIB = ../javaFX/lib
JFXMOD = javafx.controls

JC = java
.SUFFIXES: .java .class

.java.class:
	$(JC) $*.java

CLASSES = \
  	  src/CircusDriverApp.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
