# www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html


JFXLIB = ../project3/lib
JFXMOD = javafx.controls,javafx.fxml

JC = java
.SUFFIXES: .java .class

.java.class:
	$(JC) --enable-native-access=javafx.graphics --module-path $(JFXLIB) --add-modules $(JFXMOD) $*.java

CLASSES = \
	src/FXDriver.java \
	src/FXMainPane.java \
	src/CryptoManager.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
