#!/bin/bash
cd src
javac -d ../bin *.java
cd ../bin
jar cfmv ../SimulationGame.jar ../manifest.txt *.class
